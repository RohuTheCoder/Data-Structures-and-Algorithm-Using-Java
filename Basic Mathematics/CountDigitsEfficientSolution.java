class CountDigitsEfficientSolution
{
    public static void main(String[] args)
    {
        int result = countTrailingZeroes(1234);
        System.out.println("Resullt is "+result);
    }

    static int countTrailingZeroes(int n)
    {
        int res = 0;
        for(int i=5;i<=n;i*=5)
        {
            res = res+(n/i);
        }
        return res;
    }
}