/*
	Given an array A of N integers. 
	Count the number of elements that have at least 1 elements greater than itself.

	Input 1: A = [3, 1, 2]
	Output1: 2

	Input 1: A = [5, 5, 3]
	Output1: 1

	#############################
	Time Complexity - O(N)
	Space Complexity - O(1)
	#############################
*/

package arrays;

public class CountOfElements {
	public static int solve(int[] A) {
        int max = A[0];
        int maxCount = 1;
        for(int i = 1; i < A.length; i++) {
        	if(A[i] > max){
        		max = A[i];
        		maxCount = 1;
        	} else if(A[i] == max){
        		maxCount++;
        	}
        }
        return A.length - maxCount;
    }
}