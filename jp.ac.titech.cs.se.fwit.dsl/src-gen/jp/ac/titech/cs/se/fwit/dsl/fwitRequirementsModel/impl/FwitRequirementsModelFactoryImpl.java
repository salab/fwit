/**
 * <copyright>
 * </copyright>
 *
 */
package jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl;

import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FwitRequirementsModelFactoryImpl extends EFactoryImpl implements FwitRequirementsModelFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static FwitRequirementsModelFactory init()
  {
    try
    {
      FwitRequirementsModelFactory theFwitRequirementsModelFactory = (FwitRequirementsModelFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.ac.jp/titech/cs/se/fwit/dsl/FwitRequirementsModel"); 
      if (theFwitRequirementsModelFactory != null)
      {
        return theFwitRequirementsModelFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new FwitRequirementsModelFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FwitRequirementsModelFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case FwitRequirementsModelPackage.FWIT_REQUIREMENT_MODEL: return createFwitRequirementModel();
      case FwitRequirementsModelPackage.SYSTEM_ELEMENT: return createSystemElement();
      case FwitRequirementsModelPackage.INCLUDE: return createInclude();
      case FwitRequirementsModelPackage.TYPE: return createType();
      case FwitRequirementsModelPackage.SYSTEM_DECLARATION: return createSystemDeclaration();
      case FwitRequirementsModelPackage.MODULE: return createModule();
      case FwitRequirementsModelPackage.FIELD_DECLARATION: return createFieldDeclaration();
      case FwitRequirementsModelPackage.FUNCTION_DECLARATION: return createFunctionDeclaration();
      case FwitRequirementsModelPackage.BLOCK: return createBlock();
      case FwitRequirementsModelPackage.EXPRESSION: return createExpression();
      case FwitRequirementsModelPackage.CONJUNCTION: return createConjunction();
      case FwitRequirementsModelPackage.COMPARISION: return createComparision();
      case FwitRequirementsModelPackage.VALUE_EXPRESSION: return createValueExpression();
      case FwitRequirementsModelPackage.MULTIPLICATION: return createMultiplication();
      case FwitRequirementsModelPackage.BASIC_EXPRESSION: return createBasicExpression();
      case FwitRequirementsModelPackage.NAME: return createName();
      case FwitRequirementsModelPackage.LITERAL: return createLiteral();
      case FwitRequirementsModelPackage.ESTRING: return createEString();
      case FwitRequirementsModelPackage.STRING_LITERAL: return createStringLiteral();
      case FwitRequirementsModelPackage.INTEGER_LITERAL: return createIntegerLiteral();
      case FwitRequirementsModelPackage.QUALIFIED_EXPRESSION: return createQualifiedExpression();
      case FwitRequirementsModelPackage.NULL_LITERAL: return createNullLiteral();
      case FwitRequirementsModelPackage.PREFIX_OPERATOR_EXPRESSION: return createPrefixOperatorExpression();
      case FwitRequirementsModelPackage.METHOD_INVOCATION_EXPRESSION: return createMethodInvocationExpression();
      case FwitRequirementsModelPackage.METHOD_INVOCATION: return createMethodInvocation();
      case FwitRequirementsModelPackage.STATEMENT: return createStatement();
      case FwitRequirementsModelPackage.LOCAL_VARIABLE_DECLARATION: return createLocalVariableDeclaration();
      case FwitRequirementsModelPackage.IF_STATEMENT: return createIfStatement();
      case FwitRequirementsModelPackage.ELSE_BLOCK: return createElseBlock();
      case FwitRequirementsModelPackage.RETURN_STATEMENT: return createReturnStatement();
      case FwitRequirementsModelPackage.TASK_STATEMENT: return createTaskStatement();
      case FwitRequirementsModelPackage.ASSIGNMENT_STATEMENT: return createAssignmentStatement();
      case FwitRequirementsModelPackage.PAR_EXPRESSION: return createParExpression();
      case FwitRequirementsModelPackage.VARIABLE_DECLARATION: return createVariableDeclaration();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FwitRequirementModel createFwitRequirementModel()
  {
    FwitRequirementModelImpl fwitRequirementModel = new FwitRequirementModelImpl();
    return fwitRequirementModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SystemElement createSystemElement()
  {
    SystemElementImpl systemElement = new SystemElementImpl();
    return systemElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Include createInclude()
  {
    IncludeImpl include = new IncludeImpl();
    return include;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SystemDeclaration createSystemDeclaration()
  {
    SystemDeclarationImpl systemDeclaration = new SystemDeclarationImpl();
    return systemDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Module createModule()
  {
    ModuleImpl module = new ModuleImpl();
    return module;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FieldDeclaration createFieldDeclaration()
  {
    FieldDeclarationImpl fieldDeclaration = new FieldDeclarationImpl();
    return fieldDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionDeclaration createFunctionDeclaration()
  {
    FunctionDeclarationImpl functionDeclaration = new FunctionDeclarationImpl();
    return functionDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Block createBlock()
  {
    BlockImpl block = new BlockImpl();
    return block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Conjunction createConjunction()
  {
    ConjunctionImpl conjunction = new ConjunctionImpl();
    return conjunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Comparision createComparision()
  {
    ComparisionImpl comparision = new ComparisionImpl();
    return comparision;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueExpression createValueExpression()
  {
    ValueExpressionImpl valueExpression = new ValueExpressionImpl();
    return valueExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Multiplication createMultiplication()
  {
    MultiplicationImpl multiplication = new MultiplicationImpl();
    return multiplication;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BasicExpression createBasicExpression()
  {
    BasicExpressionImpl basicExpression = new BasicExpressionImpl();
    return basicExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Name createName()
  {
    NameImpl name = new NameImpl();
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Literal createLiteral()
  {
    LiteralImpl literal = new LiteralImpl();
    return literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EString createEString()
  {
    EStringImpl eString = new EStringImpl();
    return eString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringLiteral createStringLiteral()
  {
    StringLiteralImpl stringLiteral = new StringLiteralImpl();
    return stringLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerLiteral createIntegerLiteral()
  {
    IntegerLiteralImpl integerLiteral = new IntegerLiteralImpl();
    return integerLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QualifiedExpression createQualifiedExpression()
  {
    QualifiedExpressionImpl qualifiedExpression = new QualifiedExpressionImpl();
    return qualifiedExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NullLiteral createNullLiteral()
  {
    NullLiteralImpl nullLiteral = new NullLiteralImpl();
    return nullLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrefixOperatorExpression createPrefixOperatorExpression()
  {
    PrefixOperatorExpressionImpl prefixOperatorExpression = new PrefixOperatorExpressionImpl();
    return prefixOperatorExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethodInvocationExpression createMethodInvocationExpression()
  {
    MethodInvocationExpressionImpl methodInvocationExpression = new MethodInvocationExpressionImpl();
    return methodInvocationExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethodInvocation createMethodInvocation()
  {
    MethodInvocationImpl methodInvocation = new MethodInvocationImpl();
    return methodInvocation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement createStatement()
  {
    StatementImpl statement = new StatementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocalVariableDeclaration createLocalVariableDeclaration()
  {
    LocalVariableDeclarationImpl localVariableDeclaration = new LocalVariableDeclarationImpl();
    return localVariableDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IfStatement createIfStatement()
  {
    IfStatementImpl ifStatement = new IfStatementImpl();
    return ifStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElseBlock createElseBlock()
  {
    ElseBlockImpl elseBlock = new ElseBlockImpl();
    return elseBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReturnStatement createReturnStatement()
  {
    ReturnStatementImpl returnStatement = new ReturnStatementImpl();
    return returnStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TaskStatement createTaskStatement()
  {
    TaskStatementImpl taskStatement = new TaskStatementImpl();
    return taskStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssignmentStatement createAssignmentStatement()
  {
    AssignmentStatementImpl assignmentStatement = new AssignmentStatementImpl();
    return assignmentStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParExpression createParExpression()
  {
    ParExpressionImpl parExpression = new ParExpressionImpl();
    return parExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDeclaration createVariableDeclaration()
  {
    VariableDeclarationImpl variableDeclaration = new VariableDeclarationImpl();
    return variableDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FwitRequirementsModelPackage getFwitRequirementsModelPackage()
  {
    return (FwitRequirementsModelPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static FwitRequirementsModelPackage getPackage()
  {
    return FwitRequirementsModelPackage.eINSTANCE;
  }

} //FwitRequirementsModelFactoryImpl
