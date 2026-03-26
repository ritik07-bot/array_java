import java.util.*;
public class single_num {
    public static void sin_num(int nums[]){
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        int freq=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                freq++;
            }else{
               if(freq==1){
               System.out.println(nums[i]);
               return;
            }freq=1;
            }
        }System.out.println("No any single number");
    }
    public static void main(String args[]){
        int nums[]={2,2,1,1,3,3,5};
        sin_num(nums);
    }
}
