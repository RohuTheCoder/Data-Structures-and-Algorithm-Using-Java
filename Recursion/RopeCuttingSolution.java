public class RopeCuttingSolution
{
    static int maxPieces(int n,int a,int b,int c)
    {
        if(n==0)
            return 0;
        if(n<0)
            return -1;
        int res = Math.max(maxPieces(n-a, a, b, c),
                            Math.max(maxPieces(n-b, a, b, c),
                            maxPieces(n-c, a, b, c)));
        if(res==-1)
            return -1;
        else
            return res+1;
    }
    public static void main(String[] args) {
        int n=5,a=2,b=5,c=1;
        int result = maxPieces(n, a, b, c);
        System.out.println(result);
    }
}