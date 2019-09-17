public class Test {
    public static void main(String[] args) {
//        Counter sc = new Counter();
//        for (int num = 1; num <= 5; num++) {
//            sc.count(num);
//            sc.show();
//        }
        increaseNum(10);
    }

    static void increaseNum(int time){
        Counter sc = new Counter();
        int num = 1;
        for(; num <= time; num++) {
            sc.count(num);
            sc.show();
        }
    }
}
