package opgave02.models;

import java.util.Iterator;

public class Range implements Iterable<Integer>{
    private int from;
    private int to;

    public Range(int from, int to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public Iterator<Integer> iterator() {
        Iterator<Integer> rangeInterator = new RangeIterator(from, to);
        return rangeInterator;
    }
}
