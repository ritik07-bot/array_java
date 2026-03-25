public class majority_element {
    public static void maj_ele(int arr[]){
        int freq[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    freq[arr[i]]+=1;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(freq[i]+" ");
        }
        int max_freq=0;
        for (int i=0;i<freq.length;i++){
            if(max_freq <freq[i]){
                max_freq=i;
            }
        }System.out.println("Max frquency of array is: "+max_freq);
    }
    public static void main(String args[]){
        int arr[]={2,3,4,2,3,2,2};
        maj_ele(arr);
    }
}
