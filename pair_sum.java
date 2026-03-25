public class pair_sum {
    public static void tar_pair(int arr[], int target){
        int first = 0;
        int last = arr.length - 1;

        while(first < last){
            int sum = arr[first] + arr[last];

            if(sum > target){
                last--;
            } 
            else if(sum < target){
                first++;
            } 
            else{
                System.out.println("Pair found at index: " + first + " " + last);
                return;
            }
        }

        System.out.println("No pair found");
    }

    public static void main(String args[]){
        int arr[] = {2,3,4,6,7,8}; // sorted array required
        tar_pair(arr, 9);
    }
}