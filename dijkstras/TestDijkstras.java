package dijkstras;

import dijkstras.Dijkstras;		// My implementation of Dijkstras algorithm in package dijkstras

/*
	This class test Dijkstras shortest path algorithm
*/

class TestDijkstras
{


	// Test A

	public static void testA(){

		int N = 7;		// No. of vertices
		int M = 12;		// No. of edges
		int edges[][] = {	{1,2,10}, 		// Edges
							{2,3,1},
							{3,4,4},
							{4,3,6},
							{5,4,2},
							{1,5,5},
							{2,5,2},
							{5,2,3},
							{5,3,9},
							{4,1,7},
							{6,7,5},
							{7,6,6}
						};

		int s = 1;		// source vertex			 	

		Dijkstras dk = new Dijkstras(N, M, edges, s);				

		dk.findShortestPaths();

		System.out.println("Shortest Distances: ");
		dk.showDist();

		System.out.println("Shortest Paths: ");
		for(int i=1;i<=N;i++){
			
			System.out.print(i+ ": ");
			dk.printPath(i);
			System.out.println();
		}

	}	



	public static void main(String args[]){

			// Call testA() 

			testA();
	}
}	