import java.util.*;

public class reverseArray {
    public static void reverseArr(int arr[]){
        int first=0;
        int last=arr.length-1;

        while(first<=last){
          int swap=arr[first];
          arr[first]=arr[last];
          arr[last]=swap;
          first++;
          last--;
        }
    }
    public static void main(String args[]){
        int arr[]={2,3,4,6,8};
        reverseArr(arr);
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
