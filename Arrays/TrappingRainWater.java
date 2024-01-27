public class TrappingRainWater
{
    public static void main(String[] args) {
       int arr[] = {3,0,1,2,5};
       int result = getWater(arr); 
       System.out.println(result);
    }
    static int getWater(int arr[])
    {
        int n = arr.length;
        int res = 0;
        for(int i=1;i<n-1;i++)
        {
            int lMax = arr[i];
            for(int j=0;j<i;j++)
                lMax = Math.max(lMax,arr[j]);
            int rMax = arr[i];
            for(int j=i+1;j<n;j++)
                rMax = Math.max(rMax, arr[j]);
            res = res+(Math.min(lMax,rMax)-arr[i]);
        }
        return res;
    }
}