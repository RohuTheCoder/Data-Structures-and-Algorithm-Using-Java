public class MaximumDifferenceProblemWithOrder {
    public static void main(String[] args) {
        int arr[] = {2,3,10,6,4,8,1};
        int result = maxDiff(arr);
        System.out.println(result);
    }
    static int maxDiff(int arr[])
    {
        int n = arr.length;
        int res = arr[1]-arr[0];
        for(int i=0;i<n-1;i++)
          for(int j=i+1;j<n;j++)
           res = Math.max(res,arr[j]-arr[i]);
        return res;
    }
}
