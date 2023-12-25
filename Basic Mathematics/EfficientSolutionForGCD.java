public class EfficientSolutionForGCD {
    public static void main(String[] args) {
        int result = gcd(2, 3);
        System.out.println("GCD of the given numbers " + result);
    }

    static int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }
}
