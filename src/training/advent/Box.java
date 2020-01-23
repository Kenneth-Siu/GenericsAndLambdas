package training.advent;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Countable> implements Countable {
    private List<T> contents = new ArrayList<>();

    void add(T item) {
        contents.add(item);
    }

    @Override
    public int getCount() {
        int totalCount = 0;
        for (T item : contents) {
            totalCount += item.getCount();
        }
        return totalCount;
    }
}
