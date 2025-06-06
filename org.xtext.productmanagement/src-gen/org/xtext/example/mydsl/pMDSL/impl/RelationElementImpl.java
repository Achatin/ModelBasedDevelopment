/**
 * generated by Xtext 2.38.0
 */
package org.xtext.example.mydsl.pMDSL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.pMDSL.PMDSLPackage;
import org.xtext.example.mydsl.pMDSL.RelationElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pMDSL.impl.RelationElementImpl#getEntity1 <em>Entity1</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pMDSL.impl.RelationElementImpl#getCardinality1 <em>Cardinality1</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pMDSL.impl.RelationElementImpl#getCardinality2 <em>Cardinality2</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pMDSL.impl.RelationElementImpl#getEntity2 <em>Entity2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelationElementImpl extends MinimalEObjectImpl.Container implements RelationElement
{
  /**
   * The default value of the '{@link #getEntity1() <em>Entity1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntity1()
   * @generated
   * @ordered
   */
  protected static final String ENTITY1_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEntity1() <em>Entity1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntity1()
   * @generated
   * @ordered
   */
  protected String entity1 = ENTITY1_EDEFAULT;

  /**
   * The default value of the '{@link #getCardinality1() <em>Cardinality1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCardinality1()
   * @generated
   * @ordered
   */
  protected static final String CARDINALITY1_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCardinality1() <em>Cardinality1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCardinality1()
   * @generated
   * @ordered
   */
  protected String cardinality1 = CARDINALITY1_EDEFAULT;

  /**
   * The default value of the '{@link #getCardinality2() <em>Cardinality2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCardinality2()
   * @generated
   * @ordered
   */
  protected static final String CARDINALITY2_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCardinality2() <em>Cardinality2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCardinality2()
   * @generated
   * @ordered
   */
  protected String cardinality2 = CARDINALITY2_EDEFAULT;

  /**
   * The default value of the '{@link #getEntity2() <em>Entity2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntity2()
   * @generated
   * @ordered
   */
  protected static final String ENTITY2_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEntity2() <em>Entity2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntity2()
   * @generated
   * @ordered
   */
  protected String entity2 = ENTITY2_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RelationElementImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PMDSLPackage.Literals.RELATION_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getEntity1()
  {
    return entity1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setEntity1(String newEntity1)
  {
    String oldEntity1 = entity1;
    entity1 = newEntity1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PMDSLPackage.RELATION_ELEMENT__ENTITY1, oldEntity1, entity1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getCardinality1()
  {
    return cardinality1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCardinality1(String newCardinality1)
  {
    String oldCardinality1 = cardinality1;
    cardinality1 = newCardinality1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PMDSLPackage.RELATION_ELEMENT__CARDINALITY1, oldCardinality1, cardinality1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getCardinality2()
  {
    return cardinality2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCardinality2(String newCardinality2)
  {
    String oldCardinality2 = cardinality2;
    cardinality2 = newCardinality2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PMDSLPackage.RELATION_ELEMENT__CARDINALITY2, oldCardinality2, cardinality2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getEntity2()
  {
    return entity2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setEntity2(String newEntity2)
  {
    String oldEntity2 = entity2;
    entity2 = newEntity2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PMDSLPackage.RELATION_ELEMENT__ENTITY2, oldEntity2, entity2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case PMDSLPackage.RELATION_ELEMENT__ENTITY1:
        return getEntity1();
      case PMDSLPackage.RELATION_ELEMENT__CARDINALITY1:
        return getCardinality1();
      case PMDSLPackage.RELATION_ELEMENT__CARDINALITY2:
        return getCardinality2();
      case PMDSLPackage.RELATION_ELEMENT__ENTITY2:
        return getEntity2();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PMDSLPackage.RELATION_ELEMENT__ENTITY1:
        setEntity1((String)newValue);
        return;
      case PMDSLPackage.RELATION_ELEMENT__CARDINALITY1:
        setCardinality1((String)newValue);
        return;
      case PMDSLPackage.RELATION_ELEMENT__CARDINALITY2:
        setCardinality2((String)newValue);
        return;
      case PMDSLPackage.RELATION_ELEMENT__ENTITY2:
        setEntity2((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case PMDSLPackage.RELATION_ELEMENT__ENTITY1:
        setEntity1(ENTITY1_EDEFAULT);
        return;
      case PMDSLPackage.RELATION_ELEMENT__CARDINALITY1:
        setCardinality1(CARDINALITY1_EDEFAULT);
        return;
      case PMDSLPackage.RELATION_ELEMENT__CARDINALITY2:
        setCardinality2(CARDINALITY2_EDEFAULT);
        return;
      case PMDSLPackage.RELATION_ELEMENT__ENTITY2:
        setEntity2(ENTITY2_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case PMDSLPackage.RELATION_ELEMENT__ENTITY1:
        return ENTITY1_EDEFAULT == null ? entity1 != null : !ENTITY1_EDEFAULT.equals(entity1);
      case PMDSLPackage.RELATION_ELEMENT__CARDINALITY1:
        return CARDINALITY1_EDEFAULT == null ? cardinality1 != null : !CARDINALITY1_EDEFAULT.equals(cardinality1);
      case PMDSLPackage.RELATION_ELEMENT__CARDINALITY2:
        return CARDINALITY2_EDEFAULT == null ? cardinality2 != null : !CARDINALITY2_EDEFAULT.equals(cardinality2);
      case PMDSLPackage.RELATION_ELEMENT__ENTITY2:
        return ENTITY2_EDEFAULT == null ? entity2 != null : !ENTITY2_EDEFAULT.equals(entity2);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (entity1: ");
    result.append(entity1);
    result.append(", cardinality1: ");
    result.append(cardinality1);
    result.append(", cardinality2: ");
    result.append(cardinality2);
    result.append(", entity2: ");
    result.append(entity2);
    result.append(')');
    return result.toString();
  }

} //RelationElementImpl
