public class IndexOfFirstOccurrence {
    public static void main(String[] args) {
      int arr[] = {5,10,10,15,15};
      int x = 15;
      int index = firstOccurrence(arr, x);
      System.out.println(index);  
    }
    static int firstOccurrence(int arr[],int x)
    {
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==x)
                return i;
        }
        return -1;
    }
}
