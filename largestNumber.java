public class largestNumber {
    public static int largestNum(int arr[]){
        int largest=Integer.MIN_VALUE;

    for(int i=0;i<arr.length;i++){
        if(arr[i]>largest){
            largest=arr[i];
        }
    }return largest;
    }
    public static void main(String args[]){
       int arr[]={1,2,4,8,5};
       int res= largestNum(arr);
       System.out.println("largest num in arr is "+ res);
    }
}
