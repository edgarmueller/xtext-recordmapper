/**
 */
package de.emueller.xtext.recordmapper.recordMapper;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.emueller.xtext.recordmapper.recordMapper.RecordMapperFactory
 * @model kind="package"
 * @generated
 */
public interface RecordMapperPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "recordMapper";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.emueller.de/xtext/recordmapper/RecordMapper";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "recordMapper";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RecordMapperPackage eINSTANCE = de.emueller.xtext.recordmapper.recordMapper.impl.RecordMapperPackageImpl.init();

  /**
   * The meta object id for the '{@link de.emueller.xtext.recordmapper.recordMapper.impl.RecordMappperFileImpl <em>Record Mappper File</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.emueller.xtext.recordmapper.recordMapper.impl.RecordMappperFileImpl
   * @see de.emueller.xtext.recordmapper.recordMapper.impl.RecordMapperPackageImpl#getRecordMappperFile()
   * @generated
   */
  int RECORD_MAPPPER_FILE = 0;

  /**
   * The feature id for the '<em><b>Package</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_MAPPPER_FILE__PACKAGE = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_MAPPPER_FILE__IMPORTS = 1;

  /**
   * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_MAPPPER_FILE__DECLARATIONS = 2;

  /**
   * The number of structural features of the '<em>Record Mappper File</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_MAPPPER_FILE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.emueller.xtext.recordmapper.recordMapper.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.emueller.xtext.recordmapper.recordMapper.impl.ImportImpl
   * @see de.emueller.xtext.recordmapper.recordMapper.impl.RecordMapperPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 1;

  /**
   * The feature id for the '<em><b>Model</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__MODEL = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.emueller.xtext.recordmapper.recordMapper.impl.DeclarationImpl <em>Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.emueller.xtext.recordmapper.recordMapper.impl.DeclarationImpl
   * @see de.emueller.xtext.recordmapper.recordMapper.impl.RecordMapperPackageImpl#getDeclaration()
   * @generated
   */
  int DECLARATION = 2;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__NAME = 1;

  /**
   * The number of structural features of the '<em>Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.emueller.xtext.recordmapper.recordMapper.impl.ObjectImpl <em>Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.emueller.xtext.recordmapper.recordMapper.impl.ObjectImpl
   * @see de.emueller.xtext.recordmapper.recordMapper.impl.RecordMapperPackageImpl#getObject()
   * @generated
   */
  int OBJECT = 3;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT__TYPE = DECLARATION__TYPE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT__NAME = DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT__FIELDS = DECLARATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.emueller.xtext.recordmapper.recordMapper.impl.EnumImpl <em>Enum</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.emueller.xtext.recordmapper.recordMapper.impl.EnumImpl
   * @see de.emueller.xtext.recordmapper.recordMapper.impl.RecordMapperPackageImpl#getEnum()
   * @generated
   */
  int ENUM = 4;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM__TYPE = DECLARATION__TYPE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM__NAME = DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Values</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM__VALUES = DECLARATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Enum</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.emueller.xtext.recordmapper.recordMapper.impl.FieldImpl <em>Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.emueller.xtext.recordmapper.recordMapper.impl.FieldImpl
   * @see de.emueller.xtext.recordmapper.recordMapper.impl.RecordMapperPackageImpl#getField()
   * @generated
   */
  int FIELD = 5;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__NAME = 1;

  /**
   * The feature id for the '<em><b>Annotation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__ANNOTATION = 2;

  /**
   * The number of structural features of the '<em>Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.emueller.xtext.recordmapper.recordMapper.impl.AnnotationImpl <em>Annotation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.emueller.xtext.recordmapper.recordMapper.impl.AnnotationImpl
   * @see de.emueller.xtext.recordmapper.recordMapper.impl.RecordMapperPackageImpl#getAnnotation()
   * @generated
   */
  int ANNOTATION = 6;

  /**
   * The feature id for the '<em><b>Entries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__ENTRIES = 0;

  /**
   * The number of structural features of the '<em>Annotation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.emueller.xtext.recordmapper.recordMapper.impl.EntryImpl <em>Entry</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.emueller.xtext.recordmapper.recordMapper.impl.EntryImpl
   * @see de.emueller.xtext.recordmapper.recordMapper.impl.RecordMapperPackageImpl#getEntry()
   * @generated
   */
  int ENTRY = 7;

  /**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTRY__KEY = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTRY__VALUE = 1;

  /**
   * The number of structural features of the '<em>Entry</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTRY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.emueller.xtext.recordmapper.recordMapper.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.emueller.xtext.recordmapper.recordMapper.impl.TypeImpl
   * @see de.emueller.xtext.recordmapper.recordMapper.impl.RecordMapperPackageImpl#getType()
   * @generated
   */
  int TYPE = 10;

  /**
   * The feature id for the '<em><b>Decl</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__DECL = 0;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.emueller.xtext.recordmapper.recordMapper.impl.BaseTypeImpl <em>Base Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.emueller.xtext.recordmapper.recordMapper.impl.BaseTypeImpl
   * @see de.emueller.xtext.recordmapper.recordMapper.impl.RecordMapperPackageImpl#getBaseType()
   * @generated
   */
  int BASE_TYPE = 8;

  /**
   * The feature id for the '<em><b>Decl</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASE_TYPE__DECL = TYPE__DECL;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASE_TYPE__TYPE = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Base Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASE_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.emueller.xtext.recordmapper.recordMapper.impl.ListTypeImpl <em>List Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.emueller.xtext.recordmapper.recordMapper.impl.ListTypeImpl
   * @see de.emueller.xtext.recordmapper.recordMapper.impl.RecordMapperPackageImpl#getListType()
   * @generated
   */
  int LIST_TYPE = 9;

  /**
   * The feature id for the '<em><b>Decl</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_TYPE__DECL = TYPE__DECL;

  /**
   * The feature id for the '<em><b>Record</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_TYPE__RECORD = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Base Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_TYPE__BASE_TYPE = TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>List Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;


  /**
   * Returns the meta object for class '{@link de.emueller.xtext.recordmapper.recordMapper.RecordMappperFile <em>Record Mappper File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Record Mappper File</em>'.
   * @see de.emueller.xtext.recordmapper.recordMapper.RecordMappperFile
   * @generated
   */
  EClass getRecordMappperFile();

  /**
   * Returns the meta object for the attribute '{@link de.emueller.xtext.recordmapper.recordMapper.RecordMappperFile#getPackage <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Package</em>'.
   * @see de.emueller.xtext.recordmapper.recordMapper.RecordMappperFile#getPackage()
   * @see #getRecordMappperFile()
   * @generated
   */
  EAttribute getRecordMappperFile_Package();

  /**
   * Returns the meta object for the containment reference list '{@link de.emueller.xtext.recordmapper.recordMapper.RecordMappperFile#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see de.emueller.xtext.recordmapper.recordMapper.RecordMappperFile#getImports()
   * @see #getRecordMappperFile()
   * @generated
   */
  EReference getRecordMappperFile_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link de.emueller.xtext.recordmapper.recordMapper.RecordMappperFile#getDeclarations <em>Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Declarations</em>'.
   * @see de.emueller.xtext.recordmapper.recordMapper.RecordMappperFile#getDeclarations()
   * @see #getRecordMappperFile()
   * @generated
   */
  EReference getRecordMappperFile_Declarations();

  /**
   * Returns the meta object for class '{@link de.emueller.xtext.recordmapper.recordMapper.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see de.emueller.xtext.recordmapper.recordMapper.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link de.emueller.xtext.recordmapper.recordMapper.Import#getModel <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Model</em>'.
   * @see de.emueller.xtext.recordmapper.recordMapper.Import#getModel()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_Model();

  /**
   * Returns the meta object for class '{@link de.emueller.xtext.recordmapper.recordMapper.Declaration <em>Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Declaration</em>'.
   * @see de.emueller.xtext.recordmapper.recordMapper.Declaration
   * @generated
   */
  EClass getDeclaration();

  /**
   * Returns the meta object for the attribute '{@link de.emueller.xtext.recordmapper.recordMapper.Declaration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see de.emueller.xtext.recordmapper.recordMapper.Declaration#getType()
   * @see #getDeclaration()
   * @generated
   */
  EAttribute getDeclaration_Type();

  /**
   * Returns the meta object for the attribute '{@link de.emueller.xtext.recordmapper.recordMapper.Declaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.emueller.xtext.recordmapper.recordMapper.Declaration#getName()
   * @see #getDeclaration()
   * @generated
   */
  EAttribute getDeclaration_Name();

  /**
   * Returns the meta object for class '{@link de.emueller.xtext.recordmapper.recordMapper.Object <em>Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object</em>'.
   * @see de.emueller.xtext.recordmapper.recordMapper.Object
   * @generated
   */
  EClass getObject();

  /**
   * Returns the meta object for the containment reference list '{@link de.emueller.xtext.recordmapper.recordMapper.Object#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fields</em>'.
   * @see de.emueller.xtext.recordmapper.recordMapper.Object#getFields()
   * @see #getObject()
   * @generated
   */
  EReference getObject_Fields();

  /**
   * Returns the meta object for class '{@link de.emueller.xtext.recordmapper.recordMapper.Enum <em>Enum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum</em>'.
   * @see de.emueller.xtext.recordmapper.recordMapper.Enum
   * @generated
   */
  EClass getEnum();

  /**
   * Returns the meta object for the attribute list '{@link de.emueller.xtext.recordmapper.recordMapper.Enum#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Values</em>'.
   * @see de.emueller.xtext.recordmapper.recordMapper.Enum#getValues()
   * @see #getEnum()
   * @generated
   */
  EAttribute getEnum_Values();

  /**
   * Returns the meta object for class '{@link de.emueller.xtext.recordmapper.recordMapper.Field <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field</em>'.
   * @see de.emueller.xtext.recordmapper.recordMapper.Field
   * @generated
   */
  EClass getField();

  /**
   * Returns the meta object for the containment reference '{@link de.emueller.xtext.recordmapper.recordMapper.Field#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see de.emueller.xtext.recordmapper.recordMapper.Field#getType()
   * @see #getField()
   * @generated
   */
  EReference getField_Type();

  /**
   * Returns the meta object for the attribute '{@link de.emueller.xtext.recordmapper.recordMapper.Field#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.emueller.xtext.recordmapper.recordMapper.Field#getName()
   * @see #getField()
   * @generated
   */
  EAttribute getField_Name();

  /**
   * Returns the meta object for the containment reference '{@link de.emueller.xtext.recordmapper.recordMapper.Field#getAnnotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Annotation</em>'.
   * @see de.emueller.xtext.recordmapper.recordMapper.Field#getAnnotation()
   * @see #getField()
   * @generated
   */
  EReference getField_Annotation();

  /**
   * Returns the meta object for class '{@link de.emueller.xtext.recordmapper.recordMapper.Annotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotation</em>'.
   * @see de.emueller.xtext.recordmapper.recordMapper.Annotation
   * @generated
   */
  EClass getAnnotation();

  /**
   * Returns the meta object for the containment reference list '{@link de.emueller.xtext.recordmapper.recordMapper.Annotation#getEntries <em>Entries</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entries</em>'.
   * @see de.emueller.xtext.recordmapper.recordMapper.Annotation#getEntries()
   * @see #getAnnotation()
   * @generated
   */
  EReference getAnnotation_Entries();

  /**
   * Returns the meta object for class '{@link de.emueller.xtext.recordmapper.recordMapper.Entry <em>Entry</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entry</em>'.
   * @see de.emueller.xtext.recordmapper.recordMapper.Entry
   * @generated
   */
  EClass getEntry();

  /**
   * Returns the meta object for the attribute '{@link de.emueller.xtext.recordmapper.recordMapper.Entry#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Key</em>'.
   * @see de.emueller.xtext.recordmapper.recordMapper.Entry#getKey()
   * @see #getEntry()
   * @generated
   */
  EAttribute getEntry_Key();

  /**
   * Returns the meta object for the attribute '{@link de.emueller.xtext.recordmapper.recordMapper.Entry#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.emueller.xtext.recordmapper.recordMapper.Entry#getValue()
   * @see #getEntry()
   * @generated
   */
  EAttribute getEntry_Value();

  /**
   * Returns the meta object for class '{@link de.emueller.xtext.recordmapper.recordMapper.BaseType <em>Base Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Base Type</em>'.
   * @see de.emueller.xtext.recordmapper.recordMapper.BaseType
   * @generated
   */
  EClass getBaseType();

  /**
   * Returns the meta object for the attribute '{@link de.emueller.xtext.recordmapper.recordMapper.BaseType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see de.emueller.xtext.recordmapper.recordMapper.BaseType#getType()
   * @see #getBaseType()
   * @generated
   */
  EAttribute getBaseType_Type();

  /**
   * Returns the meta object for class '{@link de.emueller.xtext.recordmapper.recordMapper.ListType <em>List Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>List Type</em>'.
   * @see de.emueller.xtext.recordmapper.recordMapper.ListType
   * @generated
   */
  EClass getListType();

  /**
   * Returns the meta object for the reference '{@link de.emueller.xtext.recordmapper.recordMapper.ListType#getRecord <em>Record</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Record</em>'.
   * @see de.emueller.xtext.recordmapper.recordMapper.ListType#getRecord()
   * @see #getListType()
   * @generated
   */
  EReference getListType_Record();

  /**
   * Returns the meta object for the containment reference '{@link de.emueller.xtext.recordmapper.recordMapper.ListType#getBaseType <em>Base Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Base Type</em>'.
   * @see de.emueller.xtext.recordmapper.recordMapper.ListType#getBaseType()
   * @see #getListType()
   * @generated
   */
  EReference getListType_BaseType();

  /**
   * Returns the meta object for class '{@link de.emueller.xtext.recordmapper.recordMapper.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see de.emueller.xtext.recordmapper.recordMapper.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for the reference '{@link de.emueller.xtext.recordmapper.recordMapper.Type#getDecl <em>Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Decl</em>'.
   * @see de.emueller.xtext.recordmapper.recordMapper.Type#getDecl()
   * @see #getType()
   * @generated
   */
  EReference getType_Decl();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  RecordMapperFactory getRecordMapperFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link de.emueller.xtext.recordmapper.recordMapper.impl.RecordMappperFileImpl <em>Record Mappper File</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.emueller.xtext.recordmapper.recordMapper.impl.RecordMappperFileImpl
     * @see de.emueller.xtext.recordmapper.recordMapper.impl.RecordMapperPackageImpl#getRecordMappperFile()
     * @generated
     */
    EClass RECORD_MAPPPER_FILE = eINSTANCE.getRecordMappperFile();

    /**
     * The meta object literal for the '<em><b>Package</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RECORD_MAPPPER_FILE__PACKAGE = eINSTANCE.getRecordMappperFile_Package();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RECORD_MAPPPER_FILE__IMPORTS = eINSTANCE.getRecordMappperFile_Imports();

    /**
     * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RECORD_MAPPPER_FILE__DECLARATIONS = eINSTANCE.getRecordMappperFile_Declarations();

    /**
     * The meta object literal for the '{@link de.emueller.xtext.recordmapper.recordMapper.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.emueller.xtext.recordmapper.recordMapper.impl.ImportImpl
     * @see de.emueller.xtext.recordmapper.recordMapper.impl.RecordMapperPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Model</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__MODEL = eINSTANCE.getImport_Model();

    /**
     * The meta object literal for the '{@link de.emueller.xtext.recordmapper.recordMapper.impl.DeclarationImpl <em>Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.emueller.xtext.recordmapper.recordMapper.impl.DeclarationImpl
     * @see de.emueller.xtext.recordmapper.recordMapper.impl.RecordMapperPackageImpl#getDeclaration()
     * @generated
     */
    EClass DECLARATION = eINSTANCE.getDeclaration();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECLARATION__TYPE = eINSTANCE.getDeclaration_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECLARATION__NAME = eINSTANCE.getDeclaration_Name();

    /**
     * The meta object literal for the '{@link de.emueller.xtext.recordmapper.recordMapper.impl.ObjectImpl <em>Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.emueller.xtext.recordmapper.recordMapper.impl.ObjectImpl
     * @see de.emueller.xtext.recordmapper.recordMapper.impl.RecordMapperPackageImpl#getObject()
     * @generated
     */
    EClass OBJECT = eINSTANCE.getObject();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT__FIELDS = eINSTANCE.getObject_Fields();

    /**
     * The meta object literal for the '{@link de.emueller.xtext.recordmapper.recordMapper.impl.EnumImpl <em>Enum</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.emueller.xtext.recordmapper.recordMapper.impl.EnumImpl
     * @see de.emueller.xtext.recordmapper.recordMapper.impl.RecordMapperPackageImpl#getEnum()
     * @generated
     */
    EClass ENUM = eINSTANCE.getEnum();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM__VALUES = eINSTANCE.getEnum_Values();

    /**
     * The meta object literal for the '{@link de.emueller.xtext.recordmapper.recordMapper.impl.FieldImpl <em>Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.emueller.xtext.recordmapper.recordMapper.impl.FieldImpl
     * @see de.emueller.xtext.recordmapper.recordMapper.impl.RecordMapperPackageImpl#getField()
     * @generated
     */
    EClass FIELD = eINSTANCE.getField();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD__TYPE = eINSTANCE.getField_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD__NAME = eINSTANCE.getField_Name();

    /**
     * The meta object literal for the '<em><b>Annotation</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD__ANNOTATION = eINSTANCE.getField_Annotation();

    /**
     * The meta object literal for the '{@link de.emueller.xtext.recordmapper.recordMapper.impl.AnnotationImpl <em>Annotation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.emueller.xtext.recordmapper.recordMapper.impl.AnnotationImpl
     * @see de.emueller.xtext.recordmapper.recordMapper.impl.RecordMapperPackageImpl#getAnnotation()
     * @generated
     */
    EClass ANNOTATION = eINSTANCE.getAnnotation();

    /**
     * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATION__ENTRIES = eINSTANCE.getAnnotation_Entries();

    /**
     * The meta object literal for the '{@link de.emueller.xtext.recordmapper.recordMapper.impl.EntryImpl <em>Entry</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.emueller.xtext.recordmapper.recordMapper.impl.EntryImpl
     * @see de.emueller.xtext.recordmapper.recordMapper.impl.RecordMapperPackageImpl#getEntry()
     * @generated
     */
    EClass ENTRY = eINSTANCE.getEntry();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTRY__KEY = eINSTANCE.getEntry_Key();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTRY__VALUE = eINSTANCE.getEntry_Value();

    /**
     * The meta object literal for the '{@link de.emueller.xtext.recordmapper.recordMapper.impl.BaseTypeImpl <em>Base Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.emueller.xtext.recordmapper.recordMapper.impl.BaseTypeImpl
     * @see de.emueller.xtext.recordmapper.recordMapper.impl.RecordMapperPackageImpl#getBaseType()
     * @generated
     */
    EClass BASE_TYPE = eINSTANCE.getBaseType();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BASE_TYPE__TYPE = eINSTANCE.getBaseType_Type();

    /**
     * The meta object literal for the '{@link de.emueller.xtext.recordmapper.recordMapper.impl.ListTypeImpl <em>List Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.emueller.xtext.recordmapper.recordMapper.impl.ListTypeImpl
     * @see de.emueller.xtext.recordmapper.recordMapper.impl.RecordMapperPackageImpl#getListType()
     * @generated
     */
    EClass LIST_TYPE = eINSTANCE.getListType();

    /**
     * The meta object literal for the '<em><b>Record</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST_TYPE__RECORD = eINSTANCE.getListType_Record();

    /**
     * The meta object literal for the '<em><b>Base Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST_TYPE__BASE_TYPE = eINSTANCE.getListType_BaseType();

    /**
     * The meta object literal for the '{@link de.emueller.xtext.recordmapper.recordMapper.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.emueller.xtext.recordmapper.recordMapper.impl.TypeImpl
     * @see de.emueller.xtext.recordmapper.recordMapper.impl.RecordMapperPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '<em><b>Decl</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE__DECL = eINSTANCE.getType_Decl();

  }

} //RecordMapperPackage
