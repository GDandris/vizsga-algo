package com.codecool.sum_of_odd_numbers;

import java.util.List;

public class OddNumbers {

    public static Integer sum(List<Integer> numbers) {
        return numbers
                .stream()
                .filter(i -> i % 2 != 0)
                .mapToInt(Integer::intValue)
                .sum();
    }
}