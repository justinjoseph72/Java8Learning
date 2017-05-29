package recurssion;

/**
 * Created by Justin on 16/05/2017.
 */
public class Fibonacci {

    public int getFibonacciNumber(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        return getFibonacciNumber(n-1) +getFibonacciNumber(n-2);
    }

    public int getFibonocciUsingMemoization(int n){
        return getFibonacci(n,new int[n+1]);
    }

    private int getFibonacci(int i, int []memo){
        if(i ==0 || i==1) return 1;
        if(memo[i]==0){
            memo[i] = getFibonacci(i-1,memo) + getFibonacci(i-2,memo);
        }
        return memo[i];
    }

    public int getFibonacciUsingBottomUpDynamicApproach(int n){
        if(n==0 ) return 0;
        int a =0;
        int b =1;
        for(int i =2;i<n;i++){
            int c = a+b;
            a=b;
            b= c;
        }
        return a+b;
    }
}
