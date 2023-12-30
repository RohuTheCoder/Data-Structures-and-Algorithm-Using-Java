public class SieveOfEratosthenesShorterSolution {
    public static void main(String[] args)
    {
        int n = 25;
        sieve(n);
    }
    static void sieve(int n)
    {
        boolean[] isPrime = new boolean[n+1];
        for(int i=2;i<=n;i++)
        {
            isPrime[i] = true;
        }
        for(int i=2;i<=n;i++)
        {
            if(isPrime[i])
            {
                System.out.println(i);
                for(int j=i*i;j<=n;j=j+i)
                {
                    isPrime[j]=false;
                }
            }
        }
    }
}
