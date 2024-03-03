public class EfficientSolutionTwoPointersApproach {
    public static void main(String[] args) {
        int arr[] = {2,5,8,12,30};
        int n = arr.length;
        int x = 17;
        boolean result = isPair(arr, n, x);
        System.out.println(result);
    }
    static boolean isPair(int arr[],int n,int x)
    {
        int i=0,j=n-1;
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
