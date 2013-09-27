/**
 */
package de.emueller.xtext.recordmapper.recordMapper.impl;

import de.emueller.xtext.recordmapper.recordMapper.BaseType;
import de.emueller.xtext.recordmapper.recordMapper.ListType;
import de.emueller.xtext.recordmapper.recordMapper.RecordMapperPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.emueller.xtext.recordmapper.recordMapper.impl.ListTypeImpl#getRecord <em>Record</em>}</li>
 *   <li>{@link de.emueller.xtext.recordmapper.recordMapper.impl.ListTypeImpl#getBaseType <em>Base Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ListTypeImpl extends TypeImpl implements ListType
{
  /**
   * The cached value of the '{@link #getRecord() <em>Record</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRecord()
   * @generated
   * @ordered
   */
  protected de.emueller.xtext.recordmapper.recordMapper.Object record;

  /**
   * The cached value of the '{@link #getBaseType() <em>Base Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBaseType()
   * @generated
   * @ordered
   */
  protected BaseType baseType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ListTypeImpl()
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
    return RecordMapperPackage.Literals.LIST_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public de.emueller.xtext.recordmapper.recordMapper.Object getRecord()
  {
    if (record != null && record.eIsProxy())
    {
      InternalEObject oldRecord = (InternalEObject)record;
      record = (de.emueller.xtext.recordmapper.recordMapper.Object)eResolveProxy(oldRecord);
      if (record != oldRecord)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RecordMapperPackage.LIST_TYPE__RECORD, oldRecord, record));
      }
    }
    return record;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public de.emueller.xtext.recordmapper.recordMapper.Object basicGetRecord()
  {
    return record;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRecord(de.emueller.xtext.recordmapper.recordMapper.Object newRecord)
  {
    de.emueller.xtext.recordmapper.recordMapper.Object oldRecord = record;
    record = newRecord;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RecordMapperPackage.LIST_TYPE__RECORD, oldRecord, record));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BaseType getBaseType()
  {
    return baseType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBaseType(BaseType newBaseType, NotificationChain msgs)
  {
    BaseType oldBaseType = baseType;
    baseType = newBaseType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RecordMapperPackage.LIST_TYPE__BASE_TYPE, oldBaseType, newBaseType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBaseType(BaseType newBaseType)
  {
    if (newBaseType != baseType)
    {
      NotificationChain msgs = null;
      if (baseType != null)
        msgs = ((InternalEObject)baseType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RecordMapperPackage.LIST_TYPE__BASE_TYPE, null, msgs);
      if (newBaseType != null)
        msgs = ((InternalEObject)newBaseType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RecordMapperPackage.LIST_TYPE__BASE_TYPE, null, msgs);
      msgs = basicSetBaseType(newBaseType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RecordMapperPackage.LIST_TYPE__BASE_TYPE, newBaseType, newBaseType));
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
      case RecordMapperPackage.LIST_TYPE__BASE_TYPE:
        return basicSetBaseType(null, msgs);
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
      case RecordMapperPackage.LIST_TYPE__RECORD:
        if (resolve) return getRecord();
        return basicGetRecord();
      case RecordMapperPackage.LIST_TYPE__BASE_TYPE:
        return getBaseType();
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
      case RecordMapperPackage.LIST_TYPE__RECORD:
        setRecord((de.emueller.xtext.recordmapper.recordMapper.Object)newValue);
        return;
      case RecordMapperPackage.LIST_TYPE__BASE_TYPE:
        setBaseType((BaseType)newValue);
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
      case RecordMapperPackage.LIST_TYPE__RECORD:
        setRecord((de.emueller.xtext.recordmapper.recordMapper.Object)null);
        return;
      case RecordMapperPackage.LIST_TYPE__BASE_TYPE:
        setBaseType((BaseType)null);
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
      case RecordMapperPackage.LIST_TYPE__RECORD:
        return record != null;
      case RecordMapperPackage.LIST_TYPE__BASE_TYPE:
        return baseType != null;
    }
    return super.eIsSet(featureID);
  }

} //ListTypeImpl
