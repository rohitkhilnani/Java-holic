package dfs;

import dfs.Dfs; 		// My implementation of Depth First Search algorithm in package dfs.

/*
	This class tests class Dfs
*/

class TestDfs{


	// Tests traversal
	public static void testTraversal(){

		System.out.println("Test 1: \n");
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


	// Tests traversal and whether graph is acyclic or not
	public static void testCyclicA(){

		System.out.println("Test 2: \n");

		int N = 5;	// No. of vertices
		
		int M = 5;	// No. fo edges

		int[][] edges = 	{	{1,2}, 		// Edges
								{1,4},
								{2,3},
								{3,4},
								{1,5}								

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

		System.out.println("Is graph cyclic? : " + dfs.isCyclic());
		System.out.print("Topological Sort: ");

		// Print topological sort
		dfs.topologicalSort();
		System.out.println();
	}


	// Tests traversal and whether graph is acyclic or not
	public static void testCyclicB(){

		System.out.println("Test 3: \n");

		int N = 5;	// No. of vertices
		
		int M = 7;	// No. fo edges

		int[][] edges = 	{	{1,2}, 		// Edges
								{1,4},
								{2,3},
								{3,4},
								{1,5},
								{3,5},
								{5,1}

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

		System.out.println("Is graph cyclic? : " + dfs.isCyclic());
		System.out.print("Topological Sort: ");

		// Print topological sort
		dfs.topologicalSort();
		System.out.println();

	}


	// Tests Topolocial Sort

	public static void testTopologicalSort(){

		System.out.println("Test 4: \n");
		int N = 6;	// No. of vertices
		
		int M = 13;	// No. fo edges

		int[][] edges = 	{	{1,2}, 		// Edges
								{1,3},
								{1,4},
								{1,5},
								{1,6},
								{2,3},
								{2,4},
								{2,5},
								{3,6}, 
								{3,4},
								{4,5},
								{4,6},
								{5,6},
								

							};

		Dfs dfs = new Dfs(N, M, edges);		// Use default starting vertex 1

		System.out.println("Topological Sort: ");
		dfs.topologicalSort();

	}


	public static void main(String args[]){

		// Test Traversal
		testTraversal();
		
		// Test whether cyclic or not
		testCyclicA();
		
		// Test whether cyclic or not
		testCyclicB();


		// Test Topological Sort
		testTopologicalSort();

	}

}