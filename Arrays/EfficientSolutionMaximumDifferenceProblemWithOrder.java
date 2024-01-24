public class EfficientSolutionMaximumDifferenceProblemWithOrder {
    public static void main(String[] args) {
        int arr[] = {2,3,10,6,4,8,1};
        int result = maxDiff(arr);
        System.out.println(result);
    }
    static int maxDiff(int arr[])
    {
        int n = arr.length;
        int minVal = arr[0];
        int res = arr[1]-arr[0];
        for(int j=1;j<n;j++)
        {
            res = Math.max(res,arr[j]-minVal);
            minVal = Math.min(minVal, arr[j]);
        }
        return res;
    }
}
