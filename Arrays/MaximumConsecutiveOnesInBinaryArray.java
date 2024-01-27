public class MaximumConsecutiveOnesInBinaryArray {
    public static void main(String[] args) {
       int arr[] = {0,1,1,1,0,1,1};
       int result = maxConsecutiveOnes(arr);
       System.out.println(result); 
    }
    static int maxConsecutiveOnes(int arr[])
    {
        int res = 0;
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            int curr = 0;
            for(int j=i;j<n;j++)
            {
                if(arr[j]==1)
                    curr++;
                else
                    break;
            }
            res = Math.max(curr,res);
        }
        return res;
    }
}
