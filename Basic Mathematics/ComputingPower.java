public class ComputingPower {
    public static void main(String[] args)
    {
         int x = 3;
         int n = 4;
         int result = power(x,n);
         System.out.println(x+"^"+n+" = "+result);
    }
    static int power(int x,int n)
    {
        int res = 1;
        for(int i=0;i<n;i++)
        {
            res = res*x;
        }
        return res;
    }
}
