public class RecursiveBinarySearch {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60,70};
        int index = bSearch(arr, 0, 6, 25);
        System.out.println(index);
    }
    static int bSearch(int arr[],int low,int high,int x)
    {
        if(low>high)
            return -1;
        int mid = (low+high)/2;
        if(arr[mid]==x)
            return mid;
        else if(arr[mid]>x)
            return bSearch(arr, 0, mid-1, x);
        else
            return bSearch(arr, mid+1, high, x);
    }
}
