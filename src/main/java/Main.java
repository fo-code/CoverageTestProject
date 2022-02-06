public class Main {

    private String unused;

    public static void main(String... args) {
        returnOne();
        tmp2();
        tmp3();
        System.out.println();
    }

    public static int returnOne() {
        return 1;
    }

    public static void tmp2() {
        System.out.println(5);
    }

    public static void tmp3() {
        System.out.println(8);
    }
}
