/*
	Given an array A of size N. 
	You need to find the sum of Maximum and Minimum element in the given array.
	Return the sum of maximum and minimum element of the array

	Input 1: A = [-2, 1, -4, 5, 3]
	Output 1: 1

	Input 2: A = [1, 3, 4, 1]
	Output 2: 5

	#############################
	Time Complexity - O(N)
	Space Complexity - O(1)
	#############################
*/

package arrays;	

public class ArrayMaxMin {
	public static int solve(int[] A) {
		int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int element : A){
            max = Math.max(element, max);
            min = Math.min(element, min);
        }
        return (min + max);
	}
}