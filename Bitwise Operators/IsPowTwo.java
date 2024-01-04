public class IsPowTwo {
    public static void main(String[] args) {
        int n = 8;
        boolean result = isPow(n);
        System.out.println("The given number "+n+" is power of 2: "+result);
    }
    static boolean isPow(int n)
    {
        if(n==0)
            return false;
        while(n!=1)
        {
            if(n%2!=0)
                return false;
            n = n/2;
        }
        return true;
    }
}
