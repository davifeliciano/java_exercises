import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Intersection {
    public static <T> Set<T> from_arrays(T[] array1, T[] array2) {
        Set<T> array1_members = new HashSet<T>(Arrays.asList(array1));
        Set<T> array2_members = new HashSet<T>(Arrays.asList(array2));
        Set<T> intersection = new HashSet<T>(array1_members);
        intersection.retainAll(array2_members);
        return intersection;
    }

    public static void main(String[] args) {
        String[] array1 = { "Morango", "Banana", "Maçã", "Uva", "Caqui" };
        String[] array2 = { "Manga", "Caqui", "Morango", "Amora" };
        Set<String> intersection = Intersection.from_arrays(array1, array2);
        System.out.println(intersection);
    }
}
