import java.util.Arrays;

public class NaivePartition
{
    public static void naivePartition(int[] arr,int low,int high,int pivotIndex)
    {
        int pivot = arr[pivotIndex]; //Get the pivot element
        int[] temp = new int[high-low+1]; //Temporary array to store partitioned elements
        int index = 0;

        //Move all elements smaller than or equal to pivot to temp array
        for(int i=0;i<=high;i++)
        {
            if(arr[i]<=pivot)
            {
                temp[index++] = arr[i];
            }
        }

        //Move all elements greater than the pivot to temp array
        for(int i=0;i<=high;i++)
        {
            if(arr[i]>pivot)
            {
                temp[index++] = arr[i];
            }
        }

        //Copy the elements back to the original array
        for(int i=low;i<=high;i++)
        {
            arr[i] = temp[i-low];
        }

    }

    public static void main(String[] args) 
    {
        int[] arr = {10,80,30,90,40,50,70};
        int pivotIndex = 5; //Let's choose 50 as the pivot

        System.out.println("Original Array: " + Arrays.toString(arr));
        naivePartition(arr, 0, arr.length-1, pivotIndex);
        System.out.println("Arrays after Naive Partition: " + Arrays.toString(arr));
    }
}