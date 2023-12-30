public class IterativePower {
    public static void main(String[] args)
    {
        int x = 4;
        int n = 5;
        int result = power(x,n);
        System.out.println(result);
    }
    static int power(int x,int n)
    {
        int res = 1;
        while(n>0)
        {
            if(n%2!=0)
                res = res*x;
            x = x*x;
            n=n/2;
        }
        return res;
    }
}
