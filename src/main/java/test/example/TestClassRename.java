package test.example;

public class TestClassRename {

    /**
     * Comment.
     */
    private int x;
    private int y;

    public int increase(int number) {
        return ++number;
    }

    public void doSomething() {
        System.out.println("Hello");
    }


    public int divide(int x, int y) {
        if (y == 0 || y < 0) {
            return -1;
        }
        return x / y;
    }

    public int multiplyPositive(int x, int y) {
        if (y < 0 || x < 0) {
            return -1;
        }
        return x * y;
    }

    public void test2() {
        System.out.println();
    }

    public void xx(final boolean v) {
        if (v) {
            System.out.println("Here");
        }
        System.out.println();
    }

    public void yy() {
        System.out.println();
    }
}
