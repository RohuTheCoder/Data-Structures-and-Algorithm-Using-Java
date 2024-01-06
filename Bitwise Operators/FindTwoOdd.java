public class FindTwoOdd {
    public static void main(String[] args) {
     int arr[] = {10,3,3,5};
     int n = 4;
     System.out.println("Two odd occuring elements are:");
     printOdd(arr, n);
    }
    static void printOdd(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
            int count = 0;
            for(int j=0;j<n;j++)
            {
                if(arr[i]==arr[j])
                    count++;
            }
            if(count%2!=0)
                System.out.println(arr[i]);
        }
    }
}
