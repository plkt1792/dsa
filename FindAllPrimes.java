/*
	Given an integer A. 
	Find the list of all prime numbers in the range [1, A].

	Time Complexity - O(sqrt(N)*log(log(N)))
	Space Complexity - O(N)
*/

import java.util.ArrayList;
import java.util.Arrays;

public class FindAllPrimes{
	public static ArrayList<Integer> solve(int A){
		boolean[] isPrime = new boolean[A+1];
        Arrays.fill(isPrime, true);

        //Creating sieve of prime numbers
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