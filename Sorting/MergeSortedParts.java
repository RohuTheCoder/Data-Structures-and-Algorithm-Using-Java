import java.util.Arrays;
public class MergeSortedParts
{
	public static void main(String[] args)
	{
		int[] array = {1, 3, 5, 2, 4, 6};
		int lower = 0;
		int middle = 2;
		int higher = 5;

		merge(array, lower, middle, higher);

		System.out.println("Merged Array: "+ Arrays.toString(array));

	}


	public static void merge(int[] array, int lower, int middle, int higher)
	{
		int n1 = middle - lower + 1;
		int n2 = higher - middle;


		//Create temporary arrays
		int[] left = new int[n1];
		int[] right = new int[n2];


		//Copy data to temporary arrays
		for(int i = 0; i < n1; i++)
			left[i] = array[lower + i];
		for(int j = 0; j < n2; j++)
			right[j] = array[middle + 1 + j];


		//Merge the temporary arrays

		//Initial indexes of first and second subarrays
		int i=0, j=0;

		//Initial index of merged subarray array
		int k = lower;
		while(i < n1 && j < n2)
		{
			if(left[i] <= right[j])
			{
				array[k] = left[i];
				i++;
			}
			else
			{
				array[k] = right[j];
				j++;
			}
			k++;
		}

		//Copy the remaining elements of left[], if any
		while(i<n1)
		{
			array[k] = left[i];
			i++;
			k++;
		}

		//Copy the remaining elements of right[], if any
		while(j<n2)
		{
			array[k] = right[j];
			j++;
			k++;
		}
	}
}