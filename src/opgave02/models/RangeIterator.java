package opgave02.models;

import java.util.Iterator;

public class RangeIterator implements Iterator<Integer> {
    private int from;
    private int to;
    private int actual;

    public RangeIterator(int from, int to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public boolean hasNext() {
        if (from == to) {
            return false;
        }
        return true;
    }

    @Override
    public Integer next() {
        return from++;
    }
}
