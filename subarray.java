public class subarray {
    public static void subArray(int arr[]){
        int ts=0;
        int minSum=Integer.MAX_VALUE;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                int sum=0;
                for(int k=start;k<=end;k++){
                    System.out.print(arr[k]+" ");
                    sum+=arr[k];
                }
                ts++;
                if(minSum>sum){
                    minSum=sum;
                }
                if(maxSum<sum){
                    maxSum=sum;
                }
                System.out.println(" sum is:"+sum);
                System.out.println();
            }System.out.println();
        }System.out.println("total subarray :"+ts);
        System.out.println("maxSum is: "+maxSum);
        System.out.println("minSum is: "+minSum);
    }
    public static void main(String args[]){
        int arr[]={2,4,6,8,10};
        subArray(arr);
    }
}
