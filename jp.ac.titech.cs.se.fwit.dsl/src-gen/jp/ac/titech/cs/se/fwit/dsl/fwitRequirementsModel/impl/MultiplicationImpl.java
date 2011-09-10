/**
 * <copyright>
 * </copyright>
 *
 */
package jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl;

import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.BasicExpression;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.FwitRequirementsModelPackage;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Multiplication;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multiplication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.MultiplicationImpl#getLeftOperand <em>Left Operand</em>}</li>
 *   <li>{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.MultiplicationImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.MultiplicationImpl#getRightOperand <em>Right Operand</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MultiplicationImpl extends MinimalEObjectImpl.Container implements Multiplication
{
  /**
   * The cached value of the '{@link #getLeftOperand() <em>Left Operand</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeftOperand()
   * @generated
   * @ordered
   */
  protected BasicExpression leftOperand;

  /**
   * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected static final String OPERATOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected String operator = OPERATOR_EDEFAULT;

  /**
   * The cached value of the '{@link #getRightOperand() <em>Right Operand</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRightOperand()
   * @generated
   * @ordered
   */
  protected BasicExpression rightOperand;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MultiplicationImpl()
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
    return FwitRequirementsModelPackage.Literals.MULTIPLICATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BasicExpression getLeftOperand()
  {
    return leftOperand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeftOperand(BasicExpression newLeftOperand, NotificationChain msgs)
  {
    BasicExpression oldLeftOperand = leftOperand;
    leftOperand = newLeftOperand;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FwitRequirementsModelPackage.MULTIPLICATION__LEFT_OPERAND, oldLeftOperand, newLeftOperand);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeftOperand(BasicExpression newLeftOperand)
  {
    if (newLeftOperand != leftOperand)
    {
      NotificationChain msgs = null;
      if (leftOperand != null)
        msgs = ((InternalEObject)leftOperand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FwitRequirementsModelPackage.MULTIPLICATION__LEFT_OPERAND, null, msgs);
      if (newLeftOperand != null)
        msgs = ((InternalEObject)newLeftOperand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FwitRequirementsModelPackage.MULTIPLICATION__LEFT_OPERAND, null, msgs);
      msgs = basicSetLeftOperand(newLeftOperand, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FwitRequirementsModelPackage.MULTIPLICATION__LEFT_OPERAND, newLeftOperand, newLeftOperand));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOperator()
  {
    return operator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperator(String newOperator)
  {
    String oldOperator = operator;
    operator = newOperator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FwitRequirementsModelPackage.MULTIPLICATION__OPERATOR, oldOperator, operator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BasicExpression getRightOperand()
  {
    return rightOperand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRightOperand(BasicExpression newRightOperand, NotificationChain msgs)
  {
    BasicExpression oldRightOperand = rightOperand;
    rightOperand = newRightOperand;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FwitRequirementsModelPackage.MULTIPLICATION__RIGHT_OPERAND, oldRightOperand, newRightOperand);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRightOperand(BasicExpression newRightOperand)
  {
    if (newRightOperand != rightOperand)
    {
      NotificationChain msgs = null;
      if (rightOperand != null)
        msgs = ((InternalEObject)rightOperand).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FwitRequirementsModelPackage.MULTIPLICATION__RIGHT_OPERAND, null, msgs);
      if (newRightOperand != null)
        msgs = ((InternalEObject)newRightOperand).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FwitRequirementsModelPackage.MULTIPLICATION__RIGHT_OPERAND, null, msgs);
      msgs = basicSetRightOperand(newRightOperand, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FwitRequirementsModelPackage.MULTIPLICATION__RIGHT_OPERAND, newRightOperand, newRightOperand));
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
      case FwitRequirementsModelPackage.MULTIPLICATION__LEFT_OPERAND:
        return basicSetLeftOperand(null, msgs);
      case FwitRequirementsModelPackage.MULTIPLICATION__RIGHT_OPERAND:
        return basicSetRightOperand(null, msgs);
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
      case FwitRequirementsModelPackage.MULTIPLICATION__LEFT_OPERAND:
        return getLeftOperand();
      case FwitRequirementsModelPackage.MULTIPLICATION__OPERATOR:
        return getOperator();
      case FwitRequirementsModelPackage.MULTIPLICATION__RIGHT_OPERAND:
        return getRightOperand();
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
      case FwitRequirementsModelPackage.MULTIPLICATION__LEFT_OPERAND:
        setLeftOperand((BasicExpression)newValue);
        return;
      case FwitRequirementsModelPackage.MULTIPLICATION__OPERATOR:
        setOperator((String)newValue);
        return;
      case FwitRequirementsModelPackage.MULTIPLICATION__RIGHT_OPERAND:
        setRightOperand((BasicExpression)newValue);
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
      case FwitRequirementsModelPackage.MULTIPLICATION__LEFT_OPERAND:
        setLeftOperand((BasicExpression)null);
        return;
      case FwitRequirementsModelPackage.MULTIPLICATION__OPERATOR:
        setOperator(OPERATOR_EDEFAULT);
        return;
      case FwitRequirementsModelPackage.MULTIPLICATION__RIGHT_OPERAND:
        setRightOperand((BasicExpression)null);
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
      case FwitRequirementsModelPackage.MULTIPLICATION__LEFT_OPERAND:
        return leftOperand != null;
      case FwitRequirementsModelPackage.MULTIPLICATION__OPERATOR:
        return OPERATOR_EDEFAULT == null ? operator != null : !OPERATOR_EDEFAULT.equals(operator);
      case FwitRequirementsModelPackage.MULTIPLICATION__RIGHT_OPERAND:
        return rightOperand != null;
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
    result.append(" (operator: ");
    result.append(operator);
    result.append(')');
    return result.toString();
  }

} //MultiplicationImpl
