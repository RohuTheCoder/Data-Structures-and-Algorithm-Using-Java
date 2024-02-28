public class EfficientSolutionSearchInInfiniteSizedArray {
    public static void main(String[] args) {
        int arr[] = {1,10,15,20,40,60,80,100,200,500,1000,};
        int x = 100;
        int index = search(arr, x);
        System.out.println(index);
    }
    static int search(int arr[],int x)
    {
        if(arr[0]==x)
            return 0;
        int i=1;
        while(arr[i]<x)
            i=i*2;
        if(arr[i]==x)
            return i;
        return binarySearch(arr,x,i/2+1,i-1);
    }
    static int binarySearch(int arr[],int x,int low,int high)
    {
        if(low>high)
            return -1;
        int mid = (low+high)/2;
        if(arr[mid]==x)
            return mid;
        else if(arr[mid]>x)
            return binarySearch(arr, x, low, mid-1);
        else
            return binarySearch(arr, x, mid+1, high);
    }
}
