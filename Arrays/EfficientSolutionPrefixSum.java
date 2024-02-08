public class EfficientSolutionPrefixSum {
    public static void main(String[] args) {
        int arr[] = {2,8,3,9,6,5,4};
        int l=2;
        int r=6;
        int result = getSum(arr, l, r);
        System.out.println(result);
       
    }
    static int getSum(int arr[],int l,int r)
    {
        int n = arr.length;
        int pr[] = new int[n];
        pr[0] = arr[0];
        for(int i=1;i<n;i++)
            pr[i] = pr[i-1]+arr[i];
        if(l==0)
            return pr[r];
        return pr[r]-pr[l-1];
    }
}
