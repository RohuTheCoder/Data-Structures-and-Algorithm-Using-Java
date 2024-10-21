public class EfficientSolutionCountInversions {
    // Function to count the number of inversions in the array.
    public static int countInv(int arr[], int l, int r) {
        int res = 0;
        if (l < r) {
            int m = l + (r - l) / 2;
            // Recursively count inversions in left and right halves.
            res += countInv(arr, l, m);
            res += countInv(arr, m + 1, r);
            // Count inversions during the merge process.
            res += countAndMerge(arr, l, m, r);
        }
        return res;
    }

    // Function to count inversions and merge two sorted halves.
    public static int countAndMerge(int arr[], int l, int m, int r) {
        int n1 = m - l + 1, n2 = r - m;
        int left[] = new int[n1];
        int right[] = new int[n2];

        // Copy data to temporary arrays left[] and right[].
        for (int i = 0; i < n1; i++) {
            left[i] = arr[l + i];
        }
        for (int i = 0; i < n2; i++) {
            right[i] = arr[m + 1 + i];
        }

        int res = 0, i = 0, j = 0, k = l;

        // Merge the two halves and count inversions.
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
                res += (n1 - i);  // Count inversions.
            }
            k++;
        }

        // Copy remaining elements of left[], if any.
        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }

        // Copy remaining elements of right[], if any.
        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {2, 5, 8, 11, 3, 6, 9, 13};
        int result = countInv(arr, 0, arr.length - 1); 
        System.out.println("Number of Inversions: " + result);  
    }
}
