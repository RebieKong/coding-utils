package com.rebiekong.coding.items;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * @author RebieKong
 */
public class IteratorMerger<T> implements Iterator<T> {
    private final List<Iterator<T>> list = new ArrayList<>();

    public IteratorMerger(Collection<Iterator<T>> list) {
        this.list.addAll(list);
    }

    public void addIterator(Iterator<T> it) {
        list.add(it);
    }

    public void addIterator(Collection<Iterator<T>> its) {
        list.addAll(its);
    }

    @Override
    public boolean hasNext() {
        return list.stream().anyMatch(Iterator::hasNext);
    }

    @Override
    public T next() {
        for (Iterator<T> i : list) {
            if (i.hasNext()) {
                return i.next();
            }
        }
        return null;
    }
}
