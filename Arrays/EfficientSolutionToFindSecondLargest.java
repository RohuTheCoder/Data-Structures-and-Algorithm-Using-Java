public class EfficientSolutionToFindSecondLargest {
    public static void main(String[] args) {
        int arr[] = {5,20,12,20,8};
        int index = secondLargest(arr);
        System.out.println(arr[index]);
    }
    static int secondLargest(int arr[])
    {
        int res = -1,largest = 0;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>arr[largest])
            {
                res = largest;
                largest = i;
            }
            else if(arr[i]!=arr[largest])
            {
                if(res==-1||arr[i]>arr[res])
                    res = i;
            }
        }
        return res;
    }
}
