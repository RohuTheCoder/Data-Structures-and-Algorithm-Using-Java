public class SearchInSortedRotatedArray {
 
    public static void main(String[] args) {
        int arr[] = {100,200,400,1000,10,20};
        int x = 10;
        int n = arr.length;
        int index = search(arr,n,x);
        System.out.println(index);
    }
    static int search(int arr[],int n,int x)
    {
        for(int i=0;i<n;i++)
            if(arr[i]==x)
                return i;
        return -1;
    }
}
