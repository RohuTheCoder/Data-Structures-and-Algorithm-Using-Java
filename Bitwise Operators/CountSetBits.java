public class CountSetBits {
    public static void main(String[] args) {
        int n = 7;
        int result = countSetBits(n);
        System.out.println("Number of Set bits present in binary representation of "+n+" = "+result);
    }
    static int countSetBits(int n)
    {
        int res = 0;
        while(n>0)
        {
            if(n%2!=0)
                res++;
            n = n/2;
        }
        return res;
    }
}
