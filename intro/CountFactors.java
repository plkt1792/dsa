/*
	Given an integer A, you need to find the count of it's factors.
	Factor of a number is the number which divides it perfectly leaving no remainder.
	Example : 1, 2, 3, 6 are factors of 6

	Input1: 5
	Output1: 1

	Input1: 10
	Output1: 4

	#############################
	Time Complexity - O(sqrt(N))
	Space Complexity - O(1)
	#############################
*/

package intro;

public class CountFactors{
	public static int solve(int A){
		int count = 0;
        for(int i = 1; i * i <= A; i++) {
            if(A % i == 0){
                if(i * i == A) count++;
                else count += 2;
            }
        }
        return count;
	}
}