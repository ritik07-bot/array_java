import java.util.*;

public class majority_element {
    public static void maj_ele(int arr[]){
    //    Arrays.sort(arr);
    //    int freq=1;
    //    for(int i=1;i<arr.length;i++){
    //     if(arr[i]==arr[i-1]){
    //         freq++;
    //     }else{
    //         freq=1;
    //     }
    //     if(freq>arr.length/2){
    //         System.out.println(arr[i]);
    //         return;
    //     }
    //    }System.out.println("no mojority element");
        int freq=0;
        int ans=0;
        for(int i=0;i<arr.length;i++){
           if(freq==0){
            ans=arr[i];
           }
           if(arr[i]==ans){
             freq++;
           }else{
            freq--;
           }
        }System.out.println(ans);
    }
    public static void main(String args[]){
        int arr[]={2,3,4,3,3,2,3};
        maj_ele(arr);
    }
}
