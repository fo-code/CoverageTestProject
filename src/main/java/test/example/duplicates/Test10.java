package test.example.duplicates;

public class Test10 {

    public void test() {
        System.out.println();
    }

    public void testNew(int x) {
        if (x > 0) {
            System.out.println(x);
        } else if (x < 0) {
            System.out.println(x * x);
        } else {
            System.out.println(0);
        }
    }

    public void b() {
        System.out.println("test");
    }

    public void b1() {
        System.out.println("test");
    }

}
