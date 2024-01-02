public class CheckIfKthBitIsSet {
    public static void main(String[] args) {
        int n = 5;
        int k = 3;
        isSet(n,k);
    }
    static void isSet(int n,int k)
    {
        int x = 1;
        for(int i=0;i<(k-1);i++)
          x = x*2;
        if((n&x)!=0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
