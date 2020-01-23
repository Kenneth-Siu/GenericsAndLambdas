package training.advent;

import java.util.ArrayList;
import java.util.List;

public class Cart implements Countable {
    private List<Box> boxes = new ArrayList<>();

    void add(Box box){
        boxes.add(box);
    }

    @Override
    public int getCount() {
        int totalCount = 0;
        for (Box box : boxes) {
            totalCount += box.getCount();
        }
        return totalCount;
    }
}
