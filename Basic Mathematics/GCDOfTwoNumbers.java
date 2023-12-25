class GCDOfTwoNumbers
{
    public static void main(String[] args)
    {
        int result = gcd(2,3);
        System.out.println("GCD of the given Numbers is "+result);
    }
    static int gcd(int a, int b)
    {
        int res = Math.min(a,b);
        while(res>0)
        {
            if(a%res==0&&b%res==0)
            {
                break;
            }
          res--;
        }
       return res;
    }
}