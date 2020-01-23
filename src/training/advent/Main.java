package training.advent;

public class Main {

    public static void main(String[] args) {

        Counter<Apple> appleCounter = new Counter<>();

        appleCounter.add(new Apple("green"));
        appleCounter.add(new Apple("green"));
        appleCounter.add(new Apple());
        appleCounter.add(new Apple());
        appleCounter.add(new Apple());

        System.out.println(appleCounter.getCount(apple -> apple.color.equals("red")));
        System.out.println(appleCounter.getCount(apple -> apple.color.equals("green")));

    }
}
