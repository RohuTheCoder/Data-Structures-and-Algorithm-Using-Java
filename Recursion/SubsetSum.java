public class SubsetSum {
    public static void main(String[] args) {
        int arr[] = {10,20,15};
        int sum = 25;
        int n = arr.length;
        int result = countSubsets(arr,n,sum);
        System.out.println(result);
    }
    static int countSubsets(int arr[],int n,int sum)
    {
        if(n==0)
        {
            return (sum==0)?1:0;
        }
        return countSubsets(arr,n-1,sum)+
                countSubsets(arr, n-1, sum-arr[n-1]);
    }
}
