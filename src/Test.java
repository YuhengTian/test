public class Test {
    public static void main(String[] args) {
        Counter sc = new Counter();
        for (int num = 1; num <= 5; num++) {
            sc.count(num);
            sc.show();
        }
    }
}
