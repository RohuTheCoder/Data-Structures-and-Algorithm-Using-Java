public class Palindrome {
    public static void main(String[] args)
    {
        boolean result = isPal(78987);
        System.out.println("The given number is Palindrome? "+result);
    }
    static boolean isPal(int n)
    {
        int rev = 0;
        int temp = n;
        while(temp!=0)
        {
            int ld = temp%10;
            rev = rev*10+ld;
            temp = temp/10;
        }
        return (rev==n);
    }
}
