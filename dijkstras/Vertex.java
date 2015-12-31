package dijkstras;

/*
	This class defines a vertex for Dijkstra's algorithm
*/

class Vertex{

	private int name = -1;				// Vertex name
	private int parent = -1;			// Parent vertex' name
	private int distance = 999999;		// Distance of vertex from source


	// Constructs vertex with specified name

	public Vertex(int name){

		this.name = name;
	}


	// Returns name

	public int getName(){
		return name;
	}	


	// Sets parent

	public void setParent(int p){
		parent = p;		
	}


	// Gets parent

	public int getParent(){
		return parent;
	}


	// Sets distance

	public void setDistance(int d){
		distance = d;
	}


	// Gets distance

	public int getDistance(){
		return distance;
	}

}	