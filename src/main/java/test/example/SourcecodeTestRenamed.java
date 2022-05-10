package test.example;

public class SourcecodeTestRenamed {

    /**
     * Comment.
     */
    private int x;
    private int y;

    public int increase(int number) {
        return ++number;
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

    public void print() {
        System.out.println("Hallo");
    }
}
