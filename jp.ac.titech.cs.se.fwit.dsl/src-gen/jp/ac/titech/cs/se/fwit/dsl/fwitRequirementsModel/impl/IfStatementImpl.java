/**
 * <copyright>
 * </copyright>
 *
 */
package jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl;

import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Block;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.ElseBlock;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.FwitRequirementsModelPackage;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.IfStatement;
import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.ParExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.IfStatementImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.IfStatementImpl#getThenBlok <em>Then Blok</em>}</li>
 *   <li>{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.IfStatementImpl#getElseBlock <em>Else Block</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfStatementImpl extends StatementImpl implements IfStatement
{
  /**
   * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected ParExpression condition;

  /**
   * The cached value of the '{@link #getThenBlok() <em>Then Blok</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThenBlok()
   * @generated
   * @ordered
   */
  protected Block thenBlok;

  /**
   * The cached value of the '{@link #getElseBlock() <em>Else Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElseBlock()
   * @generated
   * @ordered
   */
  protected ElseBlock elseBlock;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IfStatementImpl()
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
    return FwitRequirementsModelPackage.Literals.IF_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParExpression getCondition()
  {
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCondition(ParExpression newCondition, NotificationChain msgs)
  {
    ParExpression oldCondition = condition;
    condition = newCondition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FwitRequirementsModelPackage.IF_STATEMENT__CONDITION, oldCondition, newCondition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCondition(ParExpression newCondition)
  {
    if (newCondition != condition)
    {
      NotificationChain msgs = null;
      if (condition != null)
        msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FwitRequirementsModelPackage.IF_STATEMENT__CONDITION, null, msgs);
      if (newCondition != null)
        msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FwitRequirementsModelPackage.IF_STATEMENT__CONDITION, null, msgs);
      msgs = basicSetCondition(newCondition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FwitRequirementsModelPackage.IF_STATEMENT__CONDITION, newCondition, newCondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Block getThenBlok()
  {
    return thenBlok;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetThenBlok(Block newThenBlok, NotificationChain msgs)
  {
    Block oldThenBlok = thenBlok;
    thenBlok = newThenBlok;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FwitRequirementsModelPackage.IF_STATEMENT__THEN_BLOK, oldThenBlok, newThenBlok);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setThenBlok(Block newThenBlok)
  {
    if (newThenBlok != thenBlok)
    {
      NotificationChain msgs = null;
      if (thenBlok != null)
        msgs = ((InternalEObject)thenBlok).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FwitRequirementsModelPackage.IF_STATEMENT__THEN_BLOK, null, msgs);
      if (newThenBlok != null)
        msgs = ((InternalEObject)newThenBlok).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FwitRequirementsModelPackage.IF_STATEMENT__THEN_BLOK, null, msgs);
      msgs = basicSetThenBlok(newThenBlok, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FwitRequirementsModelPackage.IF_STATEMENT__THEN_BLOK, newThenBlok, newThenBlok));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElseBlock getElseBlock()
  {
    return elseBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElseBlock(ElseBlock newElseBlock, NotificationChain msgs)
  {
    ElseBlock oldElseBlock = elseBlock;
    elseBlock = newElseBlock;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FwitRequirementsModelPackage.IF_STATEMENT__ELSE_BLOCK, oldElseBlock, newElseBlock);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElseBlock(ElseBlock newElseBlock)
  {
    if (newElseBlock != elseBlock)
    {
      NotificationChain msgs = null;
      if (elseBlock != null)
        msgs = ((InternalEObject)elseBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FwitRequirementsModelPackage.IF_STATEMENT__ELSE_BLOCK, null, msgs);
      if (newElseBlock != null)
        msgs = ((InternalEObject)newElseBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FwitRequirementsModelPackage.IF_STATEMENT__ELSE_BLOCK, null, msgs);
      msgs = basicSetElseBlock(newElseBlock, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FwitRequirementsModelPackage.IF_STATEMENT__ELSE_BLOCK, newElseBlock, newElseBlock));
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
      case FwitRequirementsModelPackage.IF_STATEMENT__CONDITION:
        return basicSetCondition(null, msgs);
      case FwitRequirementsModelPackage.IF_STATEMENT__THEN_BLOK:
        return basicSetThenBlok(null, msgs);
      case FwitRequirementsModelPackage.IF_STATEMENT__ELSE_BLOCK:
        return basicSetElseBlock(null, msgs);
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
      case FwitRequirementsModelPackage.IF_STATEMENT__CONDITION:
        return getCondition();
      case FwitRequirementsModelPackage.IF_STATEMENT__THEN_BLOK:
        return getThenBlok();
      case FwitRequirementsModelPackage.IF_STATEMENT__ELSE_BLOCK:
        return getElseBlock();
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
      case FwitRequirementsModelPackage.IF_STATEMENT__CONDITION:
        setCondition((ParExpression)newValue);
        return;
      case FwitRequirementsModelPackage.IF_STATEMENT__THEN_BLOK:
        setThenBlok((Block)newValue);
        return;
      case FwitRequirementsModelPackage.IF_STATEMENT__ELSE_BLOCK:
        setElseBlock((ElseBlock)newValue);
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
      case FwitRequirementsModelPackage.IF_STATEMENT__CONDITION:
        setCondition((ParExpression)null);
        return;
      case FwitRequirementsModelPackage.IF_STATEMENT__THEN_BLOK:
        setThenBlok((Block)null);
        return;
      case FwitRequirementsModelPackage.IF_STATEMENT__ELSE_BLOCK:
        setElseBlock((ElseBlock)null);
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
      case FwitRequirementsModelPackage.IF_STATEMENT__CONDITION:
        return condition != null;
      case FwitRequirementsModelPackage.IF_STATEMENT__THEN_BLOK:
        return thenBlok != null;
      case FwitRequirementsModelPackage.IF_STATEMENT__ELSE_BLOCK:
        return elseBlock != null;
    }
    return super.eIsSet(featureID);
  }

} //IfStatementImpl
