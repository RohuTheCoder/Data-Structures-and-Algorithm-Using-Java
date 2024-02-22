public class Count1sInSortedBinaryArray {
    public static void main(String[] args) {
        int arr[] = {0,0,1,1,1,1,1};
        int n = arr.length;
        int result = countOnes(arr, n);
        System.out.println(result);
    }
    static int countOnes(int arr[],int n)
    {
        int low = 0;
        int high = n-1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(arr[mid]==0)
                low = mid+1;
            else
            {
                if(mid==0||arr[mid]!=arr[mid-1])
                    return (n-mid);
                else
                    high = mid-1;
            }
        }
        return 0;
    }
}
