public class MoreEfficientSolutionRepeatingElement {
    public static void main(String[] args) {
        int arr[] = {1,3,2,4,6,5,7,3};
        int n = arr.length;
        int result = findRepeating(arr, n);
        System.out.println(result);
    }
    static int findRepeating(int arr[],int n)
    {
        int slow = arr[0];
        int fast = arr[0];
        do
        {
            slow = arr[slow];
            fast = arr[arr[fast]];
        }while(slow!=fast);
        slow = arr[0];
        while(slow!=fast)
        {
            slow = arr[slow];
            fast = arr[fast];
        }
        return slow;
    }
}
