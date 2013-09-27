/**
 */
package de.emueller.xtext.recordmapper.recordMapper;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.emueller.xtext.recordmapper.recordMapper.ListType#getRecord <em>Record</em>}</li>
 *   <li>{@link de.emueller.xtext.recordmapper.recordMapper.ListType#getBaseType <em>Base Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.emueller.xtext.recordmapper.recordMapper.RecordMapperPackage#getListType()
 * @model
 * @generated
 */
public interface ListType extends Type
{
  /**
   * Returns the value of the '<em><b>Record</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Record</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Record</em>' reference.
   * @see #setRecord(de.emueller.xtext.recordmapper.recordMapper.Object)
   * @see de.emueller.xtext.recordmapper.recordMapper.RecordMapperPackage#getListType_Record()
   * @model
   * @generated
   */
  de.emueller.xtext.recordmapper.recordMapper.Object getRecord();

  /**
   * Sets the value of the '{@link de.emueller.xtext.recordmapper.recordMapper.ListType#getRecord <em>Record</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Record</em>' reference.
   * @see #getRecord()
   * @generated
   */
  void setRecord(de.emueller.xtext.recordmapper.recordMapper.Object value);

  /**
   * Returns the value of the '<em><b>Base Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Base Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Base Type</em>' containment reference.
   * @see #setBaseType(BaseType)
   * @see de.emueller.xtext.recordmapper.recordMapper.RecordMapperPackage#getListType_BaseType()
   * @model containment="true"
   * @generated
   */
  BaseType getBaseType();

  /**
   * Sets the value of the '{@link de.emueller.xtext.recordmapper.recordMapper.ListType#getBaseType <em>Base Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Base Type</em>' containment reference.
   * @see #getBaseType()
   * @generated
   */
  void setBaseType(BaseType value);

} // ListType
