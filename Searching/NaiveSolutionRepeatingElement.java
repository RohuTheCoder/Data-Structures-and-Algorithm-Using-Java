import java.util.Arrays;

public class NaiveSolutionRepeatingElement {
    public static void main(String[] args) {
        int arr[] = {0,2,1,3,2,2};
        int result = findRepeating(arr);
        System.out.println(result);
    }
    static int findRepeating(int arr[])
    {
        Arrays.sort(arr);
        int n = arr.length;
        for(int i=0;i<n-1;i++)
            if(arr[i]==arr[i+1])
                return arr[i];
        return -1;
    }
}
