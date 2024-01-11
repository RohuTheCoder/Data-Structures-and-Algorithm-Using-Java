public class PrintNTo1 {
    static void printNTo1(int n)
    {
        if(n==0)
            return;
        System.out.print(n+" ");
        printNTo1(n-1);
    }
    public static void main(String[] args) {
        int n = 4;
        printNTo1(4);
    }
}
