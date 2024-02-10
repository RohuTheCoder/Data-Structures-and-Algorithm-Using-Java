public class MaximumAppearingElement {
    public static void main(String[] args) {
        int left[] = {1,2,4};
        int right[] = {4,5,7};
        int result = maxAppear(left, right);
        System.out.println(result);
    }
    static int maxAppear(int left[],int right[])
    {
        int n = left.length;
        int freq[] = new int[100];
        for(int i=0;i<n;i++)
            for(int j=left[i];j<=right[i];j++)
                freq[j] += 1;
        int res = 0;
        for(int i=1;i<100;i++)
            if(freq[i]>freq[res])
                res = i;
        return res;
     }
}
