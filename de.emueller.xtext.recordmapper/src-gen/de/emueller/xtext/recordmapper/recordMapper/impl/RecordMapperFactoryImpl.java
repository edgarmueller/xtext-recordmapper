/**
 */
package de.emueller.xtext.recordmapper.recordMapper.impl;

import de.emueller.xtext.recordmapper.recordMapper.Annotation;
import de.emueller.xtext.recordmapper.recordMapper.BaseType;
import de.emueller.xtext.recordmapper.recordMapper.Declaration;
import de.emueller.xtext.recordmapper.recordMapper.Entry;
import de.emueller.xtext.recordmapper.recordMapper.Field;
import de.emueller.xtext.recordmapper.recordMapper.Import;
import de.emueller.xtext.recordmapper.recordMapper.ListType;
import de.emueller.xtext.recordmapper.recordMapper.RecordMapperFactory;
import de.emueller.xtext.recordmapper.recordMapper.RecordMapperPackage;
import de.emueller.xtext.recordmapper.recordMapper.RecordMappperFile;
import de.emueller.xtext.recordmapper.recordMapper.Type;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RecordMapperFactoryImpl extends EFactoryImpl implements RecordMapperFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RecordMapperFactory init()
  {
    try
    {
      RecordMapperFactory theRecordMapperFactory = (RecordMapperFactory)EPackage.Registry.INSTANCE.getEFactory(RecordMapperPackage.eNS_URI);
      if (theRecordMapperFactory != null)
      {
        return theRecordMapperFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new RecordMapperFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RecordMapperFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case RecordMapperPackage.RECORD_MAPPPER_FILE: return createRecordMappperFile();
      case RecordMapperPackage.IMPORT: return createImport();
      case RecordMapperPackage.DECLARATION: return createDeclaration();
      case RecordMapperPackage.OBJECT: return createObject();
      case RecordMapperPackage.ENUM: return createEnum();
      case RecordMapperPackage.FIELD: return createField();
      case RecordMapperPackage.ANNOTATION: return createAnnotation();
      case RecordMapperPackage.ENTRY: return createEntry();
      case RecordMapperPackage.BASE_TYPE: return createBaseType();
      case RecordMapperPackage.LIST_TYPE: return createListType();
      case RecordMapperPackage.TYPE: return createType();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RecordMappperFile createRecordMappperFile()
  {
    RecordMappperFileImpl recordMappperFile = new RecordMappperFileImpl();
    return recordMappperFile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Declaration createDeclaration()
  {
    DeclarationImpl declaration = new DeclarationImpl();
    return declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public de.emueller.xtext.recordmapper.recordMapper.Object createObject()
  {
    ObjectImpl object = new ObjectImpl();
    return object;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public de.emueller.xtext.recordmapper.recordMapper.Enum createEnum()
  {
    EnumImpl enum_ = new EnumImpl();
    return enum_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Field createField()
  {
    FieldImpl field = new FieldImpl();
    return field;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Annotation createAnnotation()
  {
    AnnotationImpl annotation = new AnnotationImpl();
    return annotation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entry createEntry()
  {
    EntryImpl entry = new EntryImpl();
    return entry;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BaseType createBaseType()
  {
    BaseTypeImpl baseType = new BaseTypeImpl();
    return baseType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListType createListType()
  {
    ListTypeImpl listType = new ListTypeImpl();
    return listType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RecordMapperPackage getRecordMapperPackage()
  {
    return (RecordMapperPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static RecordMapperPackage getPackage()
  {
    return RecordMapperPackage.eINSTANCE;
  }

} //RecordMapperFactoryImpl
