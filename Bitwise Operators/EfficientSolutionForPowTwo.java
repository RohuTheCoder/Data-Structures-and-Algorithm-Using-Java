public class EfficientSolutionForPowTwo {
    public static void main(String[] args) {
        int n = 4;
        boolean result = isPow2(n);
        System.out.println("The given number "+n+" is power of 2 :"+result);
    }
    static boolean isPow2(int n)
    {
        if(n==0)
            return false;
        return ((n&(n-1))==0);
    }
    
}
