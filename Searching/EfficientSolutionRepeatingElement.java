public class EfficientSolutionRepeatingElement {
    public static void main(String[] args) {
        int arr[] = {0,2,1,3,2,2};
        int result = findRepeating(arr);
        System.out.println(result);
    }
    static int findRepeating(int arr[])
    {
        int n = arr.length;
        boolean visited[]  = new boolean[n];
        for(int i=0;i<n;i++)
        {
            visited[i] = false;
        }
        for(int i=0;i<n;i++)
        {
            if(visited[arr[i]])
                return arr[i];
            visited[arr[i]] = true;
        }
        return -1;
    }
}
