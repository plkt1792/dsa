/*
	Given an integer A. 
	Find the list of all prime numbers in the range [1, A].

    Input 1: 7
    Output 1: [2, 3, 5, 7]

    Input 2: 12
    Output 2: [2, 3, 5, 7, 11]

    ####################################
	Time Complexity - O(N*log(log(N)))
	Space Complexity - O(N)
    ####################################
*/

package intro;

import java.util.ArrayList;
import java.util.Arrays;

public class FindAllPrimes{
	public static ArrayList<Integer> solve(int A){
		boolean[] isPrime = new boolean[A+1];
        Arrays.fill(isPrime, true);

        //Creating SIEVE OF ERATOSTHENES of prime numbers
        for(int i=2; i*i<=A; i++){
            if(isPrime[i]){
                for(int j=i*i; j<=A; j=j+i) 
                	isPrime[j] = false;
            }
        }

        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i=2; i<=A; i++){
            if(isPrime[i]) 
            	result.add(i);
        }

        return result;
	}
	
}