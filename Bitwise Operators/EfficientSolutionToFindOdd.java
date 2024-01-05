public class EfficientSolutionToFindOdd {
    public static void main(String[] args) {
       int arr[] = {4,4,7,4,8,7,7,7,8};
       int n = 9;
       int result = findOdd(arr,n);
       System.out.println("The odd occurring element is: "+result); 
    }
    static int findOdd(int arr[],int n)
    {
        int res = arr[0];
        for(int i=1;i<n;i++)
        {
            res = res^arr[i];
        }
        return res;
    }
}
