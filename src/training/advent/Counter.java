package training.advent;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Counter<T extends Countable> {
    private List<T> list = new ArrayList<>();

    void add(T item) {
        list.add(item);
    }

    int getCount(Predicate<T> predicate) {
        return list.stream()
            .filter(predicate)
            .map(Countable::getCount)
            .reduce(0, (subtotal, next) -> subtotal + next);
    }
}
