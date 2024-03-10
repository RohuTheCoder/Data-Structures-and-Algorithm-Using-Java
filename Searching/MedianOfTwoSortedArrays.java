import java.util.Arrays;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int arr1[] = {-5,3,6,12,15};
        int arr2[] = {-12,-10,-6,-3,4,10};

        int i = arr1.length;
        int j = arr2.length;

        int arr3[] = new int[i+j];

        //Merge the two arrays into one array
        System.arraycopy(arr1, 0, arr3, 0, i);
        System.arraycopy(arr2, 0, arr3, i, j);
        
        //Sort the merged array
        Arrays.sort(arr3);

        int result = median(arr3);
        System.out.println(result);
    }
    static int median(int arr[])
    {
        int n = arr.length;

        //If the length of array is even
        if(n%2==0)
        {
            int z = n/2;
            int e = arr[z];
            int q = arr[z-1];

            int ans = (e+q)/2;
            return ans;
        }
        //If the length is odd
        else
        {
            int z = Math.round(n/2);
            return arr[z];
        }
    }
}
