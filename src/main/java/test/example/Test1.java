package test.example;

public class Test1 {

    public int increase(int number) {
        return ++number;
    }

    public int divide(int x, int y) {
        if (y == 0) {
            return -1;
        }
        return x / y;
    }

    public int decrease(int number) {
        return --number;
    }

    public int multiplyPositive(int x, int y) {
        if (y < 0 || x < 0) {
            return -1;
        }
        return x * y;
    }
}
