public class EfficientSolutionSubarrayWithGivenSum {
    public static void main(String[] args) {
      int arr[] = {4,8,12,5};
      int sum = 17;
      boolean result = isSubSum(arr, sum);
      System.out.println(result);  
    }
    static boolean isSubSum(int arr[],int sum)
    {
        int s = 0,curr = 0;
        for(int e=0;e<arr.length;e++)
        {
            curr += arr[e];
            while(sum<curr)
            {
                curr -= arr[s];
                s++;
            }
            if(curr==sum)
                return true;
        }
        return false;
    }
}
