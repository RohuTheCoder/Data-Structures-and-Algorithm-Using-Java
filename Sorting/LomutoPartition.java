import java.util.Arrays;

public class LomutoPartition 
{
     // Lomuto partition function
     public static int lomutoPartition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choose the last element as the pivot
        int i = low - 1; // Index of the smaller element

        // Traverse the array and rearrange elements
        for (int j = low; j <= high - 1; j++) {
            // If current element is smaller or equal to pivot
            if (arr[j] <= pivot) {
                i++; // Increment the index of the smaller element
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap the pivot element with the element at i+1 to place the pivot in its correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        // Return the index of the pivot element after partition
        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 80, 30, 90, 40, 50, 70};
        
        System.out.println("Original Array: " + Arrays.toString(arr));
        int pivotIndex = lomutoPartition(arr, 0, arr.length - 1);
        System.out.println("Array after Lomuto Partition: " + Arrays.toString(arr));
        System.out.println("Pivot Index: " + pivotIndex);
    }
}
