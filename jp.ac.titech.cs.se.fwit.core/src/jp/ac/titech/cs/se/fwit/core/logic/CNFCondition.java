package jp.ac.titech.cs.se.fwit.core.logic;

import java.util.HashMap;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import jp.ac.titech.cs.se.fwit.core.FatalFwitterException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.SolverFactory;
import org.sat4j.specs.ContradictionException;
import org.sat4j.specs.IProblem;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.TimeoutException;

/**
 * CNFCondition represents a logical constraint in Conjunctive Normal Form.
 * @author zenmyo
 *
 */
public class CNFCondition {

    public static Log logger = LogFactory.getLog(CNFCondition.class);

    // set of disjunction included in this constraint
    private final Set<Disjunction> disjunctions;

    public CNFCondition() {
        disjunctions = new HashSet<Disjunction>();
    }

    public void addDisjunction(Disjunction disjunction) {
        this.disjunctions.add(disjunction);
    }

    public void addAllDisjunctions(Set<Disjunction> disjunctions) {
        this.disjunctions.addAll(disjunctions);
    }

    /**
     * check whether this constraint is satisfiable using a SAT solver
     * @return true in case of satisfiable, otherwise false.
     */
    public Boolean isConsistent() {
        final ISolver solver = SolverFactory.newDefault();
        solver.setTimeout(3600);
        solver.setExpectedNumberOfClauses(disjunctions.size());

        Integer nextID = 1;
        final Map<String, Integer> propositionIDs = new HashMap<String, Integer>();
        final Map<Integer, String> propositionName = new HashMap<Integer, String>();

        try {
            for (final Disjunction disjunction : disjunctions) {
                final int[] d = new int[disjunction.getPropositions().size()];
                int i = 0;
                for (final Proposition prop : disjunction.getPropositions()) {
                    final String propName = prop.getBaseName();

                    if (!propositionIDs.containsKey(propName)) {
                        propositionIDs.put(propName, nextID);
                        propositionName.put(nextID, propName);
                        nextID++;
                    }
                    logger.debug(propName + " = " + prop.getValue());
                    if (prop.getValue()) {
                        d[i++] = propositionIDs.get(propName);
                    } else {
                        d[i++] = -1 * propositionIDs.get(propName);
                    }
                }
                solver.addClause(new VecInt(d));
            }
            final IProblem problem = solver;
            return problem.isSatisfiable();

        } catch (final ContradictionException e) {
            logger.info("trivial contradiction found");
            if (logger.isDebugEnabled()) {
                logger.debug(this);
            }
        } catch (final TimeoutException e) {
            logger.fatal("time out for solving");
            logger.fatal(this);
            throw new FatalFwitterException(e.getMessage());
        }
        return false;
    }

    @Override
    public String toString() {
        final StringBuffer buf = new StringBuffer();
        for (final Disjunction d : this.disjunctions) {
            buf.append(d);
            buf.append(System.getProperty("line.separator"));
        }
        return buf.toString();
    }
}
