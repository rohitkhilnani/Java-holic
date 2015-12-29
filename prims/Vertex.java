package prims;

/*
	This class defines vertex for Prims Minimum Spanning Tree algorithm.
*/

class Vertex{

	private int name = -1;					// Vertex name
	private int parent = -1;			// Parent in MST
	private int key = 99999999;			// Key //Distance to MST subset

	// Constructs vertex with specified name

	public Vertex(int name){

		this.name = name;
	}


	// Constructs Vertex with default values

	public Vertex(){
		// Do Nothing.
	}


	// Returns name

	public int getName(){
		return name;
	}


	// Sets parent

	public void setParent(int p){
		parent = p;
	}


	// Returns parent

	public int getParent(){
		return parent;
	}


	// Sets Key

	public void setKey(int k){
		key = k;
	}


	// Returns key

	public int getKey(){
		return key;
	}



}