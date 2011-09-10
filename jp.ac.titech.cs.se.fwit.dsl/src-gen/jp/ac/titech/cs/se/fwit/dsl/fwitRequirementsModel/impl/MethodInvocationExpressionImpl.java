/**
 * <copyright>
 * </copyright>
 *
 */
package jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl;

import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.FwitRequirementsModelPackage;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.MethodInvocation;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.MethodInvocationExpression;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.VariableDeclaration;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Invocation Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.MethodInvocationExpressionImpl#getReceiver <em>Receiver</em>}</li>
 *   <li>{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.MethodInvocationExpressionImpl#getMethod <em>Method</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MethodInvocationExpressionImpl extends BasicExpressionImpl implements MethodInvocationExpression
{
  /**
   * The cached value of the '{@link #getReceiver() <em>Receiver</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReceiver()
   * @generated
   * @ordered
   */
  protected VariableDeclaration receiver;

  /**
   * The cached value of the '{@link #getMethod() <em>Method</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethod()
   * @generated
   * @ordered
   */
  protected MethodInvocation method;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MethodInvocationExpressionImpl()
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
    return FwitRequirementsModelPackage.Literals.METHOD_INVOCATION_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDeclaration getReceiver()
  {
    if (receiver != null && receiver.eIsProxy())
    {
      InternalEObject oldReceiver = (InternalEObject)receiver;
      receiver = (VariableDeclaration)eResolveProxy(oldReceiver);
      if (receiver != oldReceiver)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, FwitRequirementsModelPackage.METHOD_INVOCATION_EXPRESSION__RECEIVER, oldReceiver, receiver));
      }
    }
    return receiver;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDeclaration basicGetReceiver()
  {
    return receiver;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReceiver(VariableDeclaration newReceiver)
  {
    VariableDeclaration oldReceiver = receiver;
    receiver = newReceiver;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FwitRequirementsModelPackage.METHOD_INVOCATION_EXPRESSION__RECEIVER, oldReceiver, receiver));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethodInvocation getMethod()
  {
    return method;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMethod(MethodInvocation newMethod, NotificationChain msgs)
  {
    MethodInvocation oldMethod = method;
    method = newMethod;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FwitRequirementsModelPackage.METHOD_INVOCATION_EXPRESSION__METHOD, oldMethod, newMethod);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMethod(MethodInvocation newMethod)
  {
    if (newMethod != method)
    {
      NotificationChain msgs = null;
      if (method != null)
        msgs = ((InternalEObject)method).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FwitRequirementsModelPackage.METHOD_INVOCATION_EXPRESSION__METHOD, null, msgs);
      if (newMethod != null)
        msgs = ((InternalEObject)newMethod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FwitRequirementsModelPackage.METHOD_INVOCATION_EXPRESSION__METHOD, null, msgs);
      msgs = basicSetMethod(newMethod, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FwitRequirementsModelPackage.METHOD_INVOCATION_EXPRESSION__METHOD, newMethod, newMethod));
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
      case FwitRequirementsModelPackage.METHOD_INVOCATION_EXPRESSION__METHOD:
        return basicSetMethod(null, msgs);
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
      case FwitRequirementsModelPackage.METHOD_INVOCATION_EXPRESSION__RECEIVER:
        if (resolve) return getReceiver();
        return basicGetReceiver();
      case FwitRequirementsModelPackage.METHOD_INVOCATION_EXPRESSION__METHOD:
        return getMethod();
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
      case FwitRequirementsModelPackage.METHOD_INVOCATION_EXPRESSION__RECEIVER:
        setReceiver((VariableDeclaration)newValue);
        return;
      case FwitRequirementsModelPackage.METHOD_INVOCATION_EXPRESSION__METHOD:
        setMethod((MethodInvocation)newValue);
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
      case FwitRequirementsModelPackage.METHOD_INVOCATION_EXPRESSION__RECEIVER:
        setReceiver((VariableDeclaration)null);
        return;
      case FwitRequirementsModelPackage.METHOD_INVOCATION_EXPRESSION__METHOD:
        setMethod((MethodInvocation)null);
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
      case FwitRequirementsModelPackage.METHOD_INVOCATION_EXPRESSION__RECEIVER:
        return receiver != null;
      case FwitRequirementsModelPackage.METHOD_INVOCATION_EXPRESSION__METHOD:
        return method != null;
    }
    return super.eIsSet(featureID);
  }

} //MethodInvocationExpressionImpl
