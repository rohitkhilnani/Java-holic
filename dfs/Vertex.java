package dfs;

/*
	This class defines a Vertex for Depth First Searcg Algorithm
*/

class Vertex{

	private int name = -1;				// Vertex name					
	private int d = -1; 					// Discovery timestamp
	private int f = -1; 				// Finishing timestamp 	
	private int parent = -1; 			// Parent vertex name in BFS forest
	private char color = 'w'; 			// Color (w - white, g - gray, b - black)


	// Constructs a vertex with specified name

	public Vertex(int name){
		this.name = name;
	}


	// Sets discovery time

	public void setD(int d){
		this.d = d;
	}


	// Sets Finishing time
	
	public void setF(int f){
		this.f = f;
	} 


	// Sets Color
	
	public void setColor(char c){
		color = c;
	}

	// Sets parent

	public void setParent(int p){
		parent = p;

	}
		
	// Returns name

	public int getName(){
		return name;
	}	


	// Returns d

	public int getD(){
		return d;
	}


	// Returns f

	public int getF(){
		return f;
	}


	// Returns Color

	public int getColor(){
		return color;
	}

	// Returns parent

	public int getParent(){
		return parent;
	}


	
}

