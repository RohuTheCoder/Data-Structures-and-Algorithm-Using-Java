public class IterativeSolutionIndexOfLastOccurrence {
    public static void main(String[] args) {
        int arr[] = {5,10,10,10,10,20,20};
        int x = 10;
        int index = lastOccurrence(arr, x);
        System.out.println(index);
    }
    static int lastOccurrence(int arr[],int x)
    {
        int n = arr.length;
        int low = 0;
        int high = n-1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(arr[mid]<x)
                low = mid+1;
            else if(arr[mid]>x)
                high = mid-1;
            else
            {
                if(mid==n-1||arr[mid]!=arr[mid+1])
                    return mid;
                else
                    low = mid+1;
            }
        }
        return -1;
    }
}
