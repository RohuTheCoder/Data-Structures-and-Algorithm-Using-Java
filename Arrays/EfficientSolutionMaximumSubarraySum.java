public class EfficientSolutionMaximumSubarraySum {
    public static void main(String[] args) {
       int arr[] = {-3,8,-2,4,-5,6};
       int result = maxSum(arr);
       System.out.println(result); 
    }
    static int maxSum(int arr[])
    {
        int n = arr.length;
        int res = arr[0];
        int maxEnding = arr[0];
        for(int i=1;i<n;i++)
        {
            maxEnding = Math.max(maxEnding+arr[i],arr[i]);
            res = Math.max(res,maxEnding);
        }
        return res;
    }
}
