package training.advent;

public class Apple implements Countable {

    String color;

    Apple() {
        this.color = "red";
    }
    Apple(String color) {
        this.color = color;
    }

    @Override
    public int getCount() {
        return 2;
    }
}
