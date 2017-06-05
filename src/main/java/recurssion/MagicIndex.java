package recurssion;

/**
 * Created by Justin on 29/05/2017.
 */
public class MagicIndex {

    /**
     * This method is used to calculate A[i] =i where A[] is a sorted array
     * with all disticnt values
      * @param array
     * @return
     */
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

    /**
     * This will calucalte the magic index when the array is sorted but need not have
     * all distinct values. It will work for distinct values as well.
     * @param array
     * @return
     */
    public int getMagicIndexNonSortedButDisticnt(int[] array){
        return getMagicIndexFastForNonDistinct(array,0, array.length-1);
    }

    private int getMagicIndexFastForNonDistinct(int[] array, int start, int end) {
        if(end<start){
            return -1;
        }
        int midIndex = (start+end)/2;
        int midValue = array[midIndex];
        if(midValue == midIndex){return midIndex;}

        int leftIndex = Math.min(midIndex-1,midValue);
        int left = getMagicIndexFastForNonDistinct(array,start,leftIndex);
        if(left>=0){
            return left;
        }
        int rightIndex = Math.max(midIndex+1,midValue);
        int right = getMagicIndexFastForNonDistinct(array,rightIndex,end);
        return right;

    }
}
