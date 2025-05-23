/**
 * generated by Xtext 2.38.0
 */
package org.xtext.example.mydsl.pMDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pMDSL.RelationElement#getEntity1 <em>Entity1</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pMDSL.RelationElement#getCardinality1 <em>Cardinality1</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pMDSL.RelationElement#getCardinality2 <em>Cardinality2</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pMDSL.RelationElement#getEntity2 <em>Entity2</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.pMDSL.PMDSLPackage#getRelationElement()
 * @model
 * @generated
 */
public interface RelationElement extends EObject
{
  /**
   * Returns the value of the '<em><b>Entity1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entity1</em>' attribute.
   * @see #setEntity1(String)
   * @see org.xtext.example.mydsl.pMDSL.PMDSLPackage#getRelationElement_Entity1()
   * @model
   * @generated
   */
  String getEntity1();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pMDSL.RelationElement#getEntity1 <em>Entity1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entity1</em>' attribute.
   * @see #getEntity1()
   * @generated
   */
  void setEntity1(String value);

  /**
   * Returns the value of the '<em><b>Cardinality1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cardinality1</em>' attribute.
   * @see #setCardinality1(String)
   * @see org.xtext.example.mydsl.pMDSL.PMDSLPackage#getRelationElement_Cardinality1()
   * @model
   * @generated
   */
  String getCardinality1();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pMDSL.RelationElement#getCardinality1 <em>Cardinality1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cardinality1</em>' attribute.
   * @see #getCardinality1()
   * @generated
   */
  void setCardinality1(String value);

  /**
   * Returns the value of the '<em><b>Cardinality2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cardinality2</em>' attribute.
   * @see #setCardinality2(String)
   * @see org.xtext.example.mydsl.pMDSL.PMDSLPackage#getRelationElement_Cardinality2()
   * @model
   * @generated
   */
  String getCardinality2();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pMDSL.RelationElement#getCardinality2 <em>Cardinality2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cardinality2</em>' attribute.
   * @see #getCardinality2()
   * @generated
   */
  void setCardinality2(String value);

  /**
   * Returns the value of the '<em><b>Entity2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entity2</em>' attribute.
   * @see #setEntity2(String)
   * @see org.xtext.example.mydsl.pMDSL.PMDSLPackage#getRelationElement_Entity2()
   * @model
   * @generated
   */
  String getEntity2();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pMDSL.RelationElement#getEntity2 <em>Entity2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entity2</em>' attribute.
   * @see #getEntity2()
   * @generated
   */
  void setEntity2(String value);

} // RelationElement
