import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class FrequencyCounter {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 1, 2, 3, 4, 4, 4, 1, 2, 1, 4};
        Integer mostFrequentNumber = findMostFrequentNumber(array);
        System.out.println("Most frequent number: " + mostFrequentNumber);
    }

    public static Integer findMostFrequentNumber(Integer[] array) {
        Map<Integer, Long> frequencyMap = Arrays.stream(array)
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()));

        Optional<Map.Entry<Integer, Long>> maxEntry = frequencyMap.entrySet().stream()
                .max(Map.Entry.comparingByValue());

        return maxEntry.map(Map.Entry::getKey).orElse(null);
    }
}
