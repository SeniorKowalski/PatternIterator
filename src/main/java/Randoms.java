import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {

    protected static Random random = new Random();
    private static int min;
    private static int max;

    public Randoms(int min, int max) {
        Randoms.min = min;
        Randoms.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new RandomsIterator();
    }

    private static class RandomsIterator implements Iterator<Integer> {

        @Override
        public boolean hasNext() {
            return true;
        }

        @Override
        public Integer next() {
            return random.nextInt((max - min) + 1) + min;
        }
    }
}