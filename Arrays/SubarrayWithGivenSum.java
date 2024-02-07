public class SubarrayWithGivenSum {
    public static void main(String[] args) {
        int arr[] = {3,2,0,4,7};
        int sum = 6;
        boolean result = isSubSum(arr, sum);
        System.out.println(result);
    }
    static boolean isSubSum(int arr[],int sum)
    {
        for(int i=0;i<arr.length;i++)
        {
            int curr = 0;
            for(int j=i;j<arr.length;j++)
            {
                curr += arr[j];
                if(curr == sum)
                    return true;
            }
        }
        return false;
    }
}
