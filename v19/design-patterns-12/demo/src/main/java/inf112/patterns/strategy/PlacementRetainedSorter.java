package inf112.patterns.strategy;

import java.util.List;

public class PlacementRetainedSorter implements SorterStrategy {
    @Override
    public List sort(List unsorted) {
        List sorted;

        return sortWithoutDestroyingOrderOnSameValueItems(unsorted);
    }

    private List sortWithoutDestroyingOrderOnSameValueItems(List unsorted) {

        // Fancy implementation here
        // Much code
        return unsorted; // Would return something else in reality
    }
}
