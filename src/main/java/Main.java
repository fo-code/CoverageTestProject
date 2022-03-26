import test.example.Test1;
import test.example.Test2;

public class Main {

    public static void main(String... args) {
        Test1 test1 = new Test1();
        System.out.println(test1.divide(4, 2));
        Test2 test2 = new Test2();
        System.out.println(test2.decrease(3));
    }
}
