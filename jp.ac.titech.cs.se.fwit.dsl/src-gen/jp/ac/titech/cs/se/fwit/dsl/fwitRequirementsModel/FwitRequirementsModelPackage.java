/**
 * <copyright>
 * </copyright>
 *
 */
package jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel;

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
 * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.FwitRequirementsModelFactory
 * @model kind="package"
 * @generated
 */
public interface FwitRequirementsModelPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "fwitRequirementsModel";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.ac.jp/titech/cs/se/fwit/dsl/FwitRequirementsModel";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "fwitRequirementsModel";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  FwitRequirementsModelPackage eINSTANCE = jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.FwitRequirementsModelPackageImpl.init();

  /**
   * The meta object id for the '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.FwitRequirementModelImpl <em>Fwit Requirement Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.FwitRequirementModelImpl
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.FwitRequirementsModelPackageImpl#getFwitRequirementModel()
   * @generated
   */
  int FWIT_REQUIREMENT_MODEL = 0;

  /**
   * The feature id for the '<em><b>System</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FWIT_REQUIREMENT_MODEL__SYSTEM = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FWIT_REQUIREMENT_MODEL__ELEMENTS = 1;

  /**
   * The number of structural features of the '<em>Fwit Requirement Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FWIT_REQUIREMENT_MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.SystemElementImpl <em>System Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.SystemElementImpl
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.FwitRequirementsModelPackageImpl#getSystemElement()
   * @generated
   */
  int SYSTEM_ELEMENT = 1;

  /**
   * The number of structural features of the '<em>System Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.IncludeImpl <em>Include</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.IncludeImpl
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.FwitRequirementsModelPackageImpl#getInclude()
   * @generated
   */
  int INCLUDE = 2;

  /**
   * The feature id for the '<em><b>File</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDE__FILE = SYSTEM_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Include</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCLUDE_FEATURE_COUNT = SYSTEM_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.TypeImpl
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.FwitRequirementsModelPackageImpl#getType()
   * @generated
   */
  int TYPE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__NAME = SYSTEM_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__CLASS_NAME = SYSTEM_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = SYSTEM_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.SystemDeclarationImpl <em>System Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.SystemDeclarationImpl
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.FwitRequirementsModelPackageImpl#getSystemDeclaration()
   * @generated
   */
  int SYSTEM_DECLARATION = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_DECLARATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Framework</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_DECLARATION__FRAMEWORK = 1;

  /**
   * The number of structural features of the '<em>System Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYSTEM_DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.ModuleImpl <em>Module</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.ModuleImpl
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.FwitRequirementsModelPackageImpl#getModule()
   * @generated
   */
  int MODULE = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__NAME = SYSTEM_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__FIELDS = SYSTEM_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Functions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE__FUNCTIONS = SYSTEM_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Module</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODULE_FEATURE_COUNT = SYSTEM_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.FieldDeclarationImpl <em>Field Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.FieldDeclarationImpl
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.FwitRequirementsModelPackageImpl#getFieldDeclaration()
   * @generated
   */
  int FIELD_DECLARATION = 6;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_DECLARATION__TYPE = 0;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_DECLARATION__VARIABLES = 1;

  /**
   * The number of structural features of the '<em>Field Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.FunctionDeclarationImpl <em>Function Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.FunctionDeclarationImpl
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.FwitRequirementsModelPackageImpl#getFunctionDeclaration()
   * @generated
   */
  int FUNCTION_DECLARATION = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECLARATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECLARATION__BODY = 1;

  /**
   * The number of structural features of the '<em>Function Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.ElseBlockImpl <em>Else Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.ElseBlockImpl
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.FwitRequirementsModelPackageImpl#getElseBlock()
   * @generated
   */
  int ELSE_BLOCK = 28;

  /**
   * The number of structural features of the '<em>Else Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELSE_BLOCK_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.BlockImpl <em>Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.BlockImpl
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.FwitRequirementsModelPackageImpl#getBlock()
   * @generated
   */
  int BLOCK = 8;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__STATEMENTS = ELSE_BLOCK_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_FEATURE_COUNT = ELSE_BLOCK_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.ExpressionImpl
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.FwitRequirementsModelPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 9;

  /**
   * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__LEFT_OPERAND = 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__OPERATOR = 1;

  /**
   * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__RIGHT_OPERAND = 2;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.ConjunctionImpl <em>Conjunction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.ConjunctionImpl
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.FwitRequirementsModelPackageImpl#getConjunction()
   * @generated
   */
  int CONJUNCTION = 10;

  /**
   * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONJUNCTION__LEFT_OPERAND = 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONJUNCTION__OPERATOR = 1;

  /**
   * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONJUNCTION__RIGHT_OPERAND = 2;

  /**
   * The number of structural features of the '<em>Conjunction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONJUNCTION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.ComparisionImpl <em>Comparision</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.ComparisionImpl
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.FwitRequirementsModelPackageImpl#getComparision()
   * @generated
   */
  int COMPARISION = 11;

  /**
   * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISION__LEFT_OPERAND = 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISION__OPERATOR = 1;

  /**
   * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISION__RIGHT_OPERAND = 2;

  /**
   * The number of structural features of the '<em>Comparision</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.ValueExpressionImpl <em>Value Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.ValueExpressionImpl
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.FwitRequirementsModelPackageImpl#getValueExpression()
   * @generated
   */
  int VALUE_EXPRESSION = 12;

  /**
   * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_EXPRESSION__LEFT_OPERAND = 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_EXPRESSION__OPERATOR = 1;

  /**
   * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_EXPRESSION__RIGHT_OPERAND = 2;

  /**
   * The number of structural features of the '<em>Value Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_EXPRESSION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.MultiplicationImpl <em>Multiplication</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.MultiplicationImpl
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.FwitRequirementsModelPackageImpl#getMultiplication()
   * @generated
   */
  int MULTIPLICATION = 13;

  /**
   * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION__LEFT_OPERAND = 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION__OPERATOR = 1;

  /**
   * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION__RIGHT_OPERAND = 2;

  /**
   * The number of structural features of the '<em>Multiplication</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.BasicExpressionImpl <em>Basic Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.BasicExpressionImpl
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.FwitRequirementsModelPackageImpl#getBasicExpression()
   * @generated
   */
  int BASIC_EXPRESSION = 14;

  /**
   * The number of structural features of the '<em>Basic Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.NameImpl <em>Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.NameImpl
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.FwitRequirementsModelPackageImpl#getName_()
   * @generated
   */
  int NAME = 15;

  /**
   * The number of structural features of the '<em>Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_FEATURE_COUNT = BASIC_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.LiteralImpl <em>Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.LiteralImpl
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.FwitRequirementsModelPackageImpl#getLiteral()
   * @generated
   */
  int LITERAL = 16;

  /**
   * The number of structural features of the '<em>Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_FEATURE_COUNT = NAME_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.EStringImpl <em>EString</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.EStringImpl
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.FwitRequirementsModelPackageImpl#getEString()
   * @generated
   */
  int ESTRING = 17;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESTRING__VALUE = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>EString</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ESTRING_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.StringLiteralImpl <em>String Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.StringLiteralImpl
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.FwitRequirementsModelPackageImpl#getStringLiteral()
   * @generated
   */
  int STRING_LITERAL = 18;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.IntegerLiteralImpl <em>Integer Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.IntegerLiteralImpl
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.FwitRequirementsModelPackageImpl#getIntegerLiteral()
   * @generated
   */
  int INTEGER_LITERAL = 19;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Integer Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.QualifiedExpressionImpl <em>Qualified Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.QualifiedExpressionImpl
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.FwitRequirementsModelPackageImpl#getQualifiedExpression()
   * @generated
   */
  int QUALIFIED_EXPRESSION = 20;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIED_EXPRESSION__VALUE = BASIC_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Qualified Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIED_EXPRESSION_FEATURE_COUNT = BASIC_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.NullLiteralImpl <em>Null Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.NullLiteralImpl
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.FwitRequirementsModelPackageImpl#getNullLiteral()
   * @generated
   */
  int NULL_LITERAL = 21;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NULL_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Null Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NULL_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.PrefixOperatorExpressionImpl <em>Prefix Operator Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.PrefixOperatorExpressionImpl
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.FwitRequirementsModelPackageImpl#getPrefixOperatorExpression()
   * @generated
   */
  int PREFIX_OPERATOR_EXPRESSION = 22;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFIX_OPERATOR_EXPRESSION__OPERATOR = BASIC_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFIX_OPERATOR_EXPRESSION__OPERAND = BASIC_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Prefix Operator Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREFIX_OPERATOR_EXPRESSION_FEATURE_COUNT = BASIC_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.MethodInvocationExpressionImpl <em>Method Invocation Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.MethodInvocationExpressionImpl
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.FwitRequirementsModelPackageImpl#getMethodInvocationExpression()
   * @generated
   */
  int METHOD_INVOCATION_EXPRESSION = 23;

  /**
   * The feature id for the '<em><b>Receiver</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_INVOCATION_EXPRESSION__RECEIVER = BASIC_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_INVOCATION_EXPRESSION__METHOD = BASIC_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Method Invocation Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_INVOCATION_EXPRESSION_FEATURE_COUNT = BASIC_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.MethodInvocationImpl <em>Method Invocation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.MethodInvocationImpl
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.FwitRequirementsModelPackageImpl#getMethodInvocation()
   * @generated
   */
  int METHOD_INVOCATION = 24;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_INVOCATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_INVOCATION__ARGUMENTS = 1;

  /**
   * The number of structural features of the '<em>Method Invocation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_INVOCATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.StatementImpl <em>Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.StatementImpl
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.FwitRequirementsModelPackageImpl#getStatement()
   * @generated
   */
  int STATEMENT = 25;

  /**
   * The number of structural features of the '<em>Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.LocalVariableDeclarationImpl <em>Local Variable Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.LocalVariableDeclarationImpl
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.FwitRequirementsModelPackageImpl#getLocalVariableDeclaration()
   * @generated
   */
  int LOCAL_VARIABLE_DECLARATION = 26;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_VARIABLE_DECLARATION__TYPE = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_VARIABLE_DECLARATION__VARIABLES = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Local Variable Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_VARIABLE_DECLARATION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.IfStatementImpl <em>If Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.IfStatementImpl
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.FwitRequirementsModelPackageImpl#getIfStatement()
   * @generated
   */
  int IF_STATEMENT = 27;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT__CONDITION = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Then Blok</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT__THEN_BLOK = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Else Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT__ELSE_BLOCK = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>If Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.ReturnStatementImpl <em>Return Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.ReturnStatementImpl
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.FwitRequirementsModelPackageImpl#getReturnStatement()
   * @generated
   */
  int RETURN_STATEMENT = 29;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN_STATEMENT__VALUE = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Return Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.TaskStatementImpl <em>Task Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.TaskStatementImpl
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.FwitRequirementsModelPackageImpl#getTaskStatement()
   * @generated
   */
  int TASK_STATEMENT = 30;

  /**
   * The number of structural features of the '<em>Task Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TASK_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.AssignmentStatementImpl <em>Assignment Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.AssignmentStatementImpl
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.FwitRequirementsModelPackageImpl#getAssignmentStatement()
   * @generated
   */
  int ASSIGNMENT_STATEMENT = 31;

  /**
   * The feature id for the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_STATEMENT__VARIABLE = TASK_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_STATEMENT__OPERATOR = TASK_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_STATEMENT__VALUE = TASK_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Assignment Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_STATEMENT_FEATURE_COUNT = TASK_STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.ParExpressionImpl <em>Par Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.ParExpressionImpl
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.FwitRequirementsModelPackageImpl#getParExpression()
   * @generated
   */
  int PAR_EXPRESSION = 32;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAR_EXPRESSION__EXPRESSION = BASIC_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Par Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAR_EXPRESSION_FEATURE_COUNT = BASIC_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.VariableDeclarationImpl
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.FwitRequirementsModelPackageImpl#getVariableDeclaration()
   * @generated
   */
  int VARIABLE_DECLARATION = 33;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION__NAME = 0;

  /**
   * The number of structural features of the '<em>Variable Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.FwitRequirementModel <em>Fwit Requirement Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fwit Requirement Model</em>'.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.FwitRequirementModel
   * @generated
   */
  EClass getFwitRequirementModel();

  /**
   * Returns the meta object for the containment reference '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.FwitRequirementModel#getSystem <em>System</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>System</em>'.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.FwitRequirementModel#getSystem()
   * @see #getFwitRequirementModel()
   * @generated
   */
  EReference getFwitRequirementModel_System();

  /**
   * Returns the meta object for the containment reference list '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.FwitRequirementModel#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.FwitRequirementModel#getElements()
   * @see #getFwitRequirementModel()
   * @generated
   */
  EReference getFwitRequirementModel_Elements();

  /**
   * Returns the meta object for class '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.SystemElement <em>System Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>System Element</em>'.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.SystemElement
   * @generated
   */
  EClass getSystemElement();

  /**
   * Returns the meta object for class '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Include <em>Include</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Include</em>'.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Include
   * @generated
   */
  EClass getInclude();

  /**
   * Returns the meta object for the attribute '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Include#getFile <em>File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>File</em>'.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Include#getFile()
   * @see #getInclude()
   * @generated
   */
  EAttribute getInclude_File();

  /**
   * Returns the meta object for class '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for the attribute '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Type#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Type#getName()
   * @see #getType()
   * @generated
   */
  EAttribute getType_Name();

  /**
   * Returns the meta object for the attribute '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Type#getClassName <em>Class Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class Name</em>'.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Type#getClassName()
   * @see #getType()
   * @generated
   */
  EAttribute getType_ClassName();

  /**
   * Returns the meta object for class '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.SystemDeclaration <em>System Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>System Declaration</em>'.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.SystemDeclaration
   * @generated
   */
  EClass getSystemDeclaration();

  /**
   * Returns the meta object for the attribute '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.SystemDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.SystemDeclaration#getName()
   * @see #getSystemDeclaration()
   * @generated
   */
  EAttribute getSystemDeclaration_Name();

  /**
   * Returns the meta object for the containment reference '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.SystemDeclaration#getFramework <em>Framework</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Framework</em>'.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.SystemDeclaration#getFramework()
   * @see #getSystemDeclaration()
   * @generated
   */
  EReference getSystemDeclaration_Framework();

  /**
   * Returns the meta object for class '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Module <em>Module</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Module</em>'.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Module
   * @generated
   */
  EClass getModule();

  /**
   * Returns the meta object for the attribute '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Module#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Module#getName()
   * @see #getModule()
   * @generated
   */
  EAttribute getModule_Name();

  /**
   * Returns the meta object for the containment reference list '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Module#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fields</em>'.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Module#getFields()
   * @see #getModule()
   * @generated
   */
  EReference getModule_Fields();

  /**
   * Returns the meta object for the containment reference list '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Module#getFunctions <em>Functions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Functions</em>'.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Module#getFunctions()
   * @see #getModule()
   * @generated
   */
  EReference getModule_Functions();

  /**
   * Returns the meta object for class '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.FieldDeclaration <em>Field Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field Declaration</em>'.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.FieldDeclaration
   * @generated
   */
  EClass getFieldDeclaration();

  /**
   * Returns the meta object for the reference '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.FieldDeclaration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.FieldDeclaration#getType()
   * @see #getFieldDeclaration()
   * @generated
   */
  EReference getFieldDeclaration_Type();

  /**
   * Returns the meta object for the containment reference list '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.FieldDeclaration#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variables</em>'.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.FieldDeclaration#getVariables()
   * @see #getFieldDeclaration()
   * @generated
   */
  EReference getFieldDeclaration_Variables();

  /**
   * Returns the meta object for class '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.FunctionDeclaration <em>Function Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Declaration</em>'.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.FunctionDeclaration
   * @generated
   */
  EClass getFunctionDeclaration();

  /**
   * Returns the meta object for the attribute '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.FunctionDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.FunctionDeclaration#getName()
   * @see #getFunctionDeclaration()
   * @generated
   */
  EAttribute getFunctionDeclaration_Name();

  /**
   * Returns the meta object for the containment reference '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.FunctionDeclaration#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.FunctionDeclaration#getBody()
   * @see #getFunctionDeclaration()
   * @generated
   */
  EReference getFunctionDeclaration_Body();

  /**
   * Returns the meta object for class '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Block <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Block</em>'.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Block
   * @generated
   */
  EClass getBlock();

  /**
   * Returns the meta object for the containment reference list '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Block#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Block#getStatements()
   * @see #getBlock()
   * @generated
   */
  EReference getBlock_Statements();

  /**
   * Returns the meta object for class '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for the containment reference '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Expression#getLeftOperand <em>Left Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Operand</em>'.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Expression#getLeftOperand()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_LeftOperand();

  /**
   * Returns the meta object for the attribute '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Expression#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Expression#getOperator()
   * @see #getExpression()
   * @generated
   */
  EAttribute getExpression_Operator();

  /**
   * Returns the meta object for the containment reference '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Expression#getRightOperand <em>Right Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Operand</em>'.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Expression#getRightOperand()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_RightOperand();

  /**
   * Returns the meta object for class '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Conjunction <em>Conjunction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Conjunction</em>'.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Conjunction
   * @generated
   */
  EClass getConjunction();

  /**
   * Returns the meta object for the containment reference '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Conjunction#getLeftOperand <em>Left Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Operand</em>'.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Conjunction#getLeftOperand()
   * @see #getConjunction()
   * @generated
   */
  EReference getConjunction_LeftOperand();

  /**
   * Returns the meta object for the attribute '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Conjunction#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Conjunction#getOperator()
   * @see #getConjunction()
   * @generated
   */
  EAttribute getConjunction_Operator();

  /**
   * Returns the meta object for the containment reference '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Conjunction#getRightOperand <em>Right Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Operand</em>'.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Conjunction#getRightOperand()
   * @see #getConjunction()
   * @generated
   */
  EReference getConjunction_RightOperand();

  /**
   * Returns the meta object for class '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Comparision <em>Comparision</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Comparision</em>'.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Comparision
   * @generated
   */
  EClass getComparision();

  /**
   * Returns the meta object for the containment reference '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Comparision#getLeftOperand <em>Left Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Operand</em>'.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Comparision#getLeftOperand()
   * @see #getComparision()
   * @generated
   */
  EReference getComparision_LeftOperand();

  /**
   * Returns the meta object for the attribute '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Comparision#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Comparision#getOperator()
   * @see #getComparision()
   * @generated
   */
  EAttribute getComparision_Operator();

  /**
   * Returns the meta object for the containment reference '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Comparision#getRightOperand <em>Right Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Operand</em>'.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Comparision#getRightOperand()
   * @see #getComparision()
   * @generated
   */
  EReference getComparision_RightOperand();

  /**
   * Returns the meta object for class '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.ValueExpression <em>Value Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value Expression</em>'.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.ValueExpression
   * @generated
   */
  EClass getValueExpression();

  /**
   * Returns the meta object for the containment reference '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.ValueExpression#getLeftOperand <em>Left Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Operand</em>'.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.ValueExpression#getLeftOperand()
   * @see #getValueExpression()
   * @generated
   */
  EReference getValueExpression_LeftOperand();

  /**
   * Returns the meta object for the attribute '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.ValueExpression#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.ValueExpression#getOperator()
   * @see #getValueExpression()
   * @generated
   */
  EAttribute getValueExpression_Operator();

  /**
   * Returns the meta object for the containment reference '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.ValueExpression#getRightOperand <em>Right Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Operand</em>'.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.ValueExpression#getRightOperand()
   * @see #getValueExpression()
   * @generated
   */
  EReference getValueExpression_RightOperand();

  /**
   * Returns the meta object for class '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Multiplication <em>Multiplication</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multiplication</em>'.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Multiplication
   * @generated
   */
  EClass getMultiplication();

  /**
   * Returns the meta object for the containment reference '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Multiplication#getLeftOperand <em>Left Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Operand</em>'.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Multiplication#getLeftOperand()
   * @see #getMultiplication()
   * @generated
   */
  EReference getMultiplication_LeftOperand();

  /**
   * Returns the meta object for the attribute '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Multiplication#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Multiplication#getOperator()
   * @see #getMultiplication()
   * @generated
   */
  EAttribute getMultiplication_Operator();

  /**
   * Returns the meta object for the containment reference '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Multiplication#getRightOperand <em>Right Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Operand</em>'.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Multiplication#getRightOperand()
   * @see #getMultiplication()
   * @generated
   */
  EReference getMultiplication_RightOperand();

  /**
   * Returns the meta object for class '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.BasicExpression <em>Basic Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Basic Expression</em>'.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.BasicExpression
   * @generated
   */
  EClass getBasicExpression();

  /**
   * Returns the meta object for class '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Name <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Name</em>'.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Name
   * @generated
   */
  EClass getName_();

  /**
   * Returns the meta object for class '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Literal</em>'.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Literal
   * @generated
   */
  EClass getLiteral();

  /**
   * Returns the meta object for class '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.EString <em>EString</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>EString</em>'.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.EString
   * @generated
   */
  EClass getEString();

  /**
   * Returns the meta object for the attribute '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.EString#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.EString#getValue()
   * @see #getEString()
   * @generated
   */
  EAttribute getEString_Value();

  /**
   * Returns the meta object for class '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.StringLiteral <em>String Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Literal</em>'.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.StringLiteral
   * @generated
   */
  EClass getStringLiteral();

  /**
   * Returns the meta object for the attribute '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.StringLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.StringLiteral#getValue()
   * @see #getStringLiteral()
   * @generated
   */
  EAttribute getStringLiteral_Value();

  /**
   * Returns the meta object for class '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.IntegerLiteral <em>Integer Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Integer Literal</em>'.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.IntegerLiteral
   * @generated
   */
  EClass getIntegerLiteral();

  /**
   * Returns the meta object for the attribute '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.IntegerLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.IntegerLiteral#getValue()
   * @see #getIntegerLiteral()
   * @generated
   */
  EAttribute getIntegerLiteral_Value();

  /**
   * Returns the meta object for class '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.QualifiedExpression <em>Qualified Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Qualified Expression</em>'.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.QualifiedExpression
   * @generated
   */
  EClass getQualifiedExpression();

  /**
   * Returns the meta object for the attribute '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.QualifiedExpression#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.QualifiedExpression#getValue()
   * @see #getQualifiedExpression()
   * @generated
   */
  EAttribute getQualifiedExpression_Value();

  /**
   * Returns the meta object for class '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.NullLiteral <em>Null Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Null Literal</em>'.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.NullLiteral
   * @generated
   */
  EClass getNullLiteral();

  /**
   * Returns the meta object for the attribute '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.NullLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.NullLiteral#getValue()
   * @see #getNullLiteral()
   * @generated
   */
  EAttribute getNullLiteral_Value();

  /**
   * Returns the meta object for class '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.PrefixOperatorExpression <em>Prefix Operator Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Prefix Operator Expression</em>'.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.PrefixOperatorExpression
   * @generated
   */
  EClass getPrefixOperatorExpression();

  /**
   * Returns the meta object for the attribute '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.PrefixOperatorExpression#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.PrefixOperatorExpression#getOperator()
   * @see #getPrefixOperatorExpression()
   * @generated
   */
  EAttribute getPrefixOperatorExpression_Operator();

  /**
   * Returns the meta object for the containment reference '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.PrefixOperatorExpression#getOperand <em>Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operand</em>'.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.PrefixOperatorExpression#getOperand()
   * @see #getPrefixOperatorExpression()
   * @generated
   */
  EReference getPrefixOperatorExpression_Operand();

  /**
   * Returns the meta object for class '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.MethodInvocationExpression <em>Method Invocation Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method Invocation Expression</em>'.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.MethodInvocationExpression
   * @generated
   */
  EClass getMethodInvocationExpression();

  /**
   * Returns the meta object for the reference '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.MethodInvocationExpression#getReceiver <em>Receiver</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Receiver</em>'.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.MethodInvocationExpression#getReceiver()
   * @see #getMethodInvocationExpression()
   * @generated
   */
  EReference getMethodInvocationExpression_Receiver();

  /**
   * Returns the meta object for the containment reference '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.MethodInvocationExpression#getMethod <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Method</em>'.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.MethodInvocationExpression#getMethod()
   * @see #getMethodInvocationExpression()
   * @generated
   */
  EReference getMethodInvocationExpression_Method();

  /**
   * Returns the meta object for class '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.MethodInvocation <em>Method Invocation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method Invocation</em>'.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.MethodInvocation
   * @generated
   */
  EClass getMethodInvocation();

  /**
   * Returns the meta object for the containment reference '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.MethodInvocation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.MethodInvocation#getName()
   * @see #getMethodInvocation()
   * @generated
   */
  EReference getMethodInvocation_Name();

  /**
   * Returns the meta object for the containment reference list '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.MethodInvocation#getArguments <em>Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Arguments</em>'.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.MethodInvocation#getArguments()
   * @see #getMethodInvocation()
   * @generated
   */
  EReference getMethodInvocation_Arguments();

  /**
   * Returns the meta object for class '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement</em>'.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Statement
   * @generated
   */
  EClass getStatement();

  /**
   * Returns the meta object for class '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.LocalVariableDeclaration <em>Local Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Local Variable Declaration</em>'.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.LocalVariableDeclaration
   * @generated
   */
  EClass getLocalVariableDeclaration();

  /**
   * Returns the meta object for the reference '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.LocalVariableDeclaration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.LocalVariableDeclaration#getType()
   * @see #getLocalVariableDeclaration()
   * @generated
   */
  EReference getLocalVariableDeclaration_Type();

  /**
   * Returns the meta object for the containment reference list '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.LocalVariableDeclaration#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variables</em>'.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.LocalVariableDeclaration#getVariables()
   * @see #getLocalVariableDeclaration()
   * @generated
   */
  EReference getLocalVariableDeclaration_Variables();

  /**
   * Returns the meta object for class '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.IfStatement <em>If Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>If Statement</em>'.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.IfStatement
   * @generated
   */
  EClass getIfStatement();

  /**
   * Returns the meta object for the containment reference '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.IfStatement#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.IfStatement#getCondition()
   * @see #getIfStatement()
   * @generated
   */
  EReference getIfStatement_Condition();

  /**
   * Returns the meta object for the containment reference '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.IfStatement#getThenBlok <em>Then Blok</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Then Blok</em>'.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.IfStatement#getThenBlok()
   * @see #getIfStatement()
   * @generated
   */
  EReference getIfStatement_ThenBlok();

  /**
   * Returns the meta object for the containment reference '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.IfStatement#getElseBlock <em>Else Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Else Block</em>'.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.IfStatement#getElseBlock()
   * @see #getIfStatement()
   * @generated
   */
  EReference getIfStatement_ElseBlock();

  /**
   * Returns the meta object for class '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.ElseBlock <em>Else Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Else Block</em>'.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.ElseBlock
   * @generated
   */
  EClass getElseBlock();

  /**
   * Returns the meta object for class '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.ReturnStatement <em>Return Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Return Statement</em>'.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.ReturnStatement
   * @generated
   */
  EClass getReturnStatement();

  /**
   * Returns the meta object for the attribute '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.ReturnStatement#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.ReturnStatement#getValue()
   * @see #getReturnStatement()
   * @generated
   */
  EAttribute getReturnStatement_Value();

  /**
   * Returns the meta object for class '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.TaskStatement <em>Task Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Task Statement</em>'.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.TaskStatement
   * @generated
   */
  EClass getTaskStatement();

  /**
   * Returns the meta object for class '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.AssignmentStatement <em>Assignment Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assignment Statement</em>'.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.AssignmentStatement
   * @generated
   */
  EClass getAssignmentStatement();

  /**
   * Returns the meta object for the reference '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.AssignmentStatement#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Variable</em>'.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.AssignmentStatement#getVariable()
   * @see #getAssignmentStatement()
   * @generated
   */
  EReference getAssignmentStatement_Variable();

  /**
   * Returns the meta object for the attribute '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.AssignmentStatement#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.AssignmentStatement#getOperator()
   * @see #getAssignmentStatement()
   * @generated
   */
  EAttribute getAssignmentStatement_Operator();

  /**
   * Returns the meta object for the containment reference '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.AssignmentStatement#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.AssignmentStatement#getValue()
   * @see #getAssignmentStatement()
   * @generated
   */
  EReference getAssignmentStatement_Value();

  /**
   * Returns the meta object for class '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.ParExpression <em>Par Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Par Expression</em>'.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.ParExpression
   * @generated
   */
  EClass getParExpression();

  /**
   * Returns the meta object for the containment reference '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.ParExpression#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.ParExpression#getExpression()
   * @see #getParExpression()
   * @generated
   */
  EReference getParExpression_Expression();

  /**
   * Returns the meta object for class '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.VariableDeclaration <em>Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Declaration</em>'.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.VariableDeclaration
   * @generated
   */
  EClass getVariableDeclaration();

  /**
   * Returns the meta object for the attribute '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.VariableDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.VariableDeclaration#getName()
   * @see #getVariableDeclaration()
   * @generated
   */
  EAttribute getVariableDeclaration_Name();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  FwitRequirementsModelFactory getFwitRequirementsModelFactory();

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
     * The meta object literal for the '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.FwitRequirementModelImpl <em>Fwit Requirement Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.FwitRequirementModelImpl
     * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.FwitRequirementsModelPackageImpl#getFwitRequirementModel()
     * @generated
     */
    EClass FWIT_REQUIREMENT_MODEL = eINSTANCE.getFwitRequirementModel();

    /**
     * The meta object literal for the '<em><b>System</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FWIT_REQUIREMENT_MODEL__SYSTEM = eINSTANCE.getFwitRequirementModel_System();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FWIT_REQUIREMENT_MODEL__ELEMENTS = eINSTANCE.getFwitRequirementModel_Elements();

    /**
     * The meta object literal for the '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.SystemElementImpl <em>System Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.SystemElementImpl
     * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.FwitRequirementsModelPackageImpl#getSystemElement()
     * @generated
     */
    EClass SYSTEM_ELEMENT = eINSTANCE.getSystemElement();

    /**
     * The meta object literal for the '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.IncludeImpl <em>Include</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.IncludeImpl
     * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.FwitRequirementsModelPackageImpl#getInclude()
     * @generated
     */
    EClass INCLUDE = eINSTANCE.getInclude();

    /**
     * The meta object literal for the '<em><b>File</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INCLUDE__FILE = eINSTANCE.getInclude_File();

    /**
     * The meta object literal for the '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.TypeImpl
     * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.FwitRequirementsModelPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__NAME = eINSTANCE.getType_Name();

    /**
     * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__CLASS_NAME = eINSTANCE.getType_ClassName();

    /**
     * The meta object literal for the '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.SystemDeclarationImpl <em>System Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.SystemDeclarationImpl
     * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.FwitRequirementsModelPackageImpl#getSystemDeclaration()
     * @generated
     */
    EClass SYSTEM_DECLARATION = eINSTANCE.getSystemDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SYSTEM_DECLARATION__NAME = eINSTANCE.getSystemDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Framework</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYSTEM_DECLARATION__FRAMEWORK = eINSTANCE.getSystemDeclaration_Framework();

    /**
     * The meta object literal for the '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.ModuleImpl <em>Module</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.ModuleImpl
     * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.FwitRequirementsModelPackageImpl#getModule()
     * @generated
     */
    EClass MODULE = eINSTANCE.getModule();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODULE__NAME = eINSTANCE.getModule_Name();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE__FIELDS = eINSTANCE.getModule_Fields();

    /**
     * The meta object literal for the '<em><b>Functions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODULE__FUNCTIONS = eINSTANCE.getModule_Functions();

    /**
     * The meta object literal for the '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.FieldDeclarationImpl <em>Field Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.FieldDeclarationImpl
     * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.FwitRequirementsModelPackageImpl#getFieldDeclaration()
     * @generated
     */
    EClass FIELD_DECLARATION = eINSTANCE.getFieldDeclaration();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD_DECLARATION__TYPE = eINSTANCE.getFieldDeclaration_Type();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD_DECLARATION__VARIABLES = eINSTANCE.getFieldDeclaration_Variables();

    /**
     * The meta object literal for the '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.FunctionDeclarationImpl <em>Function Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.FunctionDeclarationImpl
     * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.FwitRequirementsModelPackageImpl#getFunctionDeclaration()
     * @generated
     */
    EClass FUNCTION_DECLARATION = eINSTANCE.getFunctionDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_DECLARATION__NAME = eINSTANCE.getFunctionDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_DECLARATION__BODY = eINSTANCE.getFunctionDeclaration_Body();

    /**
     * The meta object literal for the '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.BlockImpl <em>Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.BlockImpl
     * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.FwitRequirementsModelPackageImpl#getBlock()
     * @generated
     */
    EClass BLOCK = eINSTANCE.getBlock();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BLOCK__STATEMENTS = eINSTANCE.getBlock_Statements();

    /**
     * The meta object literal for the '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.ExpressionImpl
     * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.FwitRequirementsModelPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__LEFT_OPERAND = eINSTANCE.getExpression_LeftOperand();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION__OPERATOR = eINSTANCE.getExpression_Operator();

    /**
     * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__RIGHT_OPERAND = eINSTANCE.getExpression_RightOperand();

    /**
     * The meta object literal for the '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.ConjunctionImpl <em>Conjunction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.ConjunctionImpl
     * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.FwitRequirementsModelPackageImpl#getConjunction()
     * @generated
     */
    EClass CONJUNCTION = eINSTANCE.getConjunction();

    /**
     * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONJUNCTION__LEFT_OPERAND = eINSTANCE.getConjunction_LeftOperand();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONJUNCTION__OPERATOR = eINSTANCE.getConjunction_Operator();

    /**
     * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONJUNCTION__RIGHT_OPERAND = eINSTANCE.getConjunction_RightOperand();

    /**
     * The meta object literal for the '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.ComparisionImpl <em>Comparision</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.ComparisionImpl
     * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.FwitRequirementsModelPackageImpl#getComparision()
     * @generated
     */
    EClass COMPARISION = eINSTANCE.getComparision();

    /**
     * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPARISION__LEFT_OPERAND = eINSTANCE.getComparision_LeftOperand();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPARISION__OPERATOR = eINSTANCE.getComparision_Operator();

    /**
     * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPARISION__RIGHT_OPERAND = eINSTANCE.getComparision_RightOperand();

    /**
     * The meta object literal for the '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.ValueExpressionImpl <em>Value Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.ValueExpressionImpl
     * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.FwitRequirementsModelPackageImpl#getValueExpression()
     * @generated
     */
    EClass VALUE_EXPRESSION = eINSTANCE.getValueExpression();

    /**
     * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VALUE_EXPRESSION__LEFT_OPERAND = eINSTANCE.getValueExpression_LeftOperand();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VALUE_EXPRESSION__OPERATOR = eINSTANCE.getValueExpression_Operator();

    /**
     * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VALUE_EXPRESSION__RIGHT_OPERAND = eINSTANCE.getValueExpression_RightOperand();

    /**
     * The meta object literal for the '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.MultiplicationImpl <em>Multiplication</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.MultiplicationImpl
     * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.FwitRequirementsModelPackageImpl#getMultiplication()
     * @generated
     */
    EClass MULTIPLICATION = eINSTANCE.getMultiplication();

    /**
     * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTIPLICATION__LEFT_OPERAND = eINSTANCE.getMultiplication_LeftOperand();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MULTIPLICATION__OPERATOR = eINSTANCE.getMultiplication_Operator();

    /**
     * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTIPLICATION__RIGHT_OPERAND = eINSTANCE.getMultiplication_RightOperand();

    /**
     * The meta object literal for the '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.BasicExpressionImpl <em>Basic Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.BasicExpressionImpl
     * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.FwitRequirementsModelPackageImpl#getBasicExpression()
     * @generated
     */
    EClass BASIC_EXPRESSION = eINSTANCE.getBasicExpression();

    /**
     * The meta object literal for the '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.NameImpl <em>Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.NameImpl
     * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.FwitRequirementsModelPackageImpl#getName_()
     * @generated
     */
    EClass NAME = eINSTANCE.getName_();

    /**
     * The meta object literal for the '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.LiteralImpl <em>Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.LiteralImpl
     * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.FwitRequirementsModelPackageImpl#getLiteral()
     * @generated
     */
    EClass LITERAL = eINSTANCE.getLiteral();

    /**
     * The meta object literal for the '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.EStringImpl <em>EString</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.EStringImpl
     * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.FwitRequirementsModelPackageImpl#getEString()
     * @generated
     */
    EClass ESTRING = eINSTANCE.getEString();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ESTRING__VALUE = eINSTANCE.getEString_Value();

    /**
     * The meta object literal for the '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.StringLiteralImpl <em>String Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.StringLiteralImpl
     * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.FwitRequirementsModelPackageImpl#getStringLiteral()
     * @generated
     */
    EClass STRING_LITERAL = eINSTANCE.getStringLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_LITERAL__VALUE = eINSTANCE.getStringLiteral_Value();

    /**
     * The meta object literal for the '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.IntegerLiteralImpl <em>Integer Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.IntegerLiteralImpl
     * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.FwitRequirementsModelPackageImpl#getIntegerLiteral()
     * @generated
     */
    EClass INTEGER_LITERAL = eINSTANCE.getIntegerLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTEGER_LITERAL__VALUE = eINSTANCE.getIntegerLiteral_Value();

    /**
     * The meta object literal for the '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.QualifiedExpressionImpl <em>Qualified Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.QualifiedExpressionImpl
     * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.FwitRequirementsModelPackageImpl#getQualifiedExpression()
     * @generated
     */
    EClass QUALIFIED_EXPRESSION = eINSTANCE.getQualifiedExpression();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUALIFIED_EXPRESSION__VALUE = eINSTANCE.getQualifiedExpression_Value();

    /**
     * The meta object literal for the '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.NullLiteralImpl <em>Null Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.NullLiteralImpl
     * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.FwitRequirementsModelPackageImpl#getNullLiteral()
     * @generated
     */
    EClass NULL_LITERAL = eINSTANCE.getNullLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NULL_LITERAL__VALUE = eINSTANCE.getNullLiteral_Value();

    /**
     * The meta object literal for the '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.PrefixOperatorExpressionImpl <em>Prefix Operator Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.PrefixOperatorExpressionImpl
     * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.FwitRequirementsModelPackageImpl#getPrefixOperatorExpression()
     * @generated
     */
    EClass PREFIX_OPERATOR_EXPRESSION = eINSTANCE.getPrefixOperatorExpression();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PREFIX_OPERATOR_EXPRESSION__OPERATOR = eINSTANCE.getPrefixOperatorExpression_Operator();

    /**
     * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PREFIX_OPERATOR_EXPRESSION__OPERAND = eINSTANCE.getPrefixOperatorExpression_Operand();

    /**
     * The meta object literal for the '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.MethodInvocationExpressionImpl <em>Method Invocation Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.MethodInvocationExpressionImpl
     * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.FwitRequirementsModelPackageImpl#getMethodInvocationExpression()
     * @generated
     */
    EClass METHOD_INVOCATION_EXPRESSION = eINSTANCE.getMethodInvocationExpression();

    /**
     * The meta object literal for the '<em><b>Receiver</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_INVOCATION_EXPRESSION__RECEIVER = eINSTANCE.getMethodInvocationExpression_Receiver();

    /**
     * The meta object literal for the '<em><b>Method</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_INVOCATION_EXPRESSION__METHOD = eINSTANCE.getMethodInvocationExpression_Method();

    /**
     * The meta object literal for the '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.MethodInvocationImpl <em>Method Invocation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.MethodInvocationImpl
     * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.FwitRequirementsModelPackageImpl#getMethodInvocation()
     * @generated
     */
    EClass METHOD_INVOCATION = eINSTANCE.getMethodInvocation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_INVOCATION__NAME = eINSTANCE.getMethodInvocation_Name();

    /**
     * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_INVOCATION__ARGUMENTS = eINSTANCE.getMethodInvocation_Arguments();

    /**
     * The meta object literal for the '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.StatementImpl <em>Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.StatementImpl
     * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.FwitRequirementsModelPackageImpl#getStatement()
     * @generated
     */
    EClass STATEMENT = eINSTANCE.getStatement();

    /**
     * The meta object literal for the '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.LocalVariableDeclarationImpl <em>Local Variable Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.LocalVariableDeclarationImpl
     * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.FwitRequirementsModelPackageImpl#getLocalVariableDeclaration()
     * @generated
     */
    EClass LOCAL_VARIABLE_DECLARATION = eINSTANCE.getLocalVariableDeclaration();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOCAL_VARIABLE_DECLARATION__TYPE = eINSTANCE.getLocalVariableDeclaration_Type();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOCAL_VARIABLE_DECLARATION__VARIABLES = eINSTANCE.getLocalVariableDeclaration_Variables();

    /**
     * The meta object literal for the '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.IfStatementImpl <em>If Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.IfStatementImpl
     * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.FwitRequirementsModelPackageImpl#getIfStatement()
     * @generated
     */
    EClass IF_STATEMENT = eINSTANCE.getIfStatement();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_STATEMENT__CONDITION = eINSTANCE.getIfStatement_Condition();

    /**
     * The meta object literal for the '<em><b>Then Blok</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_STATEMENT__THEN_BLOK = eINSTANCE.getIfStatement_ThenBlok();

    /**
     * The meta object literal for the '<em><b>Else Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_STATEMENT__ELSE_BLOCK = eINSTANCE.getIfStatement_ElseBlock();

    /**
     * The meta object literal for the '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.ElseBlockImpl <em>Else Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.ElseBlockImpl
     * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.FwitRequirementsModelPackageImpl#getElseBlock()
     * @generated
     */
    EClass ELSE_BLOCK = eINSTANCE.getElseBlock();

    /**
     * The meta object literal for the '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.ReturnStatementImpl <em>Return Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.ReturnStatementImpl
     * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.FwitRequirementsModelPackageImpl#getReturnStatement()
     * @generated
     */
    EClass RETURN_STATEMENT = eINSTANCE.getReturnStatement();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RETURN_STATEMENT__VALUE = eINSTANCE.getReturnStatement_Value();

    /**
     * The meta object literal for the '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.TaskStatementImpl <em>Task Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.TaskStatementImpl
     * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.FwitRequirementsModelPackageImpl#getTaskStatement()
     * @generated
     */
    EClass TASK_STATEMENT = eINSTANCE.getTaskStatement();

    /**
     * The meta object literal for the '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.AssignmentStatementImpl <em>Assignment Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.AssignmentStatementImpl
     * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.FwitRequirementsModelPackageImpl#getAssignmentStatement()
     * @generated
     */
    EClass ASSIGNMENT_STATEMENT = eINSTANCE.getAssignmentStatement();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNMENT_STATEMENT__VARIABLE = eINSTANCE.getAssignmentStatement_Variable();

    /**
     * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSIGNMENT_STATEMENT__OPERATOR = eINSTANCE.getAssignmentStatement_Operator();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSIGNMENT_STATEMENT__VALUE = eINSTANCE.getAssignmentStatement_Value();

    /**
     * The meta object literal for the '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.ParExpressionImpl <em>Par Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.ParExpressionImpl
     * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.FwitRequirementsModelPackageImpl#getParExpression()
     * @generated
     */
    EClass PAR_EXPRESSION = eINSTANCE.getParExpression();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PAR_EXPRESSION__EXPRESSION = eINSTANCE.getParExpression_Expression();

    /**
     * The meta object literal for the '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.VariableDeclarationImpl
     * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.impl.FwitRequirementsModelPackageImpl#getVariableDeclaration()
     * @generated
     */
    EClass VARIABLE_DECLARATION = eINSTANCE.getVariableDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_DECLARATION__NAME = eINSTANCE.getVariableDeclaration_Name();

  }

} //FwitRequirementsModelPackage
