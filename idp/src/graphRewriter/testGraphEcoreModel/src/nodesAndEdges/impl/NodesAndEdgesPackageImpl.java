/**
 */
package nodesAndEdges.impl;

import nodesAndEdges.Color;
import nodesAndEdges.ColoredNode;
import nodesAndEdges.ColoredNode_toString;
import nodesAndEdges.Edge;
import nodesAndEdges.EdgeViewType;
import nodesAndEdges.Edge_toString;
import nodesAndEdges.Node;
import nodesAndEdges.Node_toString;
import nodesAndEdges.NodesAndEdgesFactory;
import nodesAndEdges.NodesAndEdgesPackage;
import nodesAndEdges.Shape;
import nodesAndEdges.ShapedNode;
import nodesAndEdges.ShapedNode_toString;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NodesAndEdgesPackageImpl extends EPackageImpl implements NodesAndEdgesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coloredNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass node_toStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coloredNode_toStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edge_toStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shapedNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shapedNode_toStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum colorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum edgeViewTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum shapeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see nodesAndEdges.NodesAndEdgesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private NodesAndEdgesPackageImpl() {
		super(eNS_URI, NodesAndEdgesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link NodesAndEdgesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static NodesAndEdgesPackage init() {
		if (isInited) return (NodesAndEdgesPackage)EPackage.Registry.INSTANCE.getEPackage(NodesAndEdgesPackage.eNS_URI);

		// Obtain or create and register package
		NodesAndEdgesPackageImpl theNodesAndEdgesPackage = (NodesAndEdgesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof NodesAndEdgesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new NodesAndEdgesPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theNodesAndEdgesPackage.createPackageContents();

		// Initialize created meta-data
		theNodesAndEdgesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theNodesAndEdgesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(NodesAndEdgesPackage.eNS_URI, theNodesAndEdgesPackage);
		return theNodesAndEdgesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColoredNode() {
		return coloredNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColoredNode_Color() {
		return (EAttribute)coloredNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getColoredNode__ToString() {
		return coloredNodeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNode_Name() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNode_toString() {
		return node_toStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColoredNode_toString() {
		return coloredNode_toStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEdge() {
		return edgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEdge_Name() {
		return (EAttribute)edgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEdge_Type() {
		return (EAttribute)edgeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEdge__ToString() {
		return edgeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEdge_toString() {
		return edge_toStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShapedNode() {
		return shapedNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShapedNode_Size() {
		return (EAttribute)shapedNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShapedNode_Shape() {
		return (EAttribute)shapedNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getShapedNode__ToString() {
		return shapedNodeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShapedNode_toString() {
		return shapedNode_toStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getColor() {
		return colorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEdgeViewType() {
		return edgeViewTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getShape() {
		return shapeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodesAndEdgesFactory getNodesAndEdgesFactory() {
		return (NodesAndEdgesFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		coloredNodeEClass = createEClass(COLORED_NODE);
		createEAttribute(coloredNodeEClass, COLORED_NODE__COLOR);
		createEOperation(coloredNodeEClass, COLORED_NODE___TO_STRING);

		nodeEClass = createEClass(NODE);
		createEAttribute(nodeEClass, NODE__NAME);

		node_toStringEClass = createEClass(NODE_TO_STRING);

		coloredNode_toStringEClass = createEClass(COLORED_NODE_TO_STRING);

		edgeEClass = createEClass(EDGE);
		createEAttribute(edgeEClass, EDGE__NAME);
		createEAttribute(edgeEClass, EDGE__TYPE);
		createEOperation(edgeEClass, EDGE___TO_STRING);

		edge_toStringEClass = createEClass(EDGE_TO_STRING);

		shapedNodeEClass = createEClass(SHAPED_NODE);
		createEAttribute(shapedNodeEClass, SHAPED_NODE__SIZE);
		createEAttribute(shapedNodeEClass, SHAPED_NODE__SHAPE);
		createEOperation(shapedNodeEClass, SHAPED_NODE___TO_STRING);

		shapedNode_toStringEClass = createEClass(SHAPED_NODE_TO_STRING);

		// Create enums
		colorEEnum = createEEnum(COLOR);
		edgeViewTypeEEnum = createEEnum(EDGE_VIEW_TYPE);
		shapeEEnum = createEEnum(SHAPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		coloredNodeEClass.getESuperTypes().add(this.getNode());
		shapedNodeEClass.getESuperTypes().add(this.getNode());

		// Initialize classes, features, and operations; add parameters
		initEClass(coloredNodeEClass, ColoredNode.class, "ColoredNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColoredNode_Color(), this.getColor(), "color", null, 1, 1, ColoredNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getColoredNode__ToString(), ecorePackage.getEString(), "toString", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNode_Name(), ecorePackage.getEString(), "name", null, 1, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(node_toStringEClass, Node_toString.class, "Node_toString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(coloredNode_toStringEClass, ColoredNode_toString.class, "ColoredNode_toString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(edgeEClass, Edge.class, "Edge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEdge_Name(), ecorePackage.getEString(), "name", null, 1, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getEdge_Type(), this.getEdgeViewType(), "type", null, 1, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getEdge__ToString(), ecorePackage.getEString(), "toString", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(edge_toStringEClass, Edge_toString.class, "Edge_toString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(shapedNodeEClass, ShapedNode.class, "ShapedNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getShapedNode_Size(), ecorePackage.getEFloat(), "size", null, 1, 1, ShapedNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getShapedNode_Shape(), this.getShape(), "shape", null, 1, 1, ShapedNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getShapedNode__ToString(), ecorePackage.getEString(), "toString", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(shapedNode_toStringEClass, ShapedNode_toString.class, "ShapedNode_toString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(colorEEnum, Color.class, "Color");
		addEEnumLiteral(colorEEnum, Color.RED);
		addEEnumLiteral(colorEEnum, Color.BLUE);

		initEEnum(edgeViewTypeEEnum, EdgeViewType.class, "EdgeViewType");
		addEEnumLiteral(edgeViewTypeEEnum, EdgeViewType.SOLIDLINE);
		addEEnumLiteral(edgeViewTypeEEnum, EdgeViewType.DASHLINE);

		initEEnum(shapeEEnum, Shape.class, "Shape");
		addEEnumLiteral(shapeEEnum, Shape.ROUND);
		addEEnumLiteral(shapeEEnum, Shape.SQUARE);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/uml2/1.1.0/GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/1.1.0/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/uml2/1.1.0/GenModel";	
		addAnnotation
		  (getColoredNode__ToString(), 
		   source, 
		   new String[] {
			 "body", "return this.getName()+\":\"+this.getColor();\n"
		   });	
		addAnnotation
		  (getEdge__ToString(), 
		   source, 
		   new String[] {
			 "body", "if(this.type.equals(EdgeViewType.dashline)) {\n\t\treturn String.valueOf(\"dashline\");\n\t} else if(this.type.equals(EdgeViewType.solidline)) {\n\t\treturn String.valueOf(\"solidline\");\n\t} else {\n\t\treturn String.valueOf(\"unknown\");\n\t}\n"
		   });	
		addAnnotation
		  (getShapedNode__ToString(), 
		   source, 
		   new String[] {
			 "body", "return this.getName()+\":\"+this.getShape()+\",\"+this.getSize();\n"
		   });
	}

} //NodesAndEdgesPackageImpl
