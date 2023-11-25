/*
	You are given an integer array A.
	You have to find the second largest element/value in the array or report that no such element exists.
	If no such element exist then return -1.

	Input 1: A = [2, 1, 2]
	Output 1: 2

	Input 2: A = [2]
	Output 2: -1

	#############################
	Time Complexity - O(N)
	Space Complexity - O(1)
	#############################
*/

package arrays;

public class SecondLargest {
	public static int solve(int[] A) {
        int max1 = A[0];
        int max2 = -1;
        for(int i = 1; i < A.length; i++){
            if(A[i] > max1){
                max2 = max1;
                max1 = A[i];
            } else if(A[i] > max2 && A[i] < max1) {
                max2 = A[i];
            }
        }
        return max2;
    }
}