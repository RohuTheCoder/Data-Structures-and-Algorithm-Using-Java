class PrimeFactors
{
    public static void main(String[] args)
    {
        primeFactors(315);
    
    }
    static void primeFactors(int n)
    {
        for(int i=2;i<n;i++)
        {
            if(isPrime(i))
            {
                int x = i;
                while(n%x==0)
                {
                    System.out.println(i);
                    x = x*i;
                }
            }
        }
    }
   static boolean isPrime(int n)
    {
        if(n==1)
            return false;
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
}