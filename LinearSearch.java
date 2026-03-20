public class LinearSearch {

    public static int linearSearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;  // important if key not found
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        int key = 10;

        int res = linearSearch(numbers, key);

        if (res == -1) {
            System.out.println("Key not found");
        } else {
            System.out.println("The index of the key is " + res);
        }
    }
}