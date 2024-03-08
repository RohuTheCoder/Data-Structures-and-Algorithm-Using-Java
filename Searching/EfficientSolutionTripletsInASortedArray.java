public class EfficientSolutionTripletsInASortedArray {
    public static void main(String[] args) {
        int arr[] = {2,5,10,15,18};
        int n = arr.length;
        int x = 33;
        boolean result = isTriplet(arr, n, x);
        System.out.println(result);
    }
    static boolean isTriplet(int arr[],int n,int x)
    {
        for(int i=0;i<n-2;i++)
            if(isPair(arr,n,x-arr[i],i+1))
                return true;
        return false;
    }
    static boolean isPair(int arr[],int n,int x,int si)
    {
        int i=si,j=n-1;
        while(i<j)
        {
            if(arr[i]+arr[j]==x)
                return true;
            else if(arr[i]+arr[j]<x)
                i++;
            else
                j--;
        }
        return false;
    }
}
