/*
	Given an array A and an integer B, find the number of occurrences of B in A.

	Input 1: A = [1, 2, 2], B = 2
	Output1: 2

	Input 1: A = [1, 2, 1], B = 3 
	Output1: 0

	#############################
	Time Complexity - O(N)
	Space Complexity - O(1)
	#############################
*/

package arrays;

public class LinearSearch {
	public static int solve(int[] A, int B) {
		int count = 0;
		for(int element : A){
			if(element == B) count++;
		}
		return count;
    }
}