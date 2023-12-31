/*
	Given an array, arr[] of size N, the task is to find the count of array indices 
	such that removing an element from these indices makes the sum of 
	even-indexed and odd-indexed array elements equal.
   Constraint: Sum of all elements of A <= 10^9

	Input 1: A = [2, 1, 6, 4]
	Output1: 1

	Input 1: A = [1, 1, 1]
	Output1: 3

	#############################
	Time Complexity - O(N)
	Space Complexity - O(1)
	#############################
*/

package prefix_sum;

public class SpecialIndex {

   public static int solve(int[] A){
    	int N = A.length;
    	int evenSum = 0, oddSum = 0;
    	for(int i = 0; i < N; i++) {
    		if((i & 1) == 0) evenSum += A[i];
    		else oddSum += A[i];
    	}

    	int count = 0;
    	if(oddSum == evenSum - A[0]) count++; //Handling for i = 0

    	int currEvenSum = A[0], currOddSum = 0;
    	int newEvenSum, newOddSum;
    	for(int i = 1; i < N; i++) {
    		if ((i&1) == 0) {
    			currEvenSum += A[i];
    			newEvenSum = currOddSum + evenSum - currEvenSum;
    			newOddSum = currEvenSum - A[i] + oddSum - currOddSum;
    		} else {
    			currOddSum += A[i];
    			newEvenSum = currEvenSum + oddSum - currOddSum;
    			newOddSum = currOddSum - A[i] + evenSum - currEvenSum;
    		}
    		if(newOddSum == newEvenSum) count++;
    	}
    	return count;
    }


/* 
   WITH PREFIX SUM ARRAY 
   ########################
   Time Complexity - O(N)
   Space Complexity - O(1)
   ########################

   public static int solve(int[] A) {
      int N = A.length;
      int[] pEvenSum = new int[N];
      int[] pOddSum = new int[N];
      pEvenSum[0] = A[0];
      pOddSum[0] = 0;
      for(int i = 1; i < N; i++){
         if((i & 1) == 0){ //if i is even
            pEvenSum[i] = pEvenSum[i - 1] + A[i];
             pOddSum[i] = pOddSum[i - 1];
         } else {
            pEvenSum[i] = pEvenSum[i - 1];
             pOddSum[i] = pOddSum[i - 1] + A[i];
         }
      }

      // For i=0
      int oddSum =  pEvenSum[N - 1] - pEvenSum[0];
      int evenSum = pOddSum[N - 1] - pOddSum[0];
      if(oddSum == evenSum) count++;

      // For i in [1, N-1]
      for(int i = 1; i < N; i++) {
         oddSum = pOddSum[i - 1] + pEvenSum[N - 1] - pEvenSum[i];
         evenSum = pEvenSum[i - 1] + pOddSum[N - 1] - pOddSum[i];
         if(oddSum == evenSum) count++;
      }
      return count;
   }
*/

}