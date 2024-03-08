public class TripletInASortedArray {
    public static void main(String[] args) {
        int arr[] = {2,3,5,6,15};
        int n = arr.length;
        int x = 20;
        boolean result = isTriplet(arr, n, x);
        System.out.println(result);
    }
    static boolean isTriplet(int arr[],int n,int x)
    {
        for(int i=0;i<n-2;i++)
            for(int j=i+1;j<n-1;j++)
                for(int k=j+1;k<n;k++)
                    if(arr[i]+arr[j]+arr[k]==x)
                        return true;
        return false;
    }
}
