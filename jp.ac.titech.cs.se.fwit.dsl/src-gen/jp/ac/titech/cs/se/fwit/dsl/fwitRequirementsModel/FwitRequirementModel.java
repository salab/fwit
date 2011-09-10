/**
 * <copyright>
 * </copyright>
 *
 */
package jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fwit Requirement Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.FwitRequirementModel#getSystem <em>System</em>}</li>
 *   <li>{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.FwitRequirementModel#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.FwitRequirementsModelPackage#getFwitRequirementModel()
 * @model
 * @generated
 */
public interface FwitRequirementModel extends EObject
{
  /**
   * Returns the value of the '<em><b>System</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>System</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>System</em>' containment reference.
   * @see #setSystem(SystemDeclaration)
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.FwitRequirementsModelPackage#getFwitRequirementModel_System()
   * @model containment="true"
   * @generated
   */
  SystemDeclaration getSystem();

  /**
   * Sets the value of the '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.FwitRequirementModel#getSystem <em>System</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>System</em>' containment reference.
   * @see #getSystem()
   * @generated
   */
  void setSystem(SystemDeclaration value);

  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.SystemElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.FwitRequirementsModelPackage#getFwitRequirementModel_Elements()
   * @model containment="true"
   * @generated
   */
  EList<SystemElement> getElements();

} // FwitRequirementModel
