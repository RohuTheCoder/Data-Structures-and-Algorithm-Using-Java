public class RecursionExample3 {
    static int fun(int n)
    {
        if(n==1)
             return 0;
        return 1+fun(n/2);
    }
    public static void main(String[] args) {
       int result = fun(16);
       System.out.println(result);
    }
    
}
