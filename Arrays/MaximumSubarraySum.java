public class MaximumSubarraySum {
    public static void main(String[] args) {
       int arr[] = {2,3,-8,7,-1,2,3};
       int result = maxSum(arr);
       System.out.println(result); 
    }
    static int maxSum(int arr[])
    {
        int n = arr.length;
        int res =  arr[0];
        for(int i=0;i<n;i++)
        {
            int curr = 0;
            for(int j=i;j<n;j++)
            {
                curr = curr+arr[j];
                res = Math.max(res,curr);
            }
        }
        return res;
    }
}
