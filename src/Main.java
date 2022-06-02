import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase(Locale.ROOT);
        String[] words = str.split("\\s+");
        Map<String, Long> stringLongMap = Arrays.asList(words).stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        List<Map.Entry<String, Long>> entryList = new ArrayList<>(stringLongMap.entrySet());
        entryList.sort(Map.Entry.comparingByValue());
        System.out.println(entryList);
    }
}