import static java.lang.Math.max;

public class LCMOfTwoNumbers {
    public static void main(String[] args) {
        int result = lcm(4, 6);
        System.out.println("LCM of given numbers is " + result);
    }

    static int lcm(int a, int b) {
        int res = max(a, b);
        while (true) {
            if (res % a == 0 && res % b == 0)
                return res;
            res++;
        }
    }
}