import java.util.Arrays;

public class majority_element {
    public static void maj_ele(int arr[]){
       Arrays.sort(arr);
       int freq=1;
       for(int i=1;i<arr.length;i++){
        if(arr[i]==arr[i-1]){
            freq++;
        }else{
            freq=1;
        }
        if(freq>arr.length/2){
            System.out.println(arr[i]);
            return;
        }
       }System.out.println("no mojority element");
    }
    public static void main(String args[]){
        int arr[]={2,3,4,2,3,2,2};
        maj_ele(arr);
    }
}
