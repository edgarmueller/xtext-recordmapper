/**
 */
package de.emueller.xtext.recordmapper.recordMapper;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Record Mappper File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.emueller.xtext.recordmapper.recordMapper.RecordMappperFile#getPackage <em>Package</em>}</li>
 *   <li>{@link de.emueller.xtext.recordmapper.recordMapper.RecordMappperFile#getImports <em>Imports</em>}</li>
 *   <li>{@link de.emueller.xtext.recordmapper.recordMapper.RecordMappperFile#getDeclarations <em>Declarations</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.emueller.xtext.recordmapper.recordMapper.RecordMapperPackage#getRecordMappperFile()
 * @model
 * @generated
 */
public interface RecordMappperFile extends EObject
{
  /**
   * Returns the value of the '<em><b>Package</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Package</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Package</em>' attribute.
   * @see #setPackage(String)
   * @see de.emueller.xtext.recordmapper.recordMapper.RecordMapperPackage#getRecordMappperFile_Package()
   * @model
   * @generated
   */
  String getPackage();

  /**
   * Sets the value of the '{@link de.emueller.xtext.recordmapper.recordMapper.RecordMappperFile#getPackage <em>Package</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Package</em>' attribute.
   * @see #getPackage()
   * @generated
   */
  void setPackage(String value);

  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link de.emueller.xtext.recordmapper.recordMapper.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see de.emueller.xtext.recordmapper.recordMapper.RecordMapperPackage#getRecordMappperFile_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImports();

  /**
   * Returns the value of the '<em><b>Declarations</b></em>' containment reference list.
   * The list contents are of type {@link de.emueller.xtext.recordmapper.recordMapper.Declaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declarations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declarations</em>' containment reference list.
   * @see de.emueller.xtext.recordmapper.recordMapper.RecordMapperPackage#getRecordMappperFile_Declarations()
   * @model containment="true"
   * @generated
   */
  EList<Declaration> getDeclarations();

} // RecordMappperFile
