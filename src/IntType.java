public class IntType {
    private static String parity(int x) {
        if (x % 2 == 0)
            return "even";
        else
            return "odd";
    }

    private static String sign(int x) {
        if (x > 0)
            return "positive";
        else
            return "negative";
    }

    public static String description(int x) {
        if (x == 0)
            return "0 is null";

        return String.format("%d is %s and %s", x, IntType.parity(x), IntType.sign(x));
    }

    public static void main(String[] args) throws Exception {
        System.out.println(IntType.description(0));
        System.out.println(IntType.description(-5));
        System.out.println(IntType.description(5));
    }
}
