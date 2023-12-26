class EfficientSolutionPrimeFactors
{
    public static void main(String[] args)
    {
         printPrimeFactors(450);
    }
    static void printPrimeFactors(int n)
    {
        if(n<=1)
            return;
        for(int i=2;i*i<=n;i++)
        {
            while(n%i==0)
            {
                System.out.println(i);
                n = n/i;
            }
        }
        if(n>1)
            System.out.println(n);
    }
}
