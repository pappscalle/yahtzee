package se.tastebin.utils;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class OccurrencesOfAKind {

    private final List<Integer> values;
    private final int number;

    public OccurrencesOfAKind(List<Integer> values, int number) {
        this.values = Objects.requireNonNull(values);
        this.number = Objects.requireNonNull(number);
    }
    
    public int value() {
        return values.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .filter(val -> Collections.frequency(values, val) >= number)
                .findFirst()
                .orElse(0);
    }
    
}
