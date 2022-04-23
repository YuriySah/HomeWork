package Lesson_8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UniqueWords {
    public static void main(String[] args) {
        List<String> employeeSpec = Arrays.asList(
                "QA", "JavaAQA", "JavaDev", "JS Dev", "PM", "JS Dev", "Python Dev", "JS Dev", "QA", "JavaAQA",
                "QA", "QA", "JavaDev", "Python AQA", "JavaAQA", "Python Dev", "JavaDev", "JS Dev", "PM", "JavaDev");

        Set<String> uniqueSpec = new HashSet<>(employeeSpec);
        System.out.println("Список уникальных слов:");
        System.out.println(uniqueSpec);
        System.out.println("Количество повторений:");
        countUniqueWords(employeeSpec);
    }

    private static void countUniqueWords(List<String> employeeSpec) {

        Map<String, Long> countSpec =
                employeeSpec.stream().collect(Collectors.groupingBy(
                        Function.identity(), Collectors.counting()));

        for (Map.Entry<String, Long> entry : countSpec.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue() + "раз");
        }
    }
}
