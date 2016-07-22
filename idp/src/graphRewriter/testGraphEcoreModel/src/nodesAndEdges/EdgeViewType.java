/**
 */
package nodesAndEdges;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Edge View Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see nodesAndEdges.NodesAndEdgesPackage#getEdgeViewType()
 * @model
 * @generated
 */
public enum EdgeViewType implements Enumerator {
	/**
	 * The '<em><b>Solidline</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOLIDLINE_VALUE
	 * @generated
	 * @ordered
	 */
	SOLIDLINE(0, "solidline", "solidline"),

	/**
	 * The '<em><b>Dashline</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DASHLINE_VALUE
	 * @generated
	 * @ordered
	 */
	DASHLINE(1, "dashline", "dashline");

	/**
	 * The '<em><b>Solidline</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Solidline</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOLIDLINE
	 * @model name="solidline"
	 * @generated
	 * @ordered
	 */
	public static final int SOLIDLINE_VALUE = 0;

	/**
	 * The '<em><b>Dashline</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dashline</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DASHLINE
	 * @model name="dashline"
	 * @generated
	 * @ordered
	 */
	public static final int DASHLINE_VALUE = 1;

	/**
	 * An array of all the '<em><b>Edge View Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EdgeViewType[] VALUES_ARRAY =
		new EdgeViewType[] {
			SOLIDLINE,
			DASHLINE,
		};

	/**
	 * A public read-only list of all the '<em><b>Edge View Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EdgeViewType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Edge View Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EdgeViewType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EdgeViewType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Edge View Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EdgeViewType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EdgeViewType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Edge View Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EdgeViewType get(int value) {
		switch (value) {
			case SOLIDLINE_VALUE: return SOLIDLINE;
			case DASHLINE_VALUE: return DASHLINE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EdgeViewType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //EdgeViewType
