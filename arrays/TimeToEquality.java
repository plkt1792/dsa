/*
	Given an integer array A of size N.
	In one second, you can increase the value of one element by 1.
	Find the minimum time in seconds to make all elements of the array equal.

	Input 1: A = [2, 4, 1, 3, 2]
	Output 1: 8

	#############################
	Time Complexity - O(N)
	Space Complexity - O(1)
	#############################
*/

package arrays;	

public class TimeToEquality {
	public static int solve(int[] A) {
        int max = A[0];
        int time = 0;
        for(int i = 1; i < A.length; i++){
            if(A[i] > max) {
                time += (A[i] - max) * i;
                max = A[i];
            } else if(A[i] < max) {
                time += (max - A[i]);
            }
        }
        return time;
    }
}