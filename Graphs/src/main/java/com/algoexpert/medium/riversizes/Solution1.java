package com.algoexpert.medium.riversizes;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {
	
	public static List<Integer> riverSizes(int[][] matrix){
		List<Integer> riverSize=new ArrayList<Integer>();
		
		// Initializing a boolean matrix to keep track of visited nodes
		boolean[][] visitedMatrix=new boolean[matrix.length][matrix[0].length];
		
		// Iterating through Matrix row by row
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[0].length;j++) {
				// If matrix is already visited we are skipping that loop
				if(visitedMatrix[i][j]) {
					continue;
				}
				//If not visited traverse through nodes
				traverseNodes(i,j,matrix,visitedMatrix,riverSize);
			}
		}
		return riverSize;
	}

	private static void traverseNodes(int i, int j, int[][] matrix, boolean[][] visitedMatrix,
			List<Integer> riverSize) {
		//Variable to keep track of river size
		int currentRiverSize=0;
		
		//Declaring a variable to store all the 4 adjacent nodes for a given i,j 
		List<Integer[]> nodesToExplore = new ArrayList<Integer[]>();
		nodesToExplore.add(new Integer[] {i,j});
		
		//These loop will run until nodesToEmplore array is empty
		while(!nodesToExplore.isEmpty()) {
			Integer[] currentNode=nodesToExplore.get(nodesToExplore.size()-1);
			nodesToExplore.remove(nodesToExplore.size() -1);
			i=currentNode[0];
			j=currentNode[1];
			
			//Checking if matrix is visited if not visited then marking that node as true
			if(visitedMatrix[i][j]){
				continue;
			}
			visitedMatrix[i][j]=true;
			// If that index is 0 we are going ahead of loop
			if(matrix[i][j]==0){
				continue;
			}
			
			// if its not visited / 0 we are increasing the river size
			currentRiverSize += 1;
			
			// Geting all the adjacent neighbours
			List<Integer[]> unvisitedNeighbours = getUnvisitedNeighbours(i,j,matrix,visitedMatrix);
			
			//adding it into nodesToExplore
			for (Integer[] neighbour : unvisitedNeighbours) {
				nodesToExplore.add(neighbour);
			}
		}
		//Once the while loop is end we are adding the river count to the array 
		if(currentRiverSize>0) {
			riverSize.add(currentRiverSize);
		}
		
	}

	//Method to get the adjacent boundaries
	private static List<Integer[]> getUnvisitedNeighbours(int i, int j, int[][] matrix, boolean[][] visitedMatrix) {
		List<Integer[]> unvisitedNeighbours=new ArrayList<Integer[]>();
		if(i>0 && !visitedMatrix[i-1][j])
			unvisitedNeighbours.add(new Integer[] {i-1,j});
		if(i<matrix.length-1 && !visitedMatrix[i+1][j])
			unvisitedNeighbours.add(new Integer[] {i+1,j});
		if(j>0 && !visitedMatrix[i][j-1])
			unvisitedNeighbours.add(new Integer[] {i,j-1});
		if(j<matrix[0].length-1 && !visitedMatrix[i][j+1])
			unvisitedNeighbours.add(new Integer[] {i,j+1});
		return unvisitedNeighbours;
	}

}
