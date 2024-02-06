public class SlidingWindowTechnique {
    public static void main(String[] args) {
        int arr[] = {1,8,30,-5,20,7};
        int k = 3;
        int result = maxSum(arr, k);
        System.out.println(result);
    }
    static int maxSum(int arr[],int k)
    {
        int n = arr.length;
        int res = Integer.MIN_VALUE;
        for(int i=0;i+k-1<n;i++)
        {
            int  curr = 0;
            for(int j=0;j<k;j++)
                curr += arr[i+j];
            res = Math.max(res,curr);
        }
        return res;
    }
}
