/**
 * <copyright>
 * </copyright>
 *
 */
package jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.util;

import jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.FwitRequirementsModelPackage
 * @generated
 */
public class FwitRequirementsModelAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static FwitRequirementsModelPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FwitRequirementsModelAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = FwitRequirementsModelPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FwitRequirementsModelSwitch<Adapter> modelSwitch =
    new FwitRequirementsModelSwitch<Adapter>()
    {
      @Override
      public Adapter caseFwitRequirementModel(FwitRequirementModel object)
      {
        return createFwitRequirementModelAdapter();
      }
      @Override
      public Adapter caseSystemElement(SystemElement object)
      {
        return createSystemElementAdapter();
      }
      @Override
      public Adapter caseInclude(Include object)
      {
        return createIncludeAdapter();
      }
      @Override
      public Adapter caseType(Type object)
      {
        return createTypeAdapter();
      }
      @Override
      public Adapter caseSystemDeclaration(SystemDeclaration object)
      {
        return createSystemDeclarationAdapter();
      }
      @Override
      public Adapter caseModule(Module object)
      {
        return createModuleAdapter();
      }
      @Override
      public Adapter caseFieldDeclaration(FieldDeclaration object)
      {
        return createFieldDeclarationAdapter();
      }
      @Override
      public Adapter caseFunctionDeclaration(FunctionDeclaration object)
      {
        return createFunctionDeclarationAdapter();
      }
      @Override
      public Adapter caseBlock(Block object)
      {
        return createBlockAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseConjunction(Conjunction object)
      {
        return createConjunctionAdapter();
      }
      @Override
      public Adapter caseComparision(Comparision object)
      {
        return createComparisionAdapter();
      }
      @Override
      public Adapter caseValueExpression(ValueExpression object)
      {
        return createValueExpressionAdapter();
      }
      @Override
      public Adapter caseMultiplication(Multiplication object)
      {
        return createMultiplicationAdapter();
      }
      @Override
      public Adapter caseBasicExpression(BasicExpression object)
      {
        return createBasicExpressionAdapter();
      }
      @Override
      public Adapter caseName(Name object)
      {
        return createNameAdapter();
      }
      @Override
      public Adapter caseLiteral(Literal object)
      {
        return createLiteralAdapter();
      }
      @Override
      public Adapter caseEString(EString object)
      {
        return createEStringAdapter();
      }
      @Override
      public Adapter caseStringLiteral(StringLiteral object)
      {
        return createStringLiteralAdapter();
      }
      @Override
      public Adapter caseIntegerLiteral(IntegerLiteral object)
      {
        return createIntegerLiteralAdapter();
      }
      @Override
      public Adapter caseQualifiedExpression(QualifiedExpression object)
      {
        return createQualifiedExpressionAdapter();
      }
      @Override
      public Adapter caseNullLiteral(NullLiteral object)
      {
        return createNullLiteralAdapter();
      }
      @Override
      public Adapter casePrefixOperatorExpression(PrefixOperatorExpression object)
      {
        return createPrefixOperatorExpressionAdapter();
      }
      @Override
      public Adapter caseMethodInvocationExpression(MethodInvocationExpression object)
      {
        return createMethodInvocationExpressionAdapter();
      }
      @Override
      public Adapter caseMethodInvocation(MethodInvocation object)
      {
        return createMethodInvocationAdapter();
      }
      @Override
      public Adapter caseStatement(Statement object)
      {
        return createStatementAdapter();
      }
      @Override
      public Adapter caseLocalVariableDeclaration(LocalVariableDeclaration object)
      {
        return createLocalVariableDeclarationAdapter();
      }
      @Override
      public Adapter caseIfStatement(IfStatement object)
      {
        return createIfStatementAdapter();
      }
      @Override
      public Adapter caseElseBlock(ElseBlock object)
      {
        return createElseBlockAdapter();
      }
      @Override
      public Adapter caseReturnStatement(ReturnStatement object)
      {
        return createReturnStatementAdapter();
      }
      @Override
      public Adapter caseTaskStatement(TaskStatement object)
      {
        return createTaskStatementAdapter();
      }
      @Override
      public Adapter caseAssignmentStatement(AssignmentStatement object)
      {
        return createAssignmentStatementAdapter();
      }
      @Override
      public Adapter caseParExpression(ParExpression object)
      {
        return createParExpressionAdapter();
      }
      @Override
      public Adapter caseVariableDeclaration(VariableDeclaration object)
      {
        return createVariableDeclarationAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.FwitRequirementModel <em>Fwit Requirement Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.FwitRequirementModel
   * @generated
   */
  public Adapter createFwitRequirementModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.SystemElement <em>System Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.SystemElement
   * @generated
   */
  public Adapter createSystemElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Include <em>Include</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Include
   * @generated
   */
  public Adapter createIncludeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Type
   * @generated
   */
  public Adapter createTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.SystemDeclaration <em>System Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.SystemDeclaration
   * @generated
   */
  public Adapter createSystemDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Module <em>Module</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Module
   * @generated
   */
  public Adapter createModuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.FieldDeclaration <em>Field Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.FieldDeclaration
   * @generated
   */
  public Adapter createFieldDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.FunctionDeclaration <em>Function Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.FunctionDeclaration
   * @generated
   */
  public Adapter createFunctionDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Block <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Block
   * @generated
   */
  public Adapter createBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Conjunction <em>Conjunction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Conjunction
   * @generated
   */
  public Adapter createConjunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Comparision <em>Comparision</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Comparision
   * @generated
   */
  public Adapter createComparisionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.ValueExpression <em>Value Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.ValueExpression
   * @generated
   */
  public Adapter createValueExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Multiplication <em>Multiplication</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Multiplication
   * @generated
   */
  public Adapter createMultiplicationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.BasicExpression <em>Basic Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.BasicExpression
   * @generated
   */
  public Adapter createBasicExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Name <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Name
   * @generated
   */
  public Adapter createNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Literal
   * @generated
   */
  public Adapter createLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.EString <em>EString</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.EString
   * @generated
   */
  public Adapter createEStringAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.StringLiteral <em>String Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.StringLiteral
   * @generated
   */
  public Adapter createStringLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.IntegerLiteral <em>Integer Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.IntegerLiteral
   * @generated
   */
  public Adapter createIntegerLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.QualifiedExpression <em>Qualified Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.QualifiedExpression
   * @generated
   */
  public Adapter createQualifiedExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.NullLiteral <em>Null Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.NullLiteral
   * @generated
   */
  public Adapter createNullLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.PrefixOperatorExpression <em>Prefix Operator Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.PrefixOperatorExpression
   * @generated
   */
  public Adapter createPrefixOperatorExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.MethodInvocationExpression <em>Method Invocation Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.MethodInvocationExpression
   * @generated
   */
  public Adapter createMethodInvocationExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.MethodInvocation <em>Method Invocation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.MethodInvocation
   * @generated
   */
  public Adapter createMethodInvocationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.Statement
   * @generated
   */
  public Adapter createStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.LocalVariableDeclaration <em>Local Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.LocalVariableDeclaration
   * @generated
   */
  public Adapter createLocalVariableDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.IfStatement <em>If Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.IfStatement
   * @generated
   */
  public Adapter createIfStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.ElseBlock <em>Else Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.ElseBlock
   * @generated
   */
  public Adapter createElseBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.ReturnStatement <em>Return Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.ReturnStatement
   * @generated
   */
  public Adapter createReturnStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.TaskStatement <em>Task Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.TaskStatement
   * @generated
   */
  public Adapter createTaskStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.AssignmentStatement <em>Assignment Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.AssignmentStatement
   * @generated
   */
  public Adapter createAssignmentStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.ParExpression <em>Par Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.ParExpression
   * @generated
   */
  public Adapter createParExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.VariableDeclaration <em>Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.ac.titech.cs.se.fwit.dsl.fwitRequirementsModel.VariableDeclaration
   * @generated
   */
  public Adapter createVariableDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //FwitRequirementsModelAdapterFactory
