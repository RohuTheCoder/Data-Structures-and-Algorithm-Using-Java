public class FindSecondLargestElement {
    public static void main(String[] args) {
        int arr[] = {5,20,12,20,10};
        int index = secondLargest(arr);
        System.out.println(arr[index]);
    }
    static int secondLargest(int arr[])
    {
        int largest = getLargest(arr);
        int res = -1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=arr[largest])
            {
                if(res==-1)
                  res = i;
                else if(arr[i]>arr[res])
                  res = i;
            }
        }
        return res;
    }
    static int getLargest(int arr[])
    {
        int largest = 0;
        for(int i=1;i<arr.length;i++)
           if(arr[i]>arr[largest])
              largest = i;
        return largest;
    }
}
