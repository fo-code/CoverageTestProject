package test.example.duplicates;

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

    public void b() {
        System.out.println("test");
    }

    public void c() {
        System.out.println("test");
    }

    public void d() {
        System.out.println("test");
    }
}
