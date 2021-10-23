package test.example;

public class Test1 {

    public int increase(int number) {
        return ++number;
    }

    public int devide(int x, int y) {
        System.out.println();
        if (y == 0) {
            return -1;
        }
        return x / y;
    }
}
