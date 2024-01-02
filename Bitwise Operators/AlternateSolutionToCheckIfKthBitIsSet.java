public class AlternateSolutionToCheckIfKthBitIsSet {
    public static void main(String[] args) {
       int n = 5;
       int k = 3;
       isSet(n,k); 
    }
    static void isSet(int n,int k)
    {
        for(int i=0;i<(k-1);i++)
        {
            n = n/2;
        }
        if((n&1)!=0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
