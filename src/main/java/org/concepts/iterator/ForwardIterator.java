package org.concepts.iterator;

import java.util.ArrayList;
import java.util.List;

public class ForwardIterator<T> implements Iterator<T> {
    List<T> collection;
    int index = 0;

    public ForwardIterator(List<T> collection) {
        this.collection = collection;
    }

    /**
     * @return
     */
    @Override
    public boolean hasNext() {
        if (index < collection.size()) {
            return true;
        }
        return false;
    }

    /**
     * @return
     */
    @Override
    public T next() {
        return collection.get(index++);
    }
}
