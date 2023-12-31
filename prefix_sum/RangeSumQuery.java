/*
	You are given an integer array A of length N.
   You are also given a 2D integer array B with dimensions M x 2, where each row denotes a [L, R] query.
   For each query, you have to find the sum of all elements from L to R indices in A (0 - indexed).
   More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each query.

	Input 1: A = [1, 2, 3, 4, 5], B = [[0, 3], [1, 2]]
	Output1: [10, 5]

	Input 1: A = [2, 2, 2], B = [[0, 0], [1, 2]]
	Output1: [2, 4]

	#############################
	Time Complexity - O(N)
	Space Complexity - O(N)
	#############################
*/

package prefix_sum;

import java.util.ArrayList;

public class RangeSumQuery {
   public static ArrayList<Long> solve(int[] A, int[][] B){
    	long[] prefSum = new long[A.length];
    	prefSum[0] = A[0];
    	for(int i = 1; i < A.length; i++) {
    		prefSum[i] = A[i] + prefSum[i - 1];
    	}

    	ArrayList<Long> solution = new ArrayList<Long>(B.length);      
      for(int i = 0; i < B.length; i++) {
      	int L = B[i][0], R = B[i][1];
      	long ans = prefSum[R] - (L > 0 ? prefSum[L - 1] : 0);
      	solution.add(ans);
      }
      return solution;
    }
}