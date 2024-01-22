public class MultiplicationTable {
    public static void print(int n) {
        System.out.printf("Tabela de multiplicação por %d\n", n);

        for (int i = 1; i < 11; i++) {
            System.out.printf("%d x %d = %d\n", n, i, n * i);
        }
    }

    public static void main(String[] args) {
        MultiplicationTable.print(5);
    }
}
