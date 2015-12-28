package bfs;

import bfs.Vertex;			// My implementation of class Vertex in package bfs
import java.util.Queue;
import java.util.LinkedList;
import java.util.HashMap;
/*
	This class implements Breadth First Search algorithm using adjacency list representation of a graph.
*/

class Bfs{

	private HashMap<Integer, Vertex> v;						// Map from Vertex name to a Vertex object
	private HashMap<Integer, LinkedList<Vertex> > adj; 		// Map from Vertex name to its adjacency list
	private int s=-1;										// Source for Bfs



	// Constructs a bfs object.
	// Initializs the graph vertices and adjacency list.
	// N - Number of vertices
	// M - Number of edges
	// edges - M x 2 array. Each row represents on undirected edge. 
	// s - Source vertex name

	public Bfs(int N, int M, int[][] edges, int s){

		// Initialize vertex map  and adjacecny map
		
		v = new HashMap<Integer,Vertex>(N);
		adj = new HashMap<Integer,LinkedList<Vertex> >(N);

		for(int i=1;i<=N;i++){

			v.put(i, new Vertex(i));		

			adj.put(i, new LinkedList<Vertex>());
		}


		// Create adjacency list based on edges

		for(int i=0;i<M;i++){

			//edge(x, y)
			int x = edges[i][0]; 		
			int y = edges[i][1];


			// Add vertex named y in x's adjacency list
			adj.get(x).add( v.get(y) );	

			// Add vertex named x in y's adjacency list
			adj.get(y).add( v.get(x) );

		}


		// Set source
		this.s = s;

	}


	// Performs a breadth first traversal of vertices.
	// Finds parent of each vertex in bfs tree
	// Find shortest path from source to each vertex
	// Time Complexity: O(V + E) 		 E - No. of edges, V - No. of vertices 

	public void traverse(){

		// Set source distance to zero
		v.get(s).setDistance(0);

		// Set source color to gray
		v.get(s).setColor('g');

		//Create a queue to hold vertex references
		Queue<Vertex> que = new LinkedList<Vertex>();

		// Enqueue source vertex
		que.add(v.get(s));

		// While que is not empty, remove vertex
		while(!que.isEmpty()){

			// remove vertex from queue
			Vertex u = que.remove();

			// Print u
			System.out.print(u.getName() + " ");

			// For each vertex v in adjacency list of u
			for(Vertex v: adj.get( u.getName() )){

				// If v is white
				if(v.getColor()=='w'){

					// Set v as gray
					v.setColor('g');

					// Set distance of v = distance of u + 1
					v.setDistance(u.getDistance() + 1);

					// Set u as v's parent
					v.setParent(u.getName());

					// Enqueue v
					que.add(v);

				}
			}

			// Set u as black
			u.setColor('b');

		}


		System.out.println();

	}


	// Prints shortest path from source s to vertex u, if exists
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


	// Prints shortest distance of vertex u from source s
	// Time Complexity: O(1)

	public void printShortestDistance(int u){

		System.out.println(u + ": " + v.get(u).getDistance());	
	}
}	
