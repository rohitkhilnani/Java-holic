package prims;

import java.util.PriorityQueue;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Comparator;
import java.util.HashSet;
import prims.Vertex; 		// My implementation of vertex class in package prims;

/*
	This class implements PRIMS Minimum Spanning Tree algorithm.
*/

class Prims{

	// Class to encapsulate weight along with Vertex reference - to be used in adjacency list
	protected class WVertex {
		public Vertex vertex;
		public int weight=-1;			// Weight for edge

		// Constructs WVertex with specified weight and vertex reference
		public WVertex(Vertex v, int w){
			vertex = v;
			weight = w;
		}

	}	


	private HashMap<Integer, Vertex> v; 					// Map vertex name to vertex object 
	private HashMap<Integer, LinkedList<WVertex> > adj;  	// Map vertex name to adjacency list	


	// Constructs Prims object.
	// N = No. of vertices
	// M = No. of edges
	// edges = M x 3 matrix. Each row represents one undirected weighted edge. (x, y, weight)	
	// Note: Input graph should be connected (and undirected)

	public Prims(int N, int M, int[][] edges ){

		// Initialize Vetex and Adjacency map
		v = new HashMap<Integer, Vertex>(N);
		adj = new HashMap<Integer, LinkedList<WVertex> >(N);

		for(int i=1;i<=N;i++){

			v.put(i, new Vertex(i));

			adj.put(i, new LinkedList<WVertex>());	

		}

		// Create adjacency list

		for(int i=0;i<M;i++){

				//Edge (x, y, w)
				int x = edges[i][0];
				int y = edges[i][1];
				int w = edges[i][2];

				// Add x and y to each others adjacency list with weight w

				adj.get(x).add( new WVertex(v.get(y), w) );
				adj.get(y).add( new WVertex(v.get(x), w) );
		}	


	}



	// Comparator class for priority queue objects

	protected class queComp implements Comparator<Vertex>{

		//  Override compare
		public int compare(Vertex a, Vertex b){
			return a.getKey() - b.getKey();
		}
	}


	// Finds MST edges
	// Sets each vertex's parent vertex as in the MST
	// Time Complexity: O( E.log(V) )   E - No. of Edges   V - No. of Vertices

	public void findMST(){
		
		// Let vertex named 1 be the source.
		int s = 1;

		// Set source's key = 0
		v.get(s).setKey(0);				

		// Define priority queue with vertex key as priority 
		PriorityQueue<Vertex> que = new PriorityQueue<Vertex>(v.size(), new queComp());

		// Enqueue all vertices (references)

		for(int i=1;i<=v.size();i++)
			que.add(v.get(i));

		// Define a set for processed vertices
		HashSet<Integer> processed = new HashSet<Integer>(v.size());


		// Repeat while que is not empty
		while(!que.isEmpty()){

			// remove vertex from queue
			Vertex u = que.remove();

			// Add u's name to processed
			processed.add(u.getName());

			// For all vertices adjacent to u
			for(WVertex x: adj.get(u.getName())){

				// If x.vertex is not in processed
				if( ! processed.contains(x.vertex.getName()) ){

					// If weight of edge (u,x.vertex) is smaller than x.vertex's current key
					if(x.weight < x.vertex.getKey() ){

						// Set parent of x as u
						x.vertex.setParent(u.getName());

						// Remove x.vertex from queue
						que.remove(x.vertex);

						// Update key for x.vertex
						x.vertex.setKey(x.weight);

						// Enqueue x.vertex in queue
						que.add(x.vertex);	


					}

				}


			}	

		}



	}


	public void printMSTEdges(){

		// Not including vertex 1 because it was used as source and has no parent.
		for(int i=2;i<=v.size();i++){
			System.out.println("("+v.get(i).getParent()+","+v.get(i).getName()+")" );
		}

	}

}