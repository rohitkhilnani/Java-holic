package bfs;

import bfs.Bfs;			// My implementation of Breadth First Search

class TestBfs{

	// Tests Bfs traversal
	
	public static void testTraversal(){

		int N = 7;			// Number of vertices
		int M = 7;			// Number of edges
		int[][] edges = {	// Edges

							{1,2}, 
							{1,6},
							{2,3},
							{3,6},
							{3,4}, 
							{3,5},
							{5,6}
						};

		int s = 1;			// Source vertex name	

		// Construct Bfs object
		Bfs bfs = new Bfs(N, M, edges, s); 	

		// Print bfs traversal

		System.out.println("Bfs Traversal: ");
		bfs.traverse();


		// Print shortest path to each vertex from source
		System.out.println("Shortest Paths: ");
		for(int i=1;i<=N;i++){
			bfs.printPath(i);
			System.out.println();
		}


		// Print Shortest distance of each vertex from source
		
		System.out.println("Shortest distances: ");
		for(int i=1;i<=N;i++){
			bfs.printShortestDistance(i);
						
		}		
	}




	public static void main(String args[]){

			// Call testA
			testTraversal();
	}

}