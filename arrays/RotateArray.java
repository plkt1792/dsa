/*
	Given an integer array A of size N and an integer B,
	you have to return the same array after rotating it B times towards the RIGHT.

	Input 1: A = [1, 2, 3, 4], B = 2
	Output 1: [3, 4, 1, 2]

	Input 2: A = [2, 5, 6], B = 1
	Output 2: [6, 2, 5]

	#############################
	Time Complexity - O(N)
	Space Complexity - O(1)
	#############################
*/

package arrays;	

import java.util.ArrayList;

public class RotateArray {
	public static ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
		int N = A.size();
        B = B % N; //For B >= N
        reverseInRange(A, 0, N - 1);
        reverseInRange(A, 0, B - 1);
        reverseInRange(A, B, N - 1);
        return A;
	}

	private static void reverseInRange(ArrayList<Integer> A, int i, int j){
        int temp;
        while(i < j){
            temp = A.get(i);
            A.set(i, A.get(j));
            A.set(j, temp);
            i++;
            j--;
        }
    }
}