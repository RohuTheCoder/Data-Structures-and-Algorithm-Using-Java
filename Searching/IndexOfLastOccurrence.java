public class IndexOfLastOccurrence {
    public static void main(String[] args) {
       int arr[] = {5,10,10,15,15};
       int x = 10;
       int index = lastOccurrence(arr, x);
       System.out.println(index);
    }
    static int lastOccurrence(int arr[],int x)
    {
        int n = arr.length;
        for(int i=n-1;i>=0;i--)
            if(arr[i]==x)
                return i;
        return -1;
    }
}
