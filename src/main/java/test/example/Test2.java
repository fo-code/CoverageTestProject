package test.example;

public class Test2 {

    public int substract(int number) {
        return --number;
    }

    public int multiplyPositive(int x, int y) {
        System.out.println();
        if (y < 0 || x < 0) {
            return -1;
        }
        return x * y;
    }
}
