public class SquareRoot
{
    public static void main(String[] args) {
     int x = 9;
     int result = sqRootFloor(x);
     System.out.println(result);        
    }
    static int sqRootFloor(int x)
    {
        int i = 1;
    while(i*i<=x)
    {
        i++;
    }
    return (i-1);
    }
}