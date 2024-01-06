public class PowerSetUsingBitwise
{ public static void main(String[] args) {
    String s = "ab";
    System.out.println("Power set of String " + s + " Using Bitwise Operators is:");
    printPowerSet(s);
}

static void printPowerSet(String s) {
    int n = s.length();
    int psize = (1 << n);
    for (int i = 0; i < psize; i++) {
        for (int j = 0; j < n; j++)
            if ((i & (1 << j)) != 0)
                System.out.print(s.charAt(j));
        System.out.println();
    }
}
}