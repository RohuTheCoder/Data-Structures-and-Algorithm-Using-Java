public class LinearSearch
{
    public static void main(String[] args) {
        int arr[] = {20,5,7,25};
        int n = arr.length;
        int x = 5;
        int result = search(arr, n, x);
        System.out.println(result);
    }
    static int search(int arr[],int n,int x)
    {
        for(int i=0;i<n;i++)
            if(arr[i]==x)
                return i;
        return -1;
    }
}