/*
	Given an array A of N integers and also given two integers B and C.
	Reverse the elements of the array A within the given inclusive range [B, C].

	Input 1: A = [1, 2, 3, 4], B = 2, C = 3
	Output1: [1, 2, 4, 3]

	Input 1: A = [2, 5, 6], B = 0, C = 2
	Output1: [6, 5, 2]

	#############################
	Time Complexity - O(N)
	Space Complexity - O(1)
	#############################
*/

package arrays;

import java.util.ArrayList;

public class ReverseInRange {
	public static ArrayList<Integer> solve(ArrayList<Integer> A, int B, int C) {
        int temp;
        while(B < C) {
            temp = A.get(B);
            A.set(B, A.get(C));
            A.set(C, temp);
            B++;
            C--;
        }
        return A;
    }
}