/**
 */
package de.emueller.xtext.recordmapper.recordMapper;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.emueller.xtext.recordmapper.recordMapper.Type#getDecl <em>Decl</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.emueller.xtext.recordmapper.recordMapper.RecordMapperPackage#getType()
 * @model
 * @generated
 */
public interface Type extends EObject
{
  /**
   * Returns the value of the '<em><b>Decl</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Decl</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Decl</em>' reference.
   * @see #setDecl(Declaration)
   * @see de.emueller.xtext.recordmapper.recordMapper.RecordMapperPackage#getType_Decl()
   * @model
   * @generated
   */
  Declaration getDecl();

  /**
   * Sets the value of the '{@link de.emueller.xtext.recordmapper.recordMapper.Type#getDecl <em>Decl</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Decl</em>' reference.
   * @see #getDecl()
   * @generated
   */
  void setDecl(Declaration value);

} // Type
