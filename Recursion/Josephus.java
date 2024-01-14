public class Josephus {
    public static void main(String[] args) {
        int n = 5;
        int k = 3;
        int result = josephus(n,k);
        System.out.println(result);
    }
    static int josephus(int n,int k)
    {
        if(n==1)
            return 0;
        else
            return (josephus(n-1, k)+k)%n;
    }
}
