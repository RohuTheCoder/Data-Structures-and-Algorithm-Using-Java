public class MoveZeroesToEnd {
    public static void main(String[] args) {
        int arr[] = {10,5,0,0,8,0,9,0};
        moveToEnd(arr);
        for(int i=0;i<arr.length;i++)
          System.out.print(arr[i]+" ");
    }
    static void moveToEnd(int arr[])
    {
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
            {
                int nonZeroIndex = findNonZero(arr,i+1);
                if(nonZeroIndex!=-1)
                {
                    swap(arr,i,nonZeroIndex);
                }
            }
        }
    }
    static int findNonZero(int arr[],int start)
    {
        for(int i=start;i<arr.length;i++)
           if(arr[i]!=0)
           {
            return i;
           }
        return -1;
    }
    static void swap(int arr[],int i,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
