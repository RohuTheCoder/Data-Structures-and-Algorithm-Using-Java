public class EfficientSolutionMedianOfTwoSortedArrays {
    public static void main(String[] args) {
       int arr1[] = {-5,3,6,12,15};
       int arr2[] = {-12,-10,-6,-3,4,10};
       double result = getMedian(arr1,arr2);
       System.out.println(result); 
    }
    static double getMedian(int arr1[],int arr2[])
    {
        int n = arr1.length;
        int m = arr2.length;

        if(n>m)
            return getMedian(arr2, arr1);
        
            int start = 0;
            int end = n;
            int realmidinmergedarray = (n+m+1)/2;

            while(start<=end)
            {
                int mid = (start+end)/2;
                int i1 = mid; //leftAsize
                int i2 = realmidinmergedarray - mid; //leftBsize
                int min1 = (i1==n)?Integer.MAX_VALUE:arr1[i1];//Minimum element on right side of a1
                int max1 = (i1==0)?Integer.MIN_VALUE:arr1[i1-1];//Maximum element on left side of a1
                int min2 = (i2==m)?Integer.MAX_VALUE:arr2[i2];//Minimum element on right side of a2
                int max2 = (i2==0)?Integer.MIN_VALUE:arr2[i2-1];//Maximum element on left side of a2
                if(max1<=min2 && max2<=min1)
                {
                    if((n+m)%2==0)
                        return ((double)Math.max(max1,max2)+Math.min(min1,min2))/2;
                    else
                        return (double)Math.max(max1,max2);
                }
                else if(max1>max2)
                    end = i1-1;
                else
                    start = i1+1;

            }
             return -1;
        }
}
