public class EfficientSolutionForPrimeNumbers {
    public static void main(String[] args)
    {
        boolean result = isPrime(13);
        System.out.println("The given number is prime(true/false)?"+result);
    }
    static boolean isPrime(int n)
    {
        if(n==1)
            return false;
        for(int i=2;i*i<=n;i++)
            if(n%i==0)
                return false;
        return true;
    }
}
