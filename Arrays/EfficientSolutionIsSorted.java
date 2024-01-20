public class EfficientSolutionIsSorted {
    public static void main(String[] args) {
        int arr[] = {5,12,30,2,35};
        boolean result = isSorted(arr);
        System.out.println(result);
    }
    static boolean isSorted(int arr[])
    {
        for(int i=1;i<arr.length;i++)
           if(arr[i]<arr[i-1])
              return false;
        return true;
    }
}
