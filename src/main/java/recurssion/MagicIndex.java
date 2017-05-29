package recurssion;

/**
 * Created by Justin on 29/05/2017.
 */
public class MagicIndex {

    public int getMagicIndex(int[] array){
        return getMagicIndexFast(array,0,array.length-1);
    }

    private int getMagicIndexFast(int[] array, int start, int end) {
        if(start>end){
            return -1;
        }
        int mid = (start +end)/2;
        if(array[mid] == mid){
            return mid;
        }
        if(array[mid] < mid){
           return getMagicIndexFast(array,mid+1,end);
        }
        else{
            return  getMagicIndexFast(array,start,mid-1);
        }
    }
}
