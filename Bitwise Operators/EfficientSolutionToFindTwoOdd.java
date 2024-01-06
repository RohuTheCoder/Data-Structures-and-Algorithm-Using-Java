public class EfficientSolutionToFindTwoOdd {
    public static void main(String[] args) {
        int arr[] = {1,6,5,6,6,1};
        int n = 6;
        System.out.println("Two odd appearing elements are:");
        oddAppearing(arr, n);
    }
    static void oddAppearing(int arr[],int n)
    {
        int x = arr[0];
        for(int i=0;i<n;i++)
            x = x^arr[i];
        int k = (x&(~(x-1)));
        int res1=0,res2=0;
        for(int i=0;i<n;i++)
        {
            if((arr[i]&k)!=0)
                res1 = res1^arr[i];
            else
                res2 = res2^arr[i];
        }
        System.out.println(res1);
        System.out.println(res2);
    }
}
