public class NumberPiramid {
    public static void print(int height) {
        for (int i = 1; i <= height; i++)
            System.out.println(Integer.toString(i).repeat(i));
    }

    public static void main(String[] args) {
        NumberPiramid.print(5);
    }
}
