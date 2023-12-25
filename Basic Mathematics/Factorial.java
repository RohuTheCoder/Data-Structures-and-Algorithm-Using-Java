public class Factorial {
    public static void main(String[] args)
    {
        int result = fact(4);
        System.out.println("Factorial of the given number is "+result);
    }
    static int fact(int n)
    {
        int res=1;
        for(int i=2;i<=n;i++)
        {
            res = res*i;
        }
        return res;
    }
}
