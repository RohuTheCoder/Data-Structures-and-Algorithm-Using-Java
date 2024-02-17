public class IterativeSolutionIndexOfFirstOccurence {
    public static void main(String[] args) {
        int arr[] = {5,10,10,20,20};
        int x = 10;
        int index = firstOccurrence(arr, x);
        System.out.println(index);
    }
    static int firstOccurrence(int arr[],int x)
    {
        int n = arr.length;
        int low = 0;
        int high = n-1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(arr[mid]>x)
                high = mid-1;
            else if(arr[mid]<x)
                low = mid+1;
            else
            {
                if(mid==0||arr[mid-1]!=arr[mid])
                    return mid;
                else
                    high = mid-1;
            }
        }
        return -1;
    }
}
