public class prefixsumSubarray {
    public static void prefix_sum(int arr[]) {
        int prefixSum[] = new int[arr.length];

        prefixSum[0] = arr[0];
        // prefix sum
        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            currsum = 0;
            for (int j = i; j < arr.length; j++) {
                currsum = i == 0 ? prefixSum[j] : prefixSum[j] - prefixSum[i - 1];
                maxsum = Math.max(maxsum, currsum);

            }
        }
        System.out.println("maxsum is: " + maxsum);
    }

    public static void main(String args[]) {
        int arr[] = { -5, -1, 3, 6, -5 };
        prefix_sum(arr);
    }
}
