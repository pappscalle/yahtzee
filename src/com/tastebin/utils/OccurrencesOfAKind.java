package com.tastebin.utils;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OccurrencesOfAKind {

    private final List<Integer> values;
    private final int number;

    public OccurrencesOfAKind(List<Integer> values, int number) {
        this.values = values;
        this.number = number;
    }
    
    
    public int value() {
        
        return values.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .filter(val -> Collections.frequency(values, val) >= number)
                .findFirst()
                .orElse(0);
        
    }
    
//    public int value() {
//
//        List<Integer> sorted = values.stream()
//                      .sorted(Comparator.reverseOrder())
//                      .collect(Collectors.toList());
//
//        int old = sorted.get(0);
//        int count = 1;
//        for (int i = 1; i < sorted.size(); i++) {
//            int current = sorted.get(i);
//            if (old != current) {
//                old = current;
//                count = 1;
//            } else {
//                count++;
//                if (count == number) {
//                    return old;
//                }
//            }
//        }
//        return 0;
//    }
}
