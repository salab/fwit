/**
 * <copyright>
 * </copyright>
 *
 */
package jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl;

import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.AssignmentStatement;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.BasicExpression;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Block;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Comparision;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Conjunction;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.EString;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.ElseBlock;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Expression;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.FieldDeclaration;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.FunctionDeclaration;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.FwitRequirementModel;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.FwitRequirementsModelFactory;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.FwitRequirementsModelPackage;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.IfStatement;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Include;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.IntegerLiteral;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Literal;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.LocalVariableDeclaration;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.MethodInvocation;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.MethodInvocationExpression;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Module;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Multiplication;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Name;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.NullLiteral;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.ParExpression;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.PrefixOperatorExpression;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.QualifiedExpression;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.ReturnStatement;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Statement;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.StringLiteral;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.SystemDeclaration;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.SystemElement;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.TaskStatement;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Type;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.ValueExpression;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.VariableDeclaration;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FwitRequirementsModelPackageImpl extends EPackageImpl implements FwitRequirementsModelPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fwitRequirementModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass systemElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass includeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass systemDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass moduleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fieldDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass blockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conjunctionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass comparisionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass valueExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass multiplicationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass basicExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass literalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eStringEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass integerLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass qualifiedExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nullLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass prefixOperatorExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass methodInvocationExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass methodInvocationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass localVariableDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ifStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elseBlockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass returnStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass taskStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass assignmentStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableDeclarationEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.FwitRequirementsModelPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private FwitRequirementsModelPackageImpl()
  {
    super(eNS_URI, FwitRequirementsModelFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link FwitRequirementsModelPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static FwitRequirementsModelPackage init()
  {
    if (isInited) return (FwitRequirementsModelPackage)EPackage.Registry.INSTANCE.getEPackage(FwitRequirementsModelPackage.eNS_URI);

    // Obtain or create and register package
    FwitRequirementsModelPackageImpl theFwitRequirementsModelPackage = (FwitRequirementsModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FwitRequirementsModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FwitRequirementsModelPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theFwitRequirementsModelPackage.createPackageContents();

    // Initialize created meta-data
    theFwitRequirementsModelPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theFwitRequirementsModelPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(FwitRequirementsModelPackage.eNS_URI, theFwitRequirementsModelPackage);
    return theFwitRequirementsModelPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFwitRequirementModel()
  {
    return fwitRequirementModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFwitRequirementModel_System()
  {
    return (EReference)fwitRequirementModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFwitRequirementModel_Elements()
  {
    return (EReference)fwitRequirementModelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSystemElement()
  {
    return systemElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInclude()
  {
    return includeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInclude_File()
  {
    return (EAttribute)includeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getType()
  {
    return typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getType_Name()
  {
    return (EAttribute)typeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getType_ClassName()
  {
    return (EAttribute)typeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSystemDeclaration()
  {
    return systemDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSystemDeclaration_Name()
  {
    return (EAttribute)systemDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSystemDeclaration_Framework()
  {
    return (EReference)systemDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModule()
  {
    return moduleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModule_Name()
  {
    return (EAttribute)moduleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModule_Fields()
  {
    return (EReference)moduleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModule_Functions()
  {
    return (EReference)moduleEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFieldDeclaration()
  {
    return fieldDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFieldDeclaration_Type()
  {
    return (EReference)fieldDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFieldDeclaration_Variables()
  {
    return (EReference)fieldDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunctionDeclaration()
  {
    return functionDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunctionDeclaration_Name()
  {
    return (EAttribute)functionDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionDeclaration_Body()
  {
    return (EReference)functionDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBlock()
  {
    return blockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBlock_Statements()
  {
    return (EReference)blockEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression()
  {
    return expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_LeftOperand()
  {
    return (EReference)expressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExpression_Operator()
  {
    return (EAttribute)expressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_RightOperand()
  {
    return (EReference)expressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConjunction()
  {
    return conjunctionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConjunction_LeftOperand()
  {
    return (EReference)conjunctionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConjunction_Operator()
  {
    return (EAttribute)conjunctionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConjunction_RightOperand()
  {
    return (EReference)conjunctionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComparision()
  {
    return comparisionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComparision_LeftOperand()
  {
    return (EReference)comparisionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComparision_Operator()
  {
    return (EAttribute)comparisionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getComparision_RightOperand()
  {
    return (EReference)comparisionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getValueExpression()
  {
    return valueExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValueExpression_LeftOperand()
  {
    return (EReference)valueExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getValueExpression_Operator()
  {
    return (EAttribute)valueExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getValueExpression_RightOperand()
  {
    return (EReference)valueExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMultiplication()
  {
    return multiplicationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMultiplication_LeftOperand()
  {
    return (EReference)multiplicationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMultiplication_Operator()
  {
    return (EAttribute)multiplicationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMultiplication_RightOperand()
  {
    return (EReference)multiplicationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBasicExpression()
  {
    return basicExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getName_()
  {
    return nameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLiteral()
  {
    return literalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEString()
  {
    return eStringEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEString_Value()
  {
    return (EAttribute)eStringEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringLiteral()
  {
    return stringLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringLiteral_Value()
  {
    return (EAttribute)stringLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntegerLiteral()
  {
    return integerLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIntegerLiteral_Value()
  {
    return (EAttribute)integerLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQualifiedExpression()
  {
    return qualifiedExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQualifiedExpression_Value()
  {
    return (EAttribute)qualifiedExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNullLiteral()
  {
    return nullLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNullLiteral_Value()
  {
    return (EAttribute)nullLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPrefixOperatorExpression()
  {
    return prefixOperatorExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPrefixOperatorExpression_Operator()
  {
    return (EAttribute)prefixOperatorExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPrefixOperatorExpression_Operand()
  {
    return (EReference)prefixOperatorExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMethodInvocationExpression()
  {
    return methodInvocationExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethodInvocationExpression_Receiver()
  {
    return (EReference)methodInvocationExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethodInvocationExpression_Method()
  {
    return (EReference)methodInvocationExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMethodInvocation()
  {
    return methodInvocationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethodInvocation_Name()
  {
    return (EReference)methodInvocationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethodInvocation_Arguments()
  {
    return (EReference)methodInvocationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStatement()
  {
    return statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLocalVariableDeclaration()
  {
    return localVariableDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLocalVariableDeclaration_Type()
  {
    return (EReference)localVariableDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLocalVariableDeclaration_Variables()
  {
    return (EReference)localVariableDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIfStatement()
  {
    return ifStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfStatement_Condition()
  {
    return (EReference)ifStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfStatement_ThenBlok()
  {
    return (EReference)ifStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIfStatement_ElseBlock()
  {
    return (EReference)ifStatementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElseBlock()
  {
    return elseBlockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReturnStatement()
  {
    return returnStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getReturnStatement_Value()
  {
    return (EAttribute)returnStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTaskStatement()
  {
    return taskStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAssignmentStatement()
  {
    return assignmentStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssignmentStatement_Variable()
  {
    return (EReference)assignmentStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAssignmentStatement_Operator()
  {
    return (EAttribute)assignmentStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAssignmentStatement_Value()
  {
    return (EReference)assignmentStatementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParExpression()
  {
    return parExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParExpression_Expression()
  {
    return (EReference)parExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariableDeclaration()
  {
    return variableDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariableDeclaration_Name()
  {
    return (EAttribute)variableDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FwitRequirementsModelFactory getFwitRequirementsModelFactory()
  {
    return (FwitRequirementsModelFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    fwitRequirementModelEClass = createEClass(FWIT_REQUIREMENT_MODEL);
    createEReference(fwitRequirementModelEClass, FWIT_REQUIREMENT_MODEL__SYSTEM);
    createEReference(fwitRequirementModelEClass, FWIT_REQUIREMENT_MODEL__ELEMENTS);

    systemElementEClass = createEClass(SYSTEM_ELEMENT);

    includeEClass = createEClass(INCLUDE);
    createEAttribute(includeEClass, INCLUDE__FILE);

    typeEClass = createEClass(TYPE);
    createEAttribute(typeEClass, TYPE__NAME);
    createEAttribute(typeEClass, TYPE__CLASS_NAME);

    systemDeclarationEClass = createEClass(SYSTEM_DECLARATION);
    createEAttribute(systemDeclarationEClass, SYSTEM_DECLARATION__NAME);
    createEReference(systemDeclarationEClass, SYSTEM_DECLARATION__FRAMEWORK);

    moduleEClass = createEClass(MODULE);
    createEAttribute(moduleEClass, MODULE__NAME);
    createEReference(moduleEClass, MODULE__FIELDS);
    createEReference(moduleEClass, MODULE__FUNCTIONS);

    fieldDeclarationEClass = createEClass(FIELD_DECLARATION);
    createEReference(fieldDeclarationEClass, FIELD_DECLARATION__TYPE);
    createEReference(fieldDeclarationEClass, FIELD_DECLARATION__VARIABLES);

    functionDeclarationEClass = createEClass(FUNCTION_DECLARATION);
    createEAttribute(functionDeclarationEClass, FUNCTION_DECLARATION__NAME);
    createEReference(functionDeclarationEClass, FUNCTION_DECLARATION__BODY);

    blockEClass = createEClass(BLOCK);
    createEReference(blockEClass, BLOCK__STATEMENTS);

    expressionEClass = createEClass(EXPRESSION);
    createEReference(expressionEClass, EXPRESSION__LEFT_OPERAND);
    createEAttribute(expressionEClass, EXPRESSION__OPERATOR);
    createEReference(expressionEClass, EXPRESSION__RIGHT_OPERAND);

    conjunctionEClass = createEClass(CONJUNCTION);
    createEReference(conjunctionEClass, CONJUNCTION__LEFT_OPERAND);
    createEAttribute(conjunctionEClass, CONJUNCTION__OPERATOR);
    createEReference(conjunctionEClass, CONJUNCTION__RIGHT_OPERAND);

    comparisionEClass = createEClass(COMPARISION);
    createEReference(comparisionEClass, COMPARISION__LEFT_OPERAND);
    createEAttribute(comparisionEClass, COMPARISION__OPERATOR);
    createEReference(comparisionEClass, COMPARISION__RIGHT_OPERAND);

    valueExpressionEClass = createEClass(VALUE_EXPRESSION);
    createEReference(valueExpressionEClass, VALUE_EXPRESSION__LEFT_OPERAND);
    createEAttribute(valueExpressionEClass, VALUE_EXPRESSION__OPERATOR);
    createEReference(valueExpressionEClass, VALUE_EXPRESSION__RIGHT_OPERAND);

    multiplicationEClass = createEClass(MULTIPLICATION);
    createEReference(multiplicationEClass, MULTIPLICATION__LEFT_OPERAND);
    createEAttribute(multiplicationEClass, MULTIPLICATION__OPERATOR);
    createEReference(multiplicationEClass, MULTIPLICATION__RIGHT_OPERAND);

    basicExpressionEClass = createEClass(BASIC_EXPRESSION);

    nameEClass = createEClass(NAME);

    literalEClass = createEClass(LITERAL);

    eStringEClass = createEClass(ESTRING);
    createEAttribute(eStringEClass, ESTRING__VALUE);

    stringLiteralEClass = createEClass(STRING_LITERAL);
    createEAttribute(stringLiteralEClass, STRING_LITERAL__VALUE);

    integerLiteralEClass = createEClass(INTEGER_LITERAL);
    createEAttribute(integerLiteralEClass, INTEGER_LITERAL__VALUE);

    qualifiedExpressionEClass = createEClass(QUALIFIED_EXPRESSION);
    createEAttribute(qualifiedExpressionEClass, QUALIFIED_EXPRESSION__VALUE);

    nullLiteralEClass = createEClass(NULL_LITERAL);
    createEAttribute(nullLiteralEClass, NULL_LITERAL__VALUE);

    prefixOperatorExpressionEClass = createEClass(PREFIX_OPERATOR_EXPRESSION);
    createEAttribute(prefixOperatorExpressionEClass, PREFIX_OPERATOR_EXPRESSION__OPERATOR);
    createEReference(prefixOperatorExpressionEClass, PREFIX_OPERATOR_EXPRESSION__OPERAND);

    methodInvocationExpressionEClass = createEClass(METHOD_INVOCATION_EXPRESSION);
    createEReference(methodInvocationExpressionEClass, METHOD_INVOCATION_EXPRESSION__RECEIVER);
    createEReference(methodInvocationExpressionEClass, METHOD_INVOCATION_EXPRESSION__METHOD);

    methodInvocationEClass = createEClass(METHOD_INVOCATION);
    createEReference(methodInvocationEClass, METHOD_INVOCATION__NAME);
    createEReference(methodInvocationEClass, METHOD_INVOCATION__ARGUMENTS);

    statementEClass = createEClass(STATEMENT);

    localVariableDeclarationEClass = createEClass(LOCAL_VARIABLE_DECLARATION);
    createEReference(localVariableDeclarationEClass, LOCAL_VARIABLE_DECLARATION__TYPE);
    createEReference(localVariableDeclarationEClass, LOCAL_VARIABLE_DECLARATION__VARIABLES);

    ifStatementEClass = createEClass(IF_STATEMENT);
    createEReference(ifStatementEClass, IF_STATEMENT__CONDITION);
    createEReference(ifStatementEClass, IF_STATEMENT__THEN_BLOK);
    createEReference(ifStatementEClass, IF_STATEMENT__ELSE_BLOCK);

    elseBlockEClass = createEClass(ELSE_BLOCK);

    returnStatementEClass = createEClass(RETURN_STATEMENT);
    createEAttribute(returnStatementEClass, RETURN_STATEMENT__VALUE);

    taskStatementEClass = createEClass(TASK_STATEMENT);

    assignmentStatementEClass = createEClass(ASSIGNMENT_STATEMENT);
    createEReference(assignmentStatementEClass, ASSIGNMENT_STATEMENT__VARIABLE);
    createEAttribute(assignmentStatementEClass, ASSIGNMENT_STATEMENT__OPERATOR);
    createEReference(assignmentStatementEClass, ASSIGNMENT_STATEMENT__VALUE);

    parExpressionEClass = createEClass(PAR_EXPRESSION);
    createEReference(parExpressionEClass, PAR_EXPRESSION__EXPRESSION);

    variableDeclarationEClass = createEClass(VARIABLE_DECLARATION);
    createEAttribute(variableDeclarationEClass, VARIABLE_DECLARATION__NAME);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    includeEClass.getESuperTypes().add(this.getSystemElement());
    typeEClass.getESuperTypes().add(this.getSystemElement());
    moduleEClass.getESuperTypes().add(this.getSystemElement());
    blockEClass.getESuperTypes().add(this.getElseBlock());
    nameEClass.getESuperTypes().add(this.getBasicExpression());
    literalEClass.getESuperTypes().add(this.getName_());
    eStringEClass.getESuperTypes().add(this.getLiteral());
    stringLiteralEClass.getESuperTypes().add(this.getLiteral());
    integerLiteralEClass.getESuperTypes().add(this.getLiteral());
    qualifiedExpressionEClass.getESuperTypes().add(this.getBasicExpression());
    nullLiteralEClass.getESuperTypes().add(this.getLiteral());
    prefixOperatorExpressionEClass.getESuperTypes().add(this.getBasicExpression());
    methodInvocationExpressionEClass.getESuperTypes().add(this.getBasicExpression());
    methodInvocationExpressionEClass.getESuperTypes().add(this.getTaskStatement());
    localVariableDeclarationEClass.getESuperTypes().add(this.getStatement());
    ifStatementEClass.getESuperTypes().add(this.getStatement());
    ifStatementEClass.getESuperTypes().add(this.getElseBlock());
    returnStatementEClass.getESuperTypes().add(this.getStatement());
    taskStatementEClass.getESuperTypes().add(this.getStatement());
    assignmentStatementEClass.getESuperTypes().add(this.getTaskStatement());
    parExpressionEClass.getESuperTypes().add(this.getBasicExpression());

    // Initialize classes and features; add operations and parameters
    initEClass(fwitRequirementModelEClass, FwitRequirementModel.class, "FwitRequirementModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFwitRequirementModel_System(), this.getSystemDeclaration(), null, "system", null, 0, 1, FwitRequirementModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFwitRequirementModel_Elements(), this.getSystemElement(), null, "elements", null, 0, -1, FwitRequirementModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(systemElementEClass, SystemElement.class, "SystemElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(includeEClass, Include.class, "Include", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInclude_File(), ecorePackage.getEString(), "file", null, 0, 1, Include.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getType_Name(), ecorePackage.getEString(), "name", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getType_ClassName(), ecorePackage.getEString(), "className", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(systemDeclarationEClass, SystemDeclaration.class, "SystemDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSystemDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, SystemDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSystemDeclaration_Framework(), this.getQualifiedExpression(), null, "framework", null, 0, 1, SystemDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(moduleEClass, Module.class, "Module", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getModule_Name(), ecorePackage.getEString(), "name", null, 0, 1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModule_Fields(), this.getFieldDeclaration(), null, "fields", null, 0, -1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModule_Functions(), this.getFunctionDeclaration(), null, "functions", null, 0, -1, Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fieldDeclarationEClass, FieldDeclaration.class, "FieldDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFieldDeclaration_Type(), this.getType(), null, "type", null, 0, 1, FieldDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFieldDeclaration_Variables(), this.getVariableDeclaration(), null, "variables", null, 0, -1, FieldDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionDeclarationEClass, FunctionDeclaration.class, "FunctionDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFunctionDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, FunctionDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunctionDeclaration_Body(), this.getBlock(), null, "body", null, 0, 1, FunctionDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(blockEClass, Block.class, "Block", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBlock_Statements(), this.getStatement(), null, "statements", null, 0, -1, Block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExpression_LeftOperand(), this.getConjunction(), null, "leftOperand", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExpression_Operator(), ecorePackage.getEString(), "operator", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpression_RightOperand(), this.getExpression(), null, "rightOperand", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(conjunctionEClass, Conjunction.class, "Conjunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConjunction_LeftOperand(), this.getComparision(), null, "leftOperand", null, 0, 1, Conjunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConjunction_Operator(), ecorePackage.getEString(), "operator", null, 0, 1, Conjunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConjunction_RightOperand(), this.getConjunction(), null, "rightOperand", null, 0, 1, Conjunction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(comparisionEClass, Comparision.class, "Comparision", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getComparision_LeftOperand(), this.getValueExpression(), null, "leftOperand", null, 0, 1, Comparision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getComparision_Operator(), ecorePackage.getEString(), "operator", null, 0, 1, Comparision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getComparision_RightOperand(), this.getComparision(), null, "rightOperand", null, 0, 1, Comparision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(valueExpressionEClass, ValueExpression.class, "ValueExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getValueExpression_LeftOperand(), this.getMultiplication(), null, "leftOperand", null, 0, 1, ValueExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getValueExpression_Operator(), ecorePackage.getEString(), "operator", null, 0, 1, ValueExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getValueExpression_RightOperand(), this.getValueExpression(), null, "rightOperand", null, 0, 1, ValueExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(multiplicationEClass, Multiplication.class, "Multiplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMultiplication_LeftOperand(), this.getBasicExpression(), null, "leftOperand", null, 0, 1, Multiplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMultiplication_Operator(), ecorePackage.getEString(), "operator", null, 0, 1, Multiplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMultiplication_RightOperand(), this.getBasicExpression(), null, "rightOperand", null, 0, 1, Multiplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(basicExpressionEClass, BasicExpression.class, "BasicExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(nameEClass, Name.class, "Name", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(literalEClass, Literal.class, "Literal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(eStringEClass, EString.class, "EString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEString_Value(), ecorePackage.getEString(), "value", null, 0, 1, EString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stringLiteralEClass, StringLiteral.class, "StringLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStringLiteral_Value(), ecorePackage.getEString(), "value", null, 0, 1, StringLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(integerLiteralEClass, IntegerLiteral.class, "IntegerLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIntegerLiteral_Value(), ecorePackage.getEInt(), "value", null, 0, 1, IntegerLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(qualifiedExpressionEClass, QualifiedExpression.class, "QualifiedExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getQualifiedExpression_Value(), ecorePackage.getEString(), "value", null, 0, 1, QualifiedExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nullLiteralEClass, NullLiteral.class, "NullLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNullLiteral_Value(), ecorePackage.getEString(), "value", null, 0, 1, NullLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(prefixOperatorExpressionEClass, PrefixOperatorExpression.class, "PrefixOperatorExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPrefixOperatorExpression_Operator(), ecorePackage.getEString(), "operator", null, 0, 1, PrefixOperatorExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPrefixOperatorExpression_Operand(), this.getExpression(), null, "operand", null, 0, 1, PrefixOperatorExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(methodInvocationExpressionEClass, MethodInvocationExpression.class, "MethodInvocationExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMethodInvocationExpression_Receiver(), this.getVariableDeclaration(), null, "receiver", null, 0, 1, MethodInvocationExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMethodInvocationExpression_Method(), this.getMethodInvocation(), null, "method", null, 0, 1, MethodInvocationExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(methodInvocationEClass, MethodInvocation.class, "MethodInvocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMethodInvocation_Name(), this.getEString(), null, "name", null, 0, 1, MethodInvocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMethodInvocation_Arguments(), this.getExpression(), null, "arguments", null, 0, -1, MethodInvocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(statementEClass, Statement.class, "Statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(localVariableDeclarationEClass, LocalVariableDeclaration.class, "LocalVariableDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLocalVariableDeclaration_Type(), this.getType(), null, "type", null, 0, 1, LocalVariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLocalVariableDeclaration_Variables(), this.getVariableDeclaration(), null, "variables", null, 0, -1, LocalVariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ifStatementEClass, IfStatement.class, "IfStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIfStatement_Condition(), this.getParExpression(), null, "condition", null, 0, 1, IfStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfStatement_ThenBlok(), this.getBlock(), null, "thenBlok", null, 0, 1, IfStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIfStatement_ElseBlock(), this.getElseBlock(), null, "elseBlock", null, 0, 1, IfStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(elseBlockEClass, ElseBlock.class, "ElseBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(returnStatementEClass, ReturnStatement.class, "ReturnStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getReturnStatement_Value(), ecorePackage.getEString(), "value", null, 0, 1, ReturnStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(taskStatementEClass, TaskStatement.class, "TaskStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(assignmentStatementEClass, AssignmentStatement.class, "AssignmentStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAssignmentStatement_Variable(), this.getVariableDeclaration(), null, "variable", null, 0, 1, AssignmentStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAssignmentStatement_Operator(), ecorePackage.getEString(), "operator", null, 0, 1, AssignmentStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAssignmentStatement_Value(), this.getExpression(), null, "value", null, 0, 1, AssignmentStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parExpressionEClass, ParExpression.class, "ParExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParExpression_Expression(), this.getExpression(), null, "expression", null, 0, 1, ParExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variableDeclarationEClass, VariableDeclaration.class, "VariableDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVariableDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, VariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //FwitRequirementsModelPackageImpl
