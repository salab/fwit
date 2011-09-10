/**
 * <copyright>
 * </copyright>
 *
 */
package jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.util;

import java.util.List;

import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.FwitRequirementsModelPackage
 * @generated
 */
public class FwitRequirementsModelSwitch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static FwitRequirementsModelPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FwitRequirementsModelSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = FwitRequirementsModelPackage.eINSTANCE;
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  public T doSwitch(EObject theEObject)
  {
    return doSwitch(theEObject.eClass(), theEObject);
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(EClass theEClass, EObject theEObject)
  {
    if (theEClass.eContainer() == modelPackage)
    {
      return doSwitch(theEClass.getClassifierID(), theEObject);
    }
    else
    {
      List<EClass> eSuperTypes = theEClass.getESuperTypes();
      return
        eSuperTypes.isEmpty() ?
          defaultCase(theEObject) :
          doSwitch(eSuperTypes.get(0), theEObject);
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case FwitRequirementsModelPackage.FWIT_REQUIREMENT_MODEL:
      {
        FwitRequirementModel fwitRequirementModel = (FwitRequirementModel)theEObject;
        T result = caseFwitRequirementModel(fwitRequirementModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FwitRequirementsModelPackage.SYSTEM_ELEMENT:
      {
        SystemElement systemElement = (SystemElement)theEObject;
        T result = caseSystemElement(systemElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FwitRequirementsModelPackage.INCLUDE:
      {
        Include include = (Include)theEObject;
        T result = caseInclude(include);
        if (result == null) result = caseSystemElement(include);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FwitRequirementsModelPackage.TYPE:
      {
        Type type = (Type)theEObject;
        T result = caseType(type);
        if (result == null) result = caseSystemElement(type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FwitRequirementsModelPackage.SYSTEM_DECLARATION:
      {
        SystemDeclaration systemDeclaration = (SystemDeclaration)theEObject;
        T result = caseSystemDeclaration(systemDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FwitRequirementsModelPackage.MODULE:
      {
        Module module = (Module)theEObject;
        T result = caseModule(module);
        if (result == null) result = caseSystemElement(module);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FwitRequirementsModelPackage.FIELD_DECLARATION:
      {
        FieldDeclaration fieldDeclaration = (FieldDeclaration)theEObject;
        T result = caseFieldDeclaration(fieldDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FwitRequirementsModelPackage.FUNCTION_DECLARATION:
      {
        FunctionDeclaration functionDeclaration = (FunctionDeclaration)theEObject;
        T result = caseFunctionDeclaration(functionDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FwitRequirementsModelPackage.BLOCK:
      {
        Block block = (Block)theEObject;
        T result = caseBlock(block);
        if (result == null) result = caseElseBlock(block);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FwitRequirementsModelPackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FwitRequirementsModelPackage.CONJUNCTION:
      {
        Conjunction conjunction = (Conjunction)theEObject;
        T result = caseConjunction(conjunction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FwitRequirementsModelPackage.COMPARISION:
      {
        Comparision comparision = (Comparision)theEObject;
        T result = caseComparision(comparision);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FwitRequirementsModelPackage.VALUE_EXPRESSION:
      {
        ValueExpression valueExpression = (ValueExpression)theEObject;
        T result = caseValueExpression(valueExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FwitRequirementsModelPackage.MULTIPLICATION:
      {
        Multiplication multiplication = (Multiplication)theEObject;
        T result = caseMultiplication(multiplication);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FwitRequirementsModelPackage.BASIC_EXPRESSION:
      {
        BasicExpression basicExpression = (BasicExpression)theEObject;
        T result = caseBasicExpression(basicExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FwitRequirementsModelPackage.NAME:
      {
        Name name = (Name)theEObject;
        T result = caseName(name);
        if (result == null) result = caseBasicExpression(name);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FwitRequirementsModelPackage.LITERAL:
      {
        Literal literal = (Literal)theEObject;
        T result = caseLiteral(literal);
        if (result == null) result = caseName(literal);
        if (result == null) result = caseBasicExpression(literal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FwitRequirementsModelPackage.ESTRING:
      {
        EString eString = (EString)theEObject;
        T result = caseEString(eString);
        if (result == null) result = caseLiteral(eString);
        if (result == null) result = caseName(eString);
        if (result == null) result = caseBasicExpression(eString);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FwitRequirementsModelPackage.STRING_LITERAL:
      {
        StringLiteral stringLiteral = (StringLiteral)theEObject;
        T result = caseStringLiteral(stringLiteral);
        if (result == null) result = caseLiteral(stringLiteral);
        if (result == null) result = caseName(stringLiteral);
        if (result == null) result = caseBasicExpression(stringLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FwitRequirementsModelPackage.INTEGER_LITERAL:
      {
        IntegerLiteral integerLiteral = (IntegerLiteral)theEObject;
        T result = caseIntegerLiteral(integerLiteral);
        if (result == null) result = caseLiteral(integerLiteral);
        if (result == null) result = caseName(integerLiteral);
        if (result == null) result = caseBasicExpression(integerLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FwitRequirementsModelPackage.QUALIFIED_EXPRESSION:
      {
        QualifiedExpression qualifiedExpression = (QualifiedExpression)theEObject;
        T result = caseQualifiedExpression(qualifiedExpression);
        if (result == null) result = caseBasicExpression(qualifiedExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FwitRequirementsModelPackage.NULL_LITERAL:
      {
        NullLiteral nullLiteral = (NullLiteral)theEObject;
        T result = caseNullLiteral(nullLiteral);
        if (result == null) result = caseLiteral(nullLiteral);
        if (result == null) result = caseName(nullLiteral);
        if (result == null) result = caseBasicExpression(nullLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FwitRequirementsModelPackage.PREFIX_OPERATOR_EXPRESSION:
      {
        PrefixOperatorExpression prefixOperatorExpression = (PrefixOperatorExpression)theEObject;
        T result = casePrefixOperatorExpression(prefixOperatorExpression);
        if (result == null) result = caseBasicExpression(prefixOperatorExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FwitRequirementsModelPackage.METHOD_INVOCATION_EXPRESSION:
      {
        MethodInvocationExpression methodInvocationExpression = (MethodInvocationExpression)theEObject;
        T result = caseMethodInvocationExpression(methodInvocationExpression);
        if (result == null) result = caseBasicExpression(methodInvocationExpression);
        if (result == null) result = caseTaskStatement(methodInvocationExpression);
        if (result == null) result = caseStatement(methodInvocationExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FwitRequirementsModelPackage.METHOD_INVOCATION:
      {
        MethodInvocation methodInvocation = (MethodInvocation)theEObject;
        T result = caseMethodInvocation(methodInvocation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FwitRequirementsModelPackage.STATEMENT:
      {
        Statement statement = (Statement)theEObject;
        T result = caseStatement(statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FwitRequirementsModelPackage.LOCAL_VARIABLE_DECLARATION:
      {
        LocalVariableDeclaration localVariableDeclaration = (LocalVariableDeclaration)theEObject;
        T result = caseLocalVariableDeclaration(localVariableDeclaration);
        if (result == null) result = caseStatement(localVariableDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FwitRequirementsModelPackage.IF_STATEMENT:
      {
        IfStatement ifStatement = (IfStatement)theEObject;
        T result = caseIfStatement(ifStatement);
        if (result == null) result = caseStatement(ifStatement);
        if (result == null) result = caseElseBlock(ifStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FwitRequirementsModelPackage.ELSE_BLOCK:
      {
        ElseBlock elseBlock = (ElseBlock)theEObject;
        T result = caseElseBlock(elseBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FwitRequirementsModelPackage.RETURN_STATEMENT:
      {
        ReturnStatement returnStatement = (ReturnStatement)theEObject;
        T result = caseReturnStatement(returnStatement);
        if (result == null) result = caseStatement(returnStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FwitRequirementsModelPackage.TASK_STATEMENT:
      {
        TaskStatement taskStatement = (TaskStatement)theEObject;
        T result = caseTaskStatement(taskStatement);
        if (result == null) result = caseStatement(taskStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FwitRequirementsModelPackage.ASSIGNMENT_STATEMENT:
      {
        AssignmentStatement assignmentStatement = (AssignmentStatement)theEObject;
        T result = caseAssignmentStatement(assignmentStatement);
        if (result == null) result = caseTaskStatement(assignmentStatement);
        if (result == null) result = caseStatement(assignmentStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FwitRequirementsModelPackage.PAR_EXPRESSION:
      {
        ParExpression parExpression = (ParExpression)theEObject;
        T result = caseParExpression(parExpression);
        if (result == null) result = caseBasicExpression(parExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FwitRequirementsModelPackage.VARIABLE_DECLARATION:
      {
        VariableDeclaration variableDeclaration = (VariableDeclaration)theEObject;
        T result = caseVariableDeclaration(variableDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fwit Requirement Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fwit Requirement Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFwitRequirementModel(FwitRequirementModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>System Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>System Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSystemElement(SystemElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Include</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Include</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInclude(Include object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseType(Type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>System Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>System Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSystemDeclaration(SystemDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Module</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Module</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModule(Module object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Field Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Field Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFieldDeclaration(FieldDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionDeclaration(FunctionDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBlock(Block object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpression(Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Conjunction</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Conjunction</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConjunction(Conjunction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Comparision</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Comparision</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComparision(Comparision object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Value Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Value Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValueExpression(ValueExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Multiplication</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Multiplication</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMultiplication(Multiplication object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Basic Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Basic Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBasicExpression(BasicExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseName(Name object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLiteral(Literal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EString</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EString</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEString(EString object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringLiteral(StringLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Integer Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Integer Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntegerLiteral(IntegerLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Qualified Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Qualified Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQualifiedExpression(QualifiedExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Null Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Null Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNullLiteral(NullLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Prefix Operator Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Prefix Operator Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrefixOperatorExpression(PrefixOperatorExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Method Invocation Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Method Invocation Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMethodInvocationExpression(MethodInvocationExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Method Invocation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Method Invocation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMethodInvocation(MethodInvocation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStatement(Statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Local Variable Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Local Variable Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLocalVariableDeclaration(LocalVariableDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>If Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>If Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIfStatement(IfStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Else Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Else Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElseBlock(ElseBlock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Return Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Return Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReturnStatement(ReturnStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Task Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Task Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTaskStatement(TaskStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assignment Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assignment Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssignmentStatement(AssignmentStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Par Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Par Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParExpression(ParExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariableDeclaration(VariableDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  public T defaultCase(EObject object)
  {
    return null;
  }

} //FwitRequirementsModelSwitch
