public class AllocateMinimumPages {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40};
        int k = 2;
        int n = arr.length;
        int result = minPages(arr, n, k);
        System.out.println(result);
    }
    static int minPages(int arr[],int n,int k)
    {
        if(k==1)
            return sum(arr,0,n-1);
        if(n==1)
            return arr[0];
        int res = Integer.MAX_VALUE;
        for(int i=1;i<n;i++)
            res = Math.min(res,Math.max(minPages(arr, i, k-1),sum(arr,i,n-1)));
        return res;
    }
    static int sum(int arr[],int b,int e)
    {
        int s = 0;
        for(int i=b;i<=e;i++)
            s += arr[i];
        return s;
    }
}