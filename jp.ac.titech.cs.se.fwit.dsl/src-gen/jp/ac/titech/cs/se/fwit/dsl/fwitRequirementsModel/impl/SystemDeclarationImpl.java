/**
 * <copyright>
 * </copyright>
 *
 */
package jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl;

import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.FwitRequirementsModelPackage;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.QualifiedExpression;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.SystemDeclaration;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.SystemDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.SystemDeclarationImpl#getFramework <em>Framework</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SystemDeclarationImpl extends MinimalEObjectImpl.Container implements SystemDeclaration
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getFramework() <em>Framework</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFramework()
   * @generated
   * @ordered
   */
  protected QualifiedExpression framework;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SystemDeclarationImpl()
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
    return FwitRequirementsModelPackage.Literals.SYSTEM_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FwitRequirementsModelPackage.SYSTEM_DECLARATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QualifiedExpression getFramework()
  {
    return framework;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFramework(QualifiedExpression newFramework, NotificationChain msgs)
  {
    QualifiedExpression oldFramework = framework;
    framework = newFramework;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FwitRequirementsModelPackage.SYSTEM_DECLARATION__FRAMEWORK, oldFramework, newFramework);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFramework(QualifiedExpression newFramework)
  {
    if (newFramework != framework)
    {
      NotificationChain msgs = null;
      if (framework != null)
        msgs = ((InternalEObject)framework).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FwitRequirementsModelPackage.SYSTEM_DECLARATION__FRAMEWORK, null, msgs);
      if (newFramework != null)
        msgs = ((InternalEObject)newFramework).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FwitRequirementsModelPackage.SYSTEM_DECLARATION__FRAMEWORK, null, msgs);
      msgs = basicSetFramework(newFramework, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FwitRequirementsModelPackage.SYSTEM_DECLARATION__FRAMEWORK, newFramework, newFramework));
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
      case FwitRequirementsModelPackage.SYSTEM_DECLARATION__FRAMEWORK:
        return basicSetFramework(null, msgs);
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
      case FwitRequirementsModelPackage.SYSTEM_DECLARATION__NAME:
        return getName();
      case FwitRequirementsModelPackage.SYSTEM_DECLARATION__FRAMEWORK:
        return getFramework();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case FwitRequirementsModelPackage.SYSTEM_DECLARATION__NAME:
        setName((String)newValue);
        return;
      case FwitRequirementsModelPackage.SYSTEM_DECLARATION__FRAMEWORK:
        setFramework((QualifiedExpression)newValue);
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
      case FwitRequirementsModelPackage.SYSTEM_DECLARATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case FwitRequirementsModelPackage.SYSTEM_DECLARATION__FRAMEWORK:
        setFramework((QualifiedExpression)null);
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
      case FwitRequirementsModelPackage.SYSTEM_DECLARATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case FwitRequirementsModelPackage.SYSTEM_DECLARATION__FRAMEWORK:
        return framework != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //SystemDeclarationImpl
