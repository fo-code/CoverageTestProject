package test.example;

public class Test2 {

    public int subtract(int number) {
        return --number;
    }

    public int multiplyPositive(int x, int y) {
        System.out.println(5);
        if (y < 0 || x < 0) {
            return -1;
        }
        return x * y;
    }
}
