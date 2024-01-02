public class EfficientMethod2ToCheckIfKthBitIsSet {
    public static void main(String[] args) {
        int n = 5;
        int k = 3;
        iskthSet(n,k);
    }
    static void iskthSet(int n,int k)
    {
        int x = (n>>(k-1));
        if((x&1)!=0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
    
}
