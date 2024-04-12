public class SuperNaiveSolutionRepeatingElement {
    public static void main(String[] args) {
        int arr[] = {0,2,1,3,2,2};
        int result = findRepeating(arr);
        System.out.println(result);   
    }
    static int findRepeating(int arr[])
    {
        int n = arr.length;
        for(int i=0;i<n-1;i++)
            for(int j=i+1;j<n;j++)
                if(arr[i]==arr[j])
                    return arr[i];
        return -1;
    }
}
