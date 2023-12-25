public class EfficientSolutionForLCMOfTwoNumbers {
    public static void main(String[] args)
    {
        int result = lcm(4,6);
        System.out.println("LCM of the given numbers is "+result);
    }
    static int gcd(int a, int b)
    {
        if(b==0)
            return a;
        return gcd(b,a%b);
    }
    static int lcm(int a, int b)
    {
        return a*b/gcd(a,b);
    }
}
