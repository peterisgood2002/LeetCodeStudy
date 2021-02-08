package com.peter12.solution.medium;

public class MEDIUM_0096_UNIQUE_BINARY_SEARCH_TREES {
	public static int numTrees(int n) {

		/*
		 * ======|  Number of Node     |========    	|
		 *   n   | Left | Root | Right  == Total		|
		 *   1   |   0  |   1  |   0    ==   1          |   1
		 *-----------------------------------------------------
		 *   2   |   1  |   1  |   0    ==   1          |   2
		 *       |   0  |   1  |   1    ==   1          |
		 * ----------------------------------------------------     
		 *   3   |   2  |   1  |   0    ==   2          |
		 *       |   1  |   1  |   1    ==   1 * 1 = 1  |   5
		 *       |   0  |   1  |   2    ==   2          |
		 * ----------------------------------------------------
		 *   4   |   3  |   1  |   0    ==   5          |
		 *       |   2  |   1  |   1    ==   2 * 1      |  14
		         |   1  |   1  |   2    ==   1 * 2      |
		         |   0  |   1  |   3    ==   5          |
		  ------------------------------------------------------
		     5   |   4  |   1  |   0    ==  14          |  42
		         |   3  |   1  |   1    ==  5 * 1       |
		         |   2  |   1  |   2    ==  2 * 2       |
		         |   1  |   1  |   3    ==  1 * 5       |
		         |   0  |   1  |   4    ==  14
		  -----------------------------------------------------
		  
				  
		 * */
		int[] result = new int[n + 1];
		result[0] = 1; 
		
		for( int i = 1; i <= n; i++ ) {
			
			for( int j = i - 1; j >= 0; j--) {
				result[i] += result[j] * result[i - 1 - j];
			}
		}
		
		return result[ result.length - 1];
		
		
	}
	

	
}
