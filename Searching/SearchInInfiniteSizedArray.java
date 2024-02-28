public class SearchInInfiniteSizedArray {
    public static void main(String[] args) {
        int arr[] = {1,10,15,20,40,80,90,100,120,500,};
        int x = 100;
        int index = search(arr,x);
        System.out.println(index);
    }
    static int search(int arr[],int x)
    {
        int i = 0;
        while(true)
        {
            if(arr[i]==x)
                return i;
            if(arr[i]>x)
                return -1;
            i++;
        }
    }
}
