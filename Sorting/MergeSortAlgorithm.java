import java.util.Arrays;
public class MergeSortAlgorithm
{

    //Main function that sorts an array using merge sort
    public static void mergeSort(int[] array)
    {
        if(array.length < 2)
        {
            return;   //Already sorted  
        }

        int mid = array.length/2;
        int[] left = Arrays.copyOfRange(array,0,mid);
        int[] right = Arrays.copyOfRange(array,mid,array.length);

        mergeSort(left); //Recursively sort left half
        mergeSort(right); //Recursively sort right half

        merge(array,left,right); //Merge the sorted halves
    }

    //Merges two sorted subarrays into a single sorted array
    private static void merge(int[] array,int[] left,int[] right)
    {
        int i=0, j=0, k=0;

        //Compare and merge elements from left and right arrays
        while(i<left.length && j<right.length)
        {
            if(left[i]<=right[j])
            {
                array[k++] = left[i++];
            }
            else
            {
                array[k++] = right[j++];
            }
        }

        //Copy any remaining elements from the left array
        while(i<left.length)
        {
            array[k++] = left[i++];
        }
        
        //Copy any remaining elements from the right array
        while (j<right.length)
        {
            array[k++] = right[j++];
        }

    }

    //Main method to test merge sort implementation
    public static void main(String[] args)
    {
        int[] array = {38,27,43,3,9,82,10};
        System.out.println("Original Array: "+Arrays.toString(array));

        mergeSort(array); //Sort the array using merge sort

        System.out.println("Sorted Array: "+Arrays.toString(array));

    }
}