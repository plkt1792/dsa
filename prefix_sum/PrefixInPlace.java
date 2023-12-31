/*
	Given an array A of N integers. Construct prefix sum of the array in the given array itself.

	Input 1: A = [1, 2, 3, 4, 5]
	Output1: [1, 3, 6, 10, 15]

	Input 1: A = [4, 3, 2]
	Output1: [4, 7, 9]

	#############################
	Time Complexity - O(N)
	Space Complexity - O(1)
	#############################
*/

package prefix_sum;

public class PrefixInPlace{
	public static int[] solve(int[] A) {
		for(int i = 1; i < A.length; i++)
			A[i] += A[i-1];
		return A;
	}
	
}