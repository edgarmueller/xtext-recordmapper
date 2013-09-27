/**
 */
package de.emueller.xtext.recordmapper.recordMapper;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.emueller.xtext.recordmapper.recordMapper.Object#getFields <em>Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.emueller.xtext.recordmapper.recordMapper.RecordMapperPackage#getObject()
 * @model
 * @generated
 */
public interface Object extends Declaration
{
  /**
   * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
   * The list contents are of type {@link de.emueller.xtext.recordmapper.recordMapper.Field}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fields</em>' containment reference list.
   * @see de.emueller.xtext.recordmapper.recordMapper.RecordMapperPackage#getObject_Fields()
   * @model containment="true"
   * @generated
   */
  EList<Field> getFields();

} // Object
