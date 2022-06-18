import java.util.*;

public class Randoms implements Iterable<Integer> {
    private final int min;
    private final int max;

    Randoms(int min, int max) {
        this.max = max;
        this.min = min;
    }

    public int generate() {

        return new Random().nextInt(max - min) + min + 1;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new ImplIterator();
    }


    private class ImplIterator implements Iterator<Integer> {
        @Override
        public boolean hasNext() {
            return true;
        }

        @Override
        public Integer next() {
            return generate();
        }
    }
}