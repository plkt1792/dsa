/*
	Given an array A and an integer B. 
	A pair(i, j) in the array is a good pair if i != j and (A[i] + A[j] == B). 
	Check if any good pair exist or not.
	
	Input 1: A = [1,2,3,4] B = 7
	Output 1: 1, Explanation  (A[i], A[j]) = (3,4)

	Input 2: A = [1,2,4] B = 4
	Output 2: 0

	#############################
	Time Complexity - O(N)
	Space Complexity - O(N)
	#############################
*/

package arrays;

import java.util.HashSet;

public class GoodPair {
	public static int solve(int[] A, int B) {
		HashSet<Integer> set = new HashSet<>();
        for(int element : A){
            if(set.contains(B - element)) return 1;
            set.add(element);
        }
        return 0;
	}
}