package test.example;

public class Test1 {

    public int increase(int number) {
        return ++number;
    }

    public int devide(int x, int y) {
        if (y == 0) {
            return -1;
        }
        return x / y;
    }

    public void test(int i) {
        if (i > 0 || i < 0) {
            System.out.println();
        }
        else {
            System.out.println("Test");
        }
    }

    public void test2() {
        System.out.println();
        System.out.println();
        System.out.println("Test");
    }

    public void doSth() {
        int x = 4;
        System.out.println(x);
    }
}
