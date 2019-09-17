public class Counter {
    private int counter = 0;

    void count(int num) {
        counter += num;
    }

    void show() {
        System.out.println(counter);
    }
}
