public class BrianKerningamsAlgorithm {
    public static void main(String[] args) {
        int n = 40;
        int result = countSetBits(n);
        System.out.println("Number of Set Bits in the binary representation of "+n+" = "+result);
    }
    static int countSetBits(int n)
    {
        int res = 0;
        while(n>0)
        {
            n = (n&(n-1));
            res++;
        }
        return res;
    }
}
