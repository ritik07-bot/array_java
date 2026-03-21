import java.util.*;
public class kadanesAlgo {
    public static void kadane(int arr[]){
       int maxsum=Integer.MIN_VALUE;
       int currsum=0;
       for(int i=0;i<arr.length;i++){
        if((arr[i]+currsum) >0){
            currsum+=arr[i];
        }else{
            currsum=0;
        }
        maxsum=Math.max(maxsum, currsum);
       }System.out.println("Maxsum is :"+maxsum);
    }
    public static void main(String args[]){
        int arr[]={-2,-3,-4,7,-9,9,-4,3};
        kadane(arr);
    }
}
