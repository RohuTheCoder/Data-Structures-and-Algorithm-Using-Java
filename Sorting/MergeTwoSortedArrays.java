import java.util.Arrays;
public class MergeTwoSortedArrays
{
	public static void main(String[] args)
	{
		int[] array1 = {1, 3, 5, 7};
		int[] array2 = {2, 4, 6, 8};

		int[] mergedArray = mergeArrays(array1, array2);


		System.out.println("Merged Array: "+Arrays.toString(mergedArray));

	}

	public static int[] mergeArrays(int[] array1,int[] array2)
	{
		int[] mergedArray = new int[array1.length+array2.length];
		int i=0, j=0, k=0;


		//Merge both arrays into mergedArray
		while( i<array1.length && j<array2.length) 
		{
			if(array1[i] < array2[j])
			{
				mergedArray[k++] = array1[i++];
			} 
			else
			{
				mergedArray[k++] = array2[j++];
			}
		}

		//If there are remaining elements in array1
		while(i < array1.length)
		{
			mergedArray[k++] = array1[i++];
		}

		//If there are remaining elements in array2
		while(j < array2.length)
		{
			mergedArray[k++] = array2[j++];
		}

		return mergedArray;
	}
}