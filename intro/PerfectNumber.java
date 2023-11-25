/*	
	You are given an integer A. You have to tell whether it is a perfect number or not.
	Perfect number is a positive integer which is equal to the sum of its proper positive divisors.
	A proper divisor of a natural number is the divisor that is strictly less than the number.

	Input 1: 4
	Output 1: 0, Explanation: 1 + 2 = 3

	Input 2: 6
	Output 2: 1, Explanation: 1 + 2 + 3 = 6

	#############################
	Time Complexity - O(sqrt(N))
	Space Complexity - O(1)
	#############################
*/

package intro;

public class PerfectNumber{

	public static int solve(int A) {
		if(A == 1) return 0;
        int sum = 1;
        for(int i = 2; i * i <= A; i++){
            if(A % i == 0) {
            	sum += i;
                if(i != A/i) sum += A/i;
            }
            if(sum > A) return 0;
        }
        if(sum == A) return 1;
        return 0;
    }
	
}