package prims;

import prims.Prims;

/*
	This class tests class Prims (Minimum Spanning Tree Algorithm)
*/

class TestPrims{

	// Tests MST and prints MST edges

	public static void testMST1(){

		int N = 9;		// No. of Vertices
		int M = 14;		// No. of Edges

		int[][] edges = {	{1,2,4}, 	// Edges
							{1,8,8},
							{2,8,11},
							{2,3,8},
							{3,4,7},
							{3,9,2},
							{3,6,4},
							{4,6,14},
							{4,5,9},
							{5,6,10},
							{6,7,2},
							{7,8,1},
							{7,9,6},
							{8,9,7}
						  }; 

		Prims prims = new Prims(N, M, edges);
		prims.findMST();
		System.out.println("MST Edges are: ");	
		prims.printMSTEdges();		  
	}

	public static void main(String args[]){

		// Call testMST1
		testMST1();
	}
}