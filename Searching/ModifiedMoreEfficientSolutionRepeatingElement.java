public class ModifiedMoreEfficientSolutionRepeatingElement
{
public static void main(String[] args)
{
    int arr[] = {0,2,1,3,5,4,6,2};
    int n = arr.length;
    int result = findRepeating(arr, n);
    System.out.println(result);
}
static int findRepeating(int arr[],int n)
{
    int slow = arr[0]+1;
    int fast = arr[0]+1;
    do
    {
        slow = arr[slow]+1;
        fast = arr[arr[fast]+1]+1;
    }while(slow!=fast);
    slow = arr[0]+1;
    while(slow!=fast)
    {
        slow = arr[slow]+1;
        fast = arr[fast]+1;
    }
    return slow-1;
}
}