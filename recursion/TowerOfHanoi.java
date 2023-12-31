/*
	In the classic problem of the Towers of Hanoi, you have 3 towers numbered from 1 to 3 (left to right) and A disks numbered from 1 to A (top to bottom) of different sizes which can slide onto any tower.
	The puzzle starts with disks sorted in ascending order of size from top to bottom (i.e., each disk sits on top of an even larger one).
	You have the following constraints:

	Only one disk can be moved at a time.
	A disk is slid off the top of one tower onto another tower.
	A disk cannot be placed on top of a smaller disk.
	You have to find the solution to the Tower of Hanoi problem.
	You have to return a 2D array of dimensions M x 3, where M is the minimum number of moves needed to solve the problem.
	In each row, there should be 3 integers (disk, start, end), where:

	disk - number of the disk being moved
	start - number of the tower from which the disk is being moved
	end - number of the tower to which the disk is being moved

	Input 1: A = 2
	Output1: [1 1 2 ] [2 1 3 ] [1 2 3 ]

	Input 1: A = 3
	Output1: [1 1 3 ] [2 1 2 ] [1 3 2 ] [3 1 3 ] [1 2 1 ] [2 2 3 ] [1 1 3 ] 

	#############################
	Time Complexity - O(2^N)
	Space Complexity - O(N) (Call stack space)
	#############################
*/
package recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class TowerOfHanoi {
	public static ArrayList<ArrayList<Integer>> solve(int A){
		ArrayList<ArrayList<Integer>> listOfMoves = new ArrayList<ArrayList<Integer>>();

		//Solution for 3 pegs in tower of hanoi
		toh3(A, 1, 2, 3, listOfMoves);

		//Solution for 4 pegs in tower of hanoi
		// toh4(A, 1, 2, 3, 4, listOfMoves);

		//Solution for 5 pegs in tower of hanoi
		// toh5(A, 1, 2, 3, 4, 5, listOfMoves);
		return listOfMoves;
	}

	static void toh3(int A, int src, int aux, int dest, ArrayList<ArrayList<Integer>> listOfMoves) {
		if(A == 0) return;
		toh3(A - 1, src, dest, aux, listOfMoves);
		listOfMoves.add(new ArrayList<Integer>(Arrays.asList(A, src, dest)));
		toh3(A - 1, aux, src, dest, listOfMoves);
	}

	static void toh4(int A, int src, int aux1, int aux2, int dest, ArrayList<ArrayList<Integer>> listOfMoves){
		if(A == 0) return;
		if(A == 1) {
			listOfMoves.add(new ArrayList<Integer>(Arrays.asList(A, src, dest)));
			return;
		}
		toh4(A - 2, src, dest, aux2, aux1, listOfMoves);
		listOfMoves.add(new ArrayList<Integer>(Arrays.asList(A - 1, src, aux2)));	
		listOfMoves.add(new ArrayList<Integer>(Arrays.asList(A, src, dest)));
		listOfMoves.add(new ArrayList<Integer>(Arrays.asList(A - 1, aux2, dest)));
		toh4(A - 2, aux1, src, aux2, dest, listOfMoves);		
	}

	static void toh5(int A, int src, int aux1, int aux2, int aux3, int dest, ArrayList<ArrayList<Integer>> listOfMoves){
		if(A == 0) return;
		if(A == 1) {
			listOfMoves.add(new ArrayList<Integer>(Arrays.asList(A, src, dest)));
			return;
		}
		if (A == 2) {
			listOfMoves.add(new ArrayList<Integer>(Arrays.asList(A - 1, src, aux3)));	
			listOfMoves.add(new ArrayList<Integer>(Arrays.asList(A, src, dest)));
			listOfMoves.add(new ArrayList<Integer>(Arrays.asList(A - 1, aux3, dest)));
			return;
		}
		toh5(A - 3, src, dest, aux2, aux3, aux1, listOfMoves);
		listOfMoves.add(new ArrayList<Integer>(Arrays.asList(A - 2, src, aux2)));
		listOfMoves.add(new ArrayList<Integer>(Arrays.asList(A - 1, src, aux3)));	
		listOfMoves.add(new ArrayList<Integer>(Arrays.asList(A, src, dest)));
		listOfMoves.add(new ArrayList<Integer>(Arrays.asList(A - 1, aux3, dest)));
		listOfMoves.add(new ArrayList<Integer>(Arrays.asList(A - 2, aux2, dest)));
		toh5(A - 3, aux1, src, aux2, aux3, dest, listOfMoves);	
	}
}