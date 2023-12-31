/*
	You are given an array A of integers of size N.
	Your task is to find the equilibrium index of the given array
	The equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes.
	If there are no elements that are at lower indexes or at higher indexes, then the corresponding sum of elements is considered as 0.

	Note:
	Array indexing starts from 0.
	If there is no equilibrium index then return -1.
	If there are more than one equilibrium indexes then return the minimum index.

	Input 1: A = [-7, 1, 5, 2, -4, 3, 0]
	Output1: 3

	Input 1: A = [1, 2, 3]
	Output1: -1

	#############################
	Time Complexity - O(N)
	Space Complexity - O(N)
	#############################
*/

package prefix_sum;

public class EquilibriumIndex{
	public static int solve(int[] A){
		int N = A.length;
		int[] prefSum = new int[N];
		prefSum[0] = A[0];
		for(int i = 1; i < N; i++){
			prefSum[i] = A[i] + prefSum[i - 1];
		}

		//Handling for index = 0
		if(prefSum[N - 1] - A[0] == 0) return 0;

		for(int i = 1; i < N; i++){
			if(prefSum[N - 1] - prefSum[i] == prefSum[i - 1]) return i;
		}

		return -1;
	}
}