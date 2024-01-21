public class EfficientSolutionMoveZeroesToEnd {
  public static void main(String[] args) {
    int arr[] = {10,8,0,0,12,0};
    moveZeroes(arr);
    for(int i=0;i<arr.length;i++)
      System.out.print(arr[i]+" ");
  } 
  static void moveZeroes(int arr[])
  {
    int n = arr.length;
    int count = 0;
    for(int i=0;i<n;i++)
    {
        if(arr[i]!=0)
        {
            swap(arr,i,count);
            count++;
        }
    }
  }   
  static void swap(int arr[],int i,int count)
  {
    int temp = arr[i];
    arr[i] = arr[count];
    arr[count] = temp;
  }
}
