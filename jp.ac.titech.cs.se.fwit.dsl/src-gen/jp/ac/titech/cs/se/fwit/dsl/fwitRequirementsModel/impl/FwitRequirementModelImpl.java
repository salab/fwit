/**
 * <copyright>
 * </copyright>
 *
 */
package jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl;

import java.util.Collection;

import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.FwitRequirementModel;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.FwitRequirementsModelPackage;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.SystemDeclaration;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.SystemElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fwit Requirement Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.FwitRequirementModelImpl#getSystem <em>System</em>}</li>
 *   <li>{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.FwitRequirementModelImpl#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FwitRequirementModelImpl extends MinimalEObjectImpl.Container implements FwitRequirementModel
{
  /**
   * The cached value of the '{@link #getSystem() <em>System</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSystem()
   * @generated
   * @ordered
   */
  protected SystemDeclaration system;

  /**
   * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElements()
   * @generated
   * @ordered
   */
  protected EList<SystemElement> elements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FwitRequirementModelImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return FwitRequirementsModelPackage.Literals.FWIT_REQUIREMENT_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SystemDeclaration getSystem()
  {
    return system;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSystem(SystemDeclaration newSystem, NotificationChain msgs)
  {
    SystemDeclaration oldSystem = system;
    system = newSystem;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FwitRequirementsModelPackage.FWIT_REQUIREMENT_MODEL__SYSTEM, oldSystem, newSystem);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSystem(SystemDeclaration newSystem)
  {
    if (newSystem != system)
    {
      NotificationChain msgs = null;
      if (system != null)
        msgs = ((InternalEObject)system).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FwitRequirementsModelPackage.FWIT_REQUIREMENT_MODEL__SYSTEM, null, msgs);
      if (newSystem != null)
        msgs = ((InternalEObject)newSystem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FwitRequirementsModelPackage.FWIT_REQUIREMENT_MODEL__SYSTEM, null, msgs);
      msgs = basicSetSystem(newSystem, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FwitRequirementsModelPackage.FWIT_REQUIREMENT_MODEL__SYSTEM, newSystem, newSystem));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SystemElement> getElements()
  {
    if (elements == null)
    {
      elements = new EObjectContainmentEList<SystemElement>(SystemElement.class, this, FwitRequirementsModelPackage.FWIT_REQUIREMENT_MODEL__ELEMENTS);
    }
    return elements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case FwitRequirementsModelPackage.FWIT_REQUIREMENT_MODEL__SYSTEM:
        return basicSetSystem(null, msgs);
      case FwitRequirementsModelPackage.FWIT_REQUIREMENT_MODEL__ELEMENTS:
        return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case FwitRequirementsModelPackage.FWIT_REQUIREMENT_MODEL__SYSTEM:
        return getSystem();
      case FwitRequirementsModelPackage.FWIT_REQUIREMENT_MODEL__ELEMENTS:
        return getElements();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case FwitRequirementsModelPackage.FWIT_REQUIREMENT_MODEL__SYSTEM:
        setSystem((SystemDeclaration)newValue);
        return;
      case FwitRequirementsModelPackage.FWIT_REQUIREMENT_MODEL__ELEMENTS:
        getElements().clear();
        getElements().addAll((Collection<? extends SystemElement>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case FwitRequirementsModelPackage.FWIT_REQUIREMENT_MODEL__SYSTEM:
        setSystem((SystemDeclaration)null);
        return;
      case FwitRequirementsModelPackage.FWIT_REQUIREMENT_MODEL__ELEMENTS:
        getElements().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case FwitRequirementsModelPackage.FWIT_REQUIREMENT_MODEL__SYSTEM:
        return system != null;
      case FwitRequirementsModelPackage.FWIT_REQUIREMENT_MODEL__ELEMENTS:
        return elements != null && !elements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //FwitRequirementModelImpl
