public class EfficientSolutionFindAPeakElement {
    public static void main(String[] args) {
        int arr[] = {5,10,20,15,7};
        int n = arr.length;
        int index = getAPeak(arr, n);
        System.out.println(arr[index]);
    }
    static int getAPeak(int arr[],int n)
    {
        int low = 0;
        int high = n-1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if((mid==0||arr[mid-1]<=arr[mid])&&(mid==n-1||arr[mid+1]<=arr[mid]))
                return mid;
            if(mid>0&&arr[mid-1]>=arr[mid])
                high = mid-1;
            else
                low = mid+1;
        }
        return -1;
    }
}
