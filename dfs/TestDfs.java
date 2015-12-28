package dfs;

import dfs.Dfs; 		// My implementation of Depth First Search algorithm in package dfs.

/*
	This class tests class Dfs
*/

class TestDfs{


	// Tests traversal
	public static void testTraversal(){

		int N = 15;	// No. of vertices
		
		int M = 16;	// No. fo edges

		int[][] edges = 	{	{1,2}, 		// Edges
								{1,3},
								{3,4},
								{3,5},
								{4,5},
								{5,7},
								{5,6},
								{6,7},
								{6,11}, 
								{7,8},
								{8,9},
								{9,10},
								{12,13},
								{12,15},
								{13,15},
								{13,14}


							};

		Dfs dfs = new Dfs(N, M, edges);		// Use default starting vertex 1
		
		// Do Depth First Traversal
		System.out.println("DFS Traversal");
		dfs.traverse();					

		// Print paths from source s to each vertex
		System.out.println();	
		System.out.println("Paths from vertex 1: ");
		
		for(int i=1;i<=N;i++){

			System.out.print(i+": ");
			dfs.printPath(i);
			System.out.println();
		}


	}

	public static void main(String args[]){

		// call testTraversal
		testTraversal();

	}

}