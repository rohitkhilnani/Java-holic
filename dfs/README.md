# Depth First Search

This class implements Depth First Search algorithm using adjacency list representation of graph.

Methods / Operations implemented: 

	public void traverse() - Traverses graph in Depth First Fashion

	public void printPath(int u) - Prints path to each vertex from source vertex s

	public boolean isCyclic() - Returns true if the graph is cyclic, false otherwise

	public void topologicalSort() - Prints Topological sorted order of vertices, if graph is acyclic

		Used inner class comparator to perform sort: 

			protected class toplogicalComp implements Comparator<Vertex>