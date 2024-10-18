public class EfficientSolutionIntersectionOfSortedArrays 
{
    public static void intersection(int a[],int b[],int m,int n)
    {
        int i=0,j=0;
        while(i<m && j<n)
        {
            if(i>0&&a[i]==a[i-1])
            {
                i++; 
                continue;
            }
            if(a[i]<b[j]) 
            {
                i++;
            }
            else if(a[i]>b[j]) 
            {
                j++;
            }
            else 
            {
                System.out.print(a[i]+" ");
                i++;
                j++;
            }
        }
    }
    public static void main(String[] args) 
    {
        int[] arr1 = {1, 2, 2, 4, 5, 6};
        int[] arr2 = {2, 2, 4, 6, 8};
        intersection(arr1, arr2, arr1.length, arr2.length);
    }
}
