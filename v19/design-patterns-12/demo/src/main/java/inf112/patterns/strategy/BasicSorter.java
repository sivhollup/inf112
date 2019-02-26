package inf112.patterns.strategy;

import java.util.List;

public class BasicSorter implements SorterStrategy {
    @Override
    public List sort(List unsorted) {
        //  Quick and dirty solver
        unsorted.sort(null);
        return unsorted;
    }
}
