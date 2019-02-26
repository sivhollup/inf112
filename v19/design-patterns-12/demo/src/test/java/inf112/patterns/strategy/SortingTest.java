package inf112.patterns.strategy;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class SortingTest {

    @Test
    public void canSortAllKinds() {
        List<Integer> unsorted = Arrays.asList(3, 4, 1, 3, 4, 5);

        SorterStrategy strategy = new BasicSorter();
        List sorted = strategy.sort(unsorted);

        strategy = new PlacementRetainedSorter();
        List sortedAdvanced = strategy.sort(unsorted);
    }
}
