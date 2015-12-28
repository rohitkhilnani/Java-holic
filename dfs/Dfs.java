package dfs;

import java.util.HashMap;
import java.util.LinkedList;
import dfs.Vertex;			// My implementation of Vertex class for Depth First Search

/*
	This class implements Depth first Search Algorithm using adjacency list representation of graph
*/

class Dfs{

	private HashMap<Integer, Vertex> v ; 					// Map from vertex name to Vertex object
	private HashMap<Integer, LinkedList<Vertex> > adj;		// Map from vertex name to its adjacency list
	private int s = 1; 										// starting vertex // Default is vertex named 1
	private static int t = 0;								// timestamp variable


	// Constructs Dfs object.
	// N - No. of vertices
	// M - No. of edges
	// edges - M x 2 array with each row representing one edge
	// s - starting vertex for dfs

	public Dfs(int N, int M, int[][] edges, int s){


		// Initialize vertex and adjacency map

		v = new HashMap<Integer, Vertex>(N);
		adj = new HashMap<Integer, LinkedList<Vertex> >(N);	

		for(int i=1;i<=N;i++){

			v.put(i, new Vertex(i));

			adj.put(i, new LinkedList<Vertex>());

		}


		// Create adjacency list from edges

		for(int i=0;i<M;i++){

			// Edge (x, y)
			int x = edges[i][0];
			int y = edges[i][1];

			// Add vertex named y to x's adjacency list

			adj.get(x).add( v.get(y) );

			

		}

		// Set source s
		this.s = s;

	}


	// Overloaded constructor - uses default vertex 1 as starting vertex
	
	public Dfs(int N, int M, int[][] edges){
		this(N, M, edges, 1); 			// Call public Dfs(int N, int M, int[][] edges, int s) with s = 1

	}


	// Starts Dfs using a specific starting vertex and restarts Dfs if there are undiscovered vertices 
	// After first Dfs pass.

	public void traverse(){

		// Make source vertex gray
		v.get(s).setColor('g');

		// Start Dfs with s as starting vertex
		dfsVisit(v.get(s));

		// Start dfs again if there are any undiscovered nodes. (use smallest (numerically) vertex as source)
		for(int i=1;i<=v.size();i++)
			if(v.get(i).getColor()=='w'){
				System.out.println();
				dfsVisit(v.get(i));
			}	

	}


	// Vists vertex u of tree in dfs fashion
	// Time Complexity: O(V + E)	V - No. of vertices		E - No. of edges	 

	public void dfsVisit(Vertex u){

		// Print u
		System.out.print(u.getName()+" ");

		// Make u gray
		u.setColor('g');

		// Set its discovery time
		u.setD(++t);

		// For each vertex v in adjacency list of u
		for(Vertex v: adj.get(u.getName())){

			// If v is white
			if(v.getColor()=='w'){

				// Set its parent to u
				v.setParent(u.getName());

				// Call Dfs on v
				dfsVisit(v);

			}	
		}

		// Make u black
		u.setColor('b');

		// Set u's finishing time
		u.setF(++t);

	}	


	// Prints path from source s to vertex u, if exists
	// Time Complexity: O(N)

	public void printPath(int u){

		// If u is source s, print s
		if(s == u)
			System.out.print(s + " ");
		else {

			// Otherwise, if u has no parent, path does not exit
			if(v.get(u).getParent() == -1)
				System.out.print("Path does not exit");
			else {
					// Otherwise, print path from s to v's parent
					printPath(v.get(u).getParent());

					// print v
					System.out.print(u + " " );

			}


		}

	}


}