public class LookUpTableSolutionToCountSetBits {
    public static void main(String[] args) {
        int n = 13;
        int result = countSetBits(n); 
        System.out.println("Number of Set Bits in the Binary representation of  "+n+" is: "+result);
    }
    static int countSetBits(int n)
    {
        int tbl[] = new int[256];
        tbl[0] = 0;
        for(int i=1;i<256;i++)
        {
            tbl[i] = tbl[i&(i-1)]+1;
        }
        return tbl[n&255]+
                tbl[(n>>8)&255]+
                tbl[(n>>16)&255]+
                tbl[(n>>24)];
    }
}
