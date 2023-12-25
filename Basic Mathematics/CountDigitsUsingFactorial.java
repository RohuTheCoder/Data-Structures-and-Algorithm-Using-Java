class CountDigitsUsingFactorial
{
    public static void main(String[] args)
    {
        int result = countdigits(1234);
        System.out.println("Result is "+result);
    }
    static int countdigits(int n)
    {
        int fact = 1;
        int res = 0;
        for(int i=2;i<=n;i++)
        {
            fact = fact*i;
        }
        while(fact%10==0)
        {
            res++;
            fact = fact/10;
        }
        return res;
    }
}