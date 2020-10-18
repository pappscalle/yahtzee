package se.tastebin.table.utils;

import java.util.AbstractList;
import java.util.List;
import java.util.Objects;

public class MergedList<T> extends AbstractList<T>{

    private final T value;
    private final List<T> list;
    
    public MergedList(T value, List<T> list) {
        this.value = Objects.requireNonNull(value);
        this.list = Objects.requireNonNull(list);
    }
    
    @Override
    public T get(int index) {
       return index == 0 ? value : list.get(index - 1);
    }

    @Override
    public int size() {
        return list.size() + 1;
    }
    
}
