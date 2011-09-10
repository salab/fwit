/**
 * <copyright>
 * </copyright>
 *
 */
package jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.FwitRequirementsModelPackage
 * @generated
 */
public interface FwitRequirementsModelFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  FwitRequirementsModelFactory eINSTANCE = jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.FwitRequirementsModelFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Fwit Requirement Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Fwit Requirement Model</em>'.
   * @generated
   */
  FwitRequirementModel createFwitRequirementModel();

  /**
   * Returns a new object of class '<em>System Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>System Element</em>'.
   * @generated
   */
  SystemElement createSystemElement();

  /**
   * Returns a new object of class '<em>Include</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Include</em>'.
   * @generated
   */
  Include createInclude();

  /**
   * Returns a new object of class '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type</em>'.
   * @generated
   */
  Type createType();

  /**
   * Returns a new object of class '<em>System Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>System Declaration</em>'.
   * @generated
   */
  SystemDeclaration createSystemDeclaration();

  /**
   * Returns a new object of class '<em>Module</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Module</em>'.
   * @generated
   */
  Module createModule();

  /**
   * Returns a new object of class '<em>Field Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Field Declaration</em>'.
   * @generated
   */
  FieldDeclaration createFieldDeclaration();

  /**
   * Returns a new object of class '<em>Function Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Declaration</em>'.
   * @generated
   */
  FunctionDeclaration createFunctionDeclaration();

  /**
   * Returns a new object of class '<em>Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Block</em>'.
   * @generated
   */
  Block createBlock();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>Conjunction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Conjunction</em>'.
   * @generated
   */
  Conjunction createConjunction();

  /**
   * Returns a new object of class '<em>Comparision</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Comparision</em>'.
   * @generated
   */
  Comparision createComparision();

  /**
   * Returns a new object of class '<em>Value Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Value Expression</em>'.
   * @generated
   */
  ValueExpression createValueExpression();

  /**
   * Returns a new object of class '<em>Multiplication</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Multiplication</em>'.
   * @generated
   */
  Multiplication createMultiplication();

  /**
   * Returns a new object of class '<em>Basic Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Basic Expression</em>'.
   * @generated
   */
  BasicExpression createBasicExpression();

  /**
   * Returns a new object of class '<em>Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Name</em>'.
   * @generated
   */
  Name createName();

  /**
   * Returns a new object of class '<em>Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Literal</em>'.
   * @generated
   */
  Literal createLiteral();

  /**
   * Returns a new object of class '<em>EString</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>EString</em>'.
   * @generated
   */
  EString createEString();

  /**
   * Returns a new object of class '<em>String Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Literal</em>'.
   * @generated
   */
  StringLiteral createStringLiteral();

  /**
   * Returns a new object of class '<em>Integer Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Integer Literal</em>'.
   * @generated
   */
  IntegerLiteral createIntegerLiteral();

  /**
   * Returns a new object of class '<em>Qualified Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Qualified Expression</em>'.
   * @generated
   */
  QualifiedExpression createQualifiedExpression();

  /**
   * Returns a new object of class '<em>Null Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Null Literal</em>'.
   * @generated
   */
  NullLiteral createNullLiteral();

  /**
   * Returns a new object of class '<em>Prefix Operator Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Prefix Operator Expression</em>'.
   * @generated
   */
  PrefixOperatorExpression createPrefixOperatorExpression();

  /**
   * Returns a new object of class '<em>Method Invocation Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Method Invocation Expression</em>'.
   * @generated
   */
  MethodInvocationExpression createMethodInvocationExpression();

  /**
   * Returns a new object of class '<em>Method Invocation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Method Invocation</em>'.
   * @generated
   */
  MethodInvocation createMethodInvocation();

  /**
   * Returns a new object of class '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Statement</em>'.
   * @generated
   */
  Statement createStatement();

  /**
   * Returns a new object of class '<em>Local Variable Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Local Variable Declaration</em>'.
   * @generated
   */
  LocalVariableDeclaration createLocalVariableDeclaration();

  /**
   * Returns a new object of class '<em>If Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>If Statement</em>'.
   * @generated
   */
  IfStatement createIfStatement();

  /**
   * Returns a new object of class '<em>Else Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Else Block</em>'.
   * @generated
   */
  ElseBlock createElseBlock();

  /**
   * Returns a new object of class '<em>Return Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Return Statement</em>'.
   * @generated
   */
  ReturnStatement createReturnStatement();

  /**
   * Returns a new object of class '<em>Task Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Task Statement</em>'.
   * @generated
   */
  TaskStatement createTaskStatement();

  /**
   * Returns a new object of class '<em>Assignment Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Assignment Statement</em>'.
   * @generated
   */
  AssignmentStatement createAssignmentStatement();

  /**
   * Returns a new object of class '<em>Par Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Par Expression</em>'.
   * @generated
   */
  ParExpression createParExpression();

  /**
   * Returns a new object of class '<em>Variable Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Declaration</em>'.
   * @generated
   */
  VariableDeclaration createVariableDeclaration();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  FwitRequirementsModelPackage getFwitRequirementsModelPackage();

} //FwitRequirementsModelFactory
