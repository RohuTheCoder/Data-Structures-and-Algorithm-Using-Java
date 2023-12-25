public class FactorialRecursiveSolution {
    public static void main(String[] args)
    {
        int result = fact(6);
        System.out.println("Recursive solution for factorial of given number is "+result);
    }
    static int fact(int n)
    {
        if(n==0)
            return 1;
        return n*fact(n-1);
    }
}
