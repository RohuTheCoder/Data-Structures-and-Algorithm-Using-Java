public class Divisors {
    public static void main(String[] args)
    {
        printDivisors(100);
    }
    static void printDivisors(int n)
    {
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
                System.out.println(i);
        }
    }
    
}
