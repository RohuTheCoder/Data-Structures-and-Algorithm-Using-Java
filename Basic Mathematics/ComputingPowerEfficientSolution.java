public class ComputingPowerEfficientSolution {
    public static void main(String[] args) {
        int x=3;
        int n=4;
        int result = power(x,n);
        System.out.println(x+"^"+n+" = "+result);
    }
    static int power(int x,int n)
    {
        int res = 1;
        if(n==0)
            return 1;
        int temp = power(x,n/2);
        temp = temp*temp;
        if(n%2==0)
            return temp;
        else
            return temp*x;
    } 
}
