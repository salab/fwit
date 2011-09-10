/**
 * <copyright>
 * </copyright>
 *
 */
package jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiplication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Multiplication#getLeftOperand <em>Left Operand</em>}</li>
 *   <li>{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Multiplication#getOperator <em>Operator</em>}</li>
 *   <li>{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Multiplication#getRightOperand <em>Right Operand</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.FwitRequirementsModelPackage#getMultiplication()
 * @model
 * @generated
 */
public interface Multiplication extends EObject
{
  /**
   * Returns the value of the '<em><b>Left Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left Operand</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left Operand</em>' containment reference.
   * @see #setLeftOperand(BasicExpression)
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.FwitRequirementsModelPackage#getMultiplication_LeftOperand()
   * @model containment="true"
   * @generated
   */
  BasicExpression getLeftOperand();

  /**
   * Sets the value of the '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Multiplication#getLeftOperand <em>Left Operand</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left Operand</em>' containment reference.
   * @see #getLeftOperand()
   * @generated
   */
  void setLeftOperand(BasicExpression value);

  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute.
   * @see #setOperator(String)
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.FwitRequirementsModelPackage#getMultiplication_Operator()
   * @model
   * @generated
   */
  String getOperator();

  /**
   * Sets the value of the '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Multiplication#getOperator <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' attribute.
   * @see #getOperator()
   * @generated
   */
  void setOperator(String value);

  /**
   * Returns the value of the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right Operand</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right Operand</em>' containment reference.
   * @see #setRightOperand(BasicExpression)
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.FwitRequirementsModelPackage#getMultiplication_RightOperand()
   * @model containment="true"
   * @generated
   */
  BasicExpression getRightOperand();

  /**
   * Sets the value of the '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Multiplication#getRightOperand <em>Right Operand</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right Operand</em>' containment reference.
   * @see #getRightOperand()
   * @generated
   */
  void setRightOperand(BasicExpression value);

} // Multiplication
