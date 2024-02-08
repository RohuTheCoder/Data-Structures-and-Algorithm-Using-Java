public class PrefixSum {
    public static void main(String[] args) {
        int arr[] = {2,8,3,9,6,5,4};
        int l = 1;
        int r = 3;
        int result = getSum(arr, l, r);
        System.out.println(result);
    }
    static int getSum(int arr[],int l,int r)
    {
        int res = 0;
        for(int i=l;i<=r;i++)
        {
            res += arr[i]; 
        }
        return res;
    }
}
