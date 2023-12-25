class CountDigits
{
    public static void main(String[] args)
    {
       int result = countDigits(1234);
       System.out.println("Result is "+result);
    }
    static int countDigits(int x)
    {
        int res = 0;
        while (x>0)
        {
            x = x/10;
            res++;
        }
        return res;
    }
}