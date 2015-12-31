package dijkstras;

import dijkstras.Vertex;		// My implementation of class vertex in package dijkstras
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.Comparator;

/*
	This class implements Dijkstra's shortest path algorithm using adjacency list representation of graph
*/


class Dijkstras{

	// Encapsultes weight with Vertex reference

	protected class WVertex{
		public int weight = -1;
		public Vertex vertex;

		// Constructs WVertex object with specified vertex and weight

		public WVertex(Vertex v, int w){
			vertex = v;
			weight = w;
		}
	}


	private HashMap<Integer, Vertex> v;						// Map from vertex name to vertex object
	private HashMap<Integer, LinkedList<WVertex> > adj;		// Map from vertex name to its adjacency list
	private int s = 1;										// Source vertex name

	// Constructs Dijkstras object.
	// N - No. of vertices
	// M - No. of edges
	// edges - M x 3 array where each row represents directed edge (x,y) of weight w.  (x,y,w)
	// s - Source vertex name
	
	public Dijkstras(int N, int M, int[][] edges, int s){

		// Initialize vertex and adjacency maps

		v = new HashMap<Integer,Vertex>(N);
		adj = new HashMap<Integer,LinkedList<WVertex> >(N);

		for(int i=1;i<=N;i++){

			v.put(i, new Vertex(i));
			adj.put(i, new LinkedList<WVertex>());
		}	

		// Initialize adjacency list

		for(int i=0;i<M;i++){

			// Edge (x,y) weighted w
			int x = edges[i][0];	
			int y = edges[i][1];
			int w = edges[i][2];

			// Put y in x's adjacency list
			adj.get(x).add( new WVertex(v.get(y),w) );
		}


		// Initialize source
		this.s = s;	

	}



	// Comparator class for priority queue

	protected class QueComp implements Comparator<Vertex>{

		// override compare
		// compare vertices based on distance
		public int compare(Vertex a, Vertex b){

			return a.getDistance() - b.getDistance();
		}
	}




	// Finds shortes paths from source s to each vertex.
	// Time Complexity: O( E.log(V) )     E - No. of edges    V - No. of vertices
	public void findShortestPaths(){

		// Set distance of source s to zero
		v.get(s).setDistance(0);

		// Define priority queue (size = no. of vertices and QueComp comparator)
		PriorityQueue<Vertex> que = new PriorityQueue<Vertex>(v.size(), new QueComp());

		// Enqueue all vertices
		for(int i=1;i<=v.size();i++)
			que.add(v.get(i));

		// Define hashset for processed vertices
		HashSet<Integer> processed = new HashSet<Integer>(v.size());


		// while queue not empty
		while(!que.isEmpty()){

			// Dequeue vertex u
			Vertex u = que.remove();

			// Add u to processed
			processed.add(u.getName());

			// For all its neighbors in adjacency list
			for(WVertex x: adj.get(u.getName()) ){

				// If x is not processed
				if(!processed.contains(x.vertex.getName())){

					// If distance from s to x is shorter via u
					if(u.getDistance() + x.weight < x.vertex.getDistance()){

						
						// Remove x from queue 
						que.remove(x.vertex);

						// Change x's distance	
						x.vertex.setDistance( u.getDistance() + x.weight );

						//Insert x back in queue
						que.add(x.vertex);

						// Set u as x's parent
						x.vertex.setParent(u.getName());
					}

				}	


			}
		}




	}


	// Prints path from source s to u

	public void printPath(int u){

		// If u is s, print s
		if(u == s){
			System.out.print(s+" ");
		}

		else {

			// If u has no parent, then path is not possible
			if(v.get(u).getParent() == -1){
				System.out.print("Path does not exist");
			}
			else{

				printPath(v.get(u).getParent());
				System.out.print(u+" ");
			}

		}


	}	


	// Displays shortest distance of each vertex from source.
	// 999999 implies path does not exist

	public void showDist(){

		for(int i=1;i<=v.size();i++)
			System.out.println(i+":  "+v.get(i).getDistance());	
	} 		

}	

