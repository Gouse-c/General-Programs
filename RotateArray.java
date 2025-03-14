import java.util.Arrays;

class RotateArray {
    public static void rotateRight(int arr[], int k) {
        int n = arr.length;
        k = k % n; 
        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            temp[(i + k) % n] = arr[i];
        }

        System.arraycopy(temp, 0, arr, 0, n);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        System.out.println("Original Array: " + Arrays.toString(arr));
        rotateRight(arr, k);
        System.out.println("Rotated Array: " + Arrays.toString(arr));
    }
}


