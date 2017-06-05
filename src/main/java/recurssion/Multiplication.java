package recurssion;

/**
 * Created by Justin on 30/05/2017.
 */
public class Multiplication {

    public int product(int a, int b){
        int bigger = a>b ? a:b;
        int smaller =a <b ? a:b;
        int[] memo = new int[smaller + 1];
        return productHelper(smaller,bigger,memo);

    }

    private int productHelper(int smaller, int bigger,int[] memo) {
        if(smaller == 0){
            return 0;
        }
        else if(smaller == 1){
            return  bigger;
        }
        else if(memo[smaller]> 0){
            return memo[smaller];
        }
        int s = smaller >> 1; // divide by 2
        int side1 = productHelper(s,bigger,memo);
        int side2 = side1;
        if(smaller %2 ==1){
            side2 = productHelper(smaller-s, bigger,memo);
        }
        memo[smaller] = side1 + side2;
        return memo[smaller];
    }

}
