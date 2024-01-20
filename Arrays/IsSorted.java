public class IsSorted {
    public static void main(String[] args) {
        int arr[] = {7,20,30,10};
        boolean result = isSorted(arr);
        System.out.println(result);
    }
    static boolean isSorted(int arr[])
    {
        for(int i=0;i<arr.length;i++)
          for(int j=i+1;j<arr.length;j++)
            if(arr[j]<arr[i])
              return false;
        return true;
    }
}
