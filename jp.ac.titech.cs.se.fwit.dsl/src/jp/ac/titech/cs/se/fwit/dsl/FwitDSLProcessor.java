package jp.ac.titech.cs.se.fwit.dsl;

import java.io.File;
import jp.ac.titech.cs.se.fwit.core.derivation.UsageDeriver;
import jp.ac.titech.cs.se.fwit.core.model.fw.Framework;
import jp.ac.titech.cs.se.fwit.core.model.fw.FrameworkTemplate;
import jp.ac.titech.cs.se.fwit.dsl.visitor.FrameworkNameRetriever;
import jp.ac.titech.cs.se.fwit.dsl.visitor.FwitFileParser;

import org.apache.commons.cli.BasicParser;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionBuilder;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

public class FwitDSLProcessor {
    public static Log logger = LogFactory.getLog(FwitDSLProcessor.class);

    private final String file;
    private String outDir;
    private final Framework fw;
    private String metric;

    private final String currentDir;

    public static void main(String[] args) {
        final CommandLine cmd = parseCommandLine(args);
        final String file = cmd.getArgs()[0];

        init();
        try {
            final Framework fw = FrameworkNameRetriever
            .retrieveFrameworkFromJar(file);
            final FwitDSLProcessor processor = new FwitDSLProcessor(file,
                    getOutputDir(cmd), fw, getMetric(cmd));
            processor.process();
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(-1);
        }
    }

    /**
     * 
     * @param file
     *            requirements specification file
     * @param outDir
     *            a path to a directory where generated files are stored
     * @param metric
     *            metric to select usages of frameworks
     * @throws Exception
     */
    public static void processInPlugin(String file, String outDir, String metric)
    throws Exception {
        init();
        try {
            final String fwName = FrameworkNameRetriever.retrieveFrameworkName(file);
            final Framework fw = ExtensionLoader.loadFramework(fwName);
            final FwitDSLProcessor processor = new FwitDSLProcessor(file, outDir, fw,
                    null);
            processor.process();
        } catch (final Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public FwitDSLProcessor(String file, String outDir, Framework fw,
            String metric) {
        this.currentDir = file.substring(0, file.lastIndexOf(File.separator)+1);
        this.file = file;
        this.outDir = outDir;
        this.fw = fw;
        this.metric = metric;
    }

    private static void init() {
        new FwitRequirementsModelStandaloneSetup()
        .createInjectorAndDoEMFRegistration();
    }

    private void process() {

        preporcess();

        final ResourceSet rs = new ResourceSetImpl();
        final Resource resource = rs.getResource(URI.createURI(file), true);
        final EObject eobject = resource.getContents().get(0);

        final FwitFileParser parser = new FwitFileParser(fw, currentDir);
        parser.doSwitch(eobject);

        final UsageDeriver deriver = new UsageDeriver();
        final FrameworkTemplate customizedFW = deriver.getCustomizedTemplate(
                parser.getRLTSs(), fw, metric);
        if (customizedFW == null) {
            System.err.println("no usage is detected");
            return;
        }
        customizedFW.printCustomizedTemplate(outDir);
    }

    public void preporcess() {
        if (!outDir.endsWith("/")) {
            outDir = outDir + "/";
        }
        if (metric == null) {
            metric = fw.recommendedMetric();
        }
    }

    private static String getOutputDir(CommandLine cmd) {
        String projectDir = "./";
        if (cmd.hasOption("o")) {
            projectDir = cmd.getOptionValue("o");

        }
        return projectDir;
    }

    private static String getMetric(CommandLine cmd) {
        if (cmd.hasOption("s")) {
            return cmd.getOptionValue('s');
        }
        return null;
    }

    private static CommandLine parseCommandLine(String[] args) {
        final Options options = createCommandLineOptions();
        final CommandLineParser cmdParser = new BasicParser();
        CommandLine cmd = null;
        try {
            cmd = cmdParser.parse(options, args);
        } catch (final ParseException e) {
            System.err.println(e.getMessage());
            final HelpFormatter help = new HelpFormatter();
            help.printHelp("Syntax Error", options, true);
            System.exit(-1);
        }
        return cmd;
    }

    private static Options createCommandLineOptions() {
        final Options options = new Options();
        final Option outDir = OptionBuilder.hasArg(true)
        .withArgName("output directory").withDescription("-o OUT_DIR")
        .create("o");
        options.addOption(outDir);
        options.addOption("s", true, "select customization based on a metric");
        return options;
    }

}
