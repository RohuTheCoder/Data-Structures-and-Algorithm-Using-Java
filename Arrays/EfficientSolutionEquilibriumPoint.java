public class EfficientSolutionEquilibriumPoint {
    public static void main(String[] args) {
        int arr[] = {3,4,8,-9,9,7};
        boolean result = ePoint(arr);
        System.out.println(result);
    }
    static boolean ePoint(int[] arr)
    {
        int n = arr.length;
        int rs = 0;
        for(int i=0;i<n;i++)
            rs += arr[i];
        int ls = 0;
        for(int i=0;i<n;i++)
        {
            rs -= arr[i];
            if(ls==rs)
                return true;
            ls += arr[i];
        }
        return false;
    }
}
