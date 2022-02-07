package test.example.duplicates2;

public class Test2 {

    public int subtract(int number) {
        return --number;
    }

    public int multiplyPositive(int x, int y) {
        if (y < 0 || x < 0) {
            return -1;
        }
        return x * y;
    }
}
