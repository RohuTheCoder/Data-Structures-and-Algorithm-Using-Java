public class TwoPointersApproach {
    public static void main(String[] args) {
        int arr[] = {2,3,8,11};
        int n = arr.length;
        int x = 14;
        boolean result = isPair(arr, n, x);
        System.out.println(result);
    }
    static boolean isPair(int arr[],int n,int x)
    {
        for(int i=0;i<n-1;i++)
            for(int j=i+1;j<n;j++)
                if(arr[i]+arr[j]==x)
                    return true;
        return false;
    }
}
