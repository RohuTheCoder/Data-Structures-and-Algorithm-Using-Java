public class EfficientMethod1ToCheckIfKthBitIsSet {
    public static void main(String[] args) {
        int n = 5;
        int k = 3;
        iskthSet(n,k);
    }
    static void iskthSet(int n,int k)
    {
        int x = (1<<(k-1));
        if((n&1)!=0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
    
}
