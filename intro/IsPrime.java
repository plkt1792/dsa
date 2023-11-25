/*	
	Given a number A. Return 1 if A is prime and return 0 if not. 
	Note : The value of A can cross the range of Integer.

	Input 1: 5
	Output 1: 1

	Input 2: 10
	Output 2: 0

	#############################
	Time Complexity - O(sqrt(N))
	Space Complexity - O(1)
	#############################
*/

package intro;

public class IsPrime{
	public static int solve(long A) {
        if (A == 1) return 0;
        for(long i = 2; i * i <= A; i++) {
            if(A % i == 0) return 0;
        }
        return 1;
    }
}