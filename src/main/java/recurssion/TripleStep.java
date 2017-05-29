package recurssion;

import java.util.Arrays;

/**
 * Created by Justin on 22/05/2017.
 */
public class TripleStep {

    public int countWays(int n){
        int[] memo = new int[n+1];
        Arrays.fill(memo,-1);;
        return countWays(n,memo);
    }

    private int countWays(int n, int[] memo) {
        if(n< 0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        if(memo[n]>-1){
            return memo[n];
        }
        else{
            memo[n] = countWays(n-1,memo)+countWays(n-2,memo)+countWays(n-3,memo);
            System.out.printf("The value of n is %d and memo[n] is %d", n,memo[n]);
            System.out.println();
            return  memo[n];
        }
    }
}
