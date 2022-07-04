package ru.skypro;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(List.of(10, 1, 1, 2, 3, 4, 7, 4, 5, 5, 6, 7, 10, 15, 11));
        // 1
        for (Integer num : nums) {
            if (Objects.nonNull(num) && num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println("\n");

        
        // 2
        Set<Integer> set = new TreeSet<>();
        for (Integer num : nums) {
            if (Objects.nonNull(num) && num % 2 == 0) {
                set.add(num);
            }
        }
        for (Integer num : set) {
            System.out.print(num + " ");
        }
        System.out.println("\n");

        // 3
        Set <String> words = new HashSet<>();
        words.add("Word3");
        words.add("Word3");
        words.add("Word4");
        words.add("WORD");
        words.add("Word4");
        words.add("Word5");
        words.add("WORD");
        for (String word : words) {
                System.out.println(word);
        }

        // 4
        List<String> words2 = List.of("Word3", "Word3", "Word4", "WORD", "Word4", "Word5", "WoRD");
        Map<String, Integer> result = new HashMap<>();
        for (String s : words2) {
            if (result.containsKey(s)) {
                result.put(s, result.get(s) + 1);
            } else {
                result.put(s, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey() + " --> " + entry.getValue());
        }
    }
}
