public class NaiveIntersectionOfSortedArrays {

    public static void intersection(int a[],int b[],int m,int n)
    {
        for(int i=0;i<m;i++)
        {
            if(i>0&&a[i]==a[i-1])
                continue;
            for(int j=0;j<n;j++)
            {
                if(a[i]==b[j])
                {
                    System.out.print(a[i]+" ");
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 4, 5, 6};
        int[] arr2 = {2, 2, 4, 6, 8};
        intersection(arr1,arr2,arr1.length,arr2.length);
    }
    
}
