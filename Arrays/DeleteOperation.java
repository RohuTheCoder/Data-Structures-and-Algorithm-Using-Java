public class DeleteOperation {
   public static void main(String[] args) {
        int arr[] = {3,8,12,5,6};
        int x = 12;
        int n = arr.length;
        int size = delete(arr,n,x);
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
   } 
   static int delete(int arr[],int n,int x)
   {
    int i;
    for(i=0;i<n;i++)
    if(arr[i]==x)
        break;
    if(i==n)
        return n;
    for(int j=i;j<n-1;j++)
        arr[j]=arr[j+1];
    return (n-1);
   }
}
