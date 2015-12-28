package bfs;

/*
	This class defines a vertex for Breadth First Search algorithm.
*/

class Vertex{

	private int name = -1;					// vertex name
	private int parent = -1;				// parent vertex's name in bfs tree
	private int distance = -1;				// shortest distance from source vertex
	private char color = 'w';					// color of vertex


	// Constructs vertex with specified name

	public Vertex(int name){

		this.name = name;
	}


	// Returns name

	public int getName(){

		return name;
	}

	// Returns parent's name

	public int getParent(){

		return parent;
	}

	// Returns distance

	public int getDistance(){

		return distance;
	}
	
	// Returns color

	public char getColor(){

		return color;
	}

	// Sets parent

	public void setParent(int p){

		parent = p;
	}

	// Sets distance

	public void setDistance(int d){

		distance = d;
	}

	// Sets color	

	public void setColor(char c){

		color = c;
	}

}	