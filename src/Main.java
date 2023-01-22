import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> texts = Arrays.asList("One", "Five", "Two", "Three", "Eight", "Four", "Five", "Six", "Seven",
                "Eight", "Six", "Nine", "Ten", "Five", "Five");

        System.out.println(countOccurance(texts, "Five"));
        System.out.println(countOccurance(texts, "Yes"));


        Integer[] ints = new Integer[2];
        ints[0] = 0;
        ints[1] = 1;
        System.out.println(toList(ints));

        String[] strings = new String[2];
        strings[0] = "string 1";
        strings[1] = "string 2";
        System.out.println(toList(strings));

        List<Integer> numbers = Arrays.asList(1, 1, 2, 3, 4, 5, 5, 5, 6, 6, 7, 7, 0, 0, 0);
        System.out.println(findUnique(numbers));
    }

    private static long countOccurance(List<String> texts, String line) {
        if (line == null) {
            throw new RuntimeException("Line is null");
        }
        return texts.stream()
                .filter(line::equals)
                .count();
    }

    private static <T> List<T> toList(T[] array) {
        return Arrays.stream(array).toList();
    }

    private static List<Integer> findUnique(List<Integer> numbers) {
        return numbers.stream().distinct().toList();
    }
}

