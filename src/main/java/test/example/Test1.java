package test.example;

public class Test1 {

    /**
     * Comment.
     */
    private int x;

    public int increase(int number) {
        return ++number;
    }

    public void doSomething() {
        System.out.println("Hello");
    }


    public int divide(int x, int y) {
        if (y == 0 || y < 0) {
            System.out.println("Hello");
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

    public void printSomething() {
        System.out.println("Hello");
    }
}
