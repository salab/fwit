/**
 * <copyright>
 * </copyright>
 *
 */
package jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Module#getName <em>Name</em>}</li>
 *   <li>{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Module#getFields <em>Fields</em>}</li>
 *   <li>{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Module#getFunctions <em>Functions</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.FwitRequirementsModelPackage#getModule()
 * @model
 * @generated
 */
public interface Module extends SystemElement
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.FwitRequirementsModelPackage#getModule_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Module#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
   * The list contents are of type {@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.FieldDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fields</em>' containment reference list.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.FwitRequirementsModelPackage#getModule_Fields()
   * @model containment="true"
   * @generated
   */
  EList<FieldDeclaration> getFields();

  /**
   * Returns the value of the '<em><b>Functions</b></em>' containment reference list.
   * The list contents are of type {@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.FunctionDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Functions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Functions</em>' containment reference list.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.FwitRequirementsModelPackage#getModule_Functions()
   * @model containment="true"
   * @generated
   */
  EList<FunctionDeclaration> getFunctions();

} // Module
