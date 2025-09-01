package org.design.patterns.iterator;

import java.util.List;

public class BackwardIterator <T> implements Iterator<T> {
    List<T> collection;
    int index = 0;

    public BackwardIterator(List<T> collection) {
        this.collection = collection;
        this.index = collection.size() - 1;
    }

    /**
     * @return
     */
    @Override
    public boolean hasNext() {
        if (index >= 0) {
            return true;
        }
        return false;
    }

    /**
     * @return
     */
    @Override
    public T next() {
        return collection.get(index--);
    }
}
