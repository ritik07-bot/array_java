public class BinarySearch {
    public static int binary_Search(int arr[],int key){
        int start=0;
        int end=arr.length -1;

        while(start<=end){
           int mid=(start+end)/2;
           if(arr[mid]>key){
            end=mid-1;
           }else if(arr[mid]<key){
            start=mid+1;
           }else{
            return mid;
           }
        }return -1;
    }
    public static void main(String args[]){
        int arr[]={2,4,6,8,10};
        int key=6;
        int res=binary_Search(arr,key);
        System.out.println("The index of key is :" +res);
    }
}
