public class Fibonacci {
    public static void print_sequence(int n) {
        int a = 0;
        int b = 1;

        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", a);
            int next = a + b;
            a = b;
            b = next;
        }

        System.out.print("\n");
    }

    public static void main(String[] args) {
        Fibonacci.print_sequence(5);
        Fibonacci.print_sequence(10);
        Fibonacci.print_sequence(20);
    }
}
