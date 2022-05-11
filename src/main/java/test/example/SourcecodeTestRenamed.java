package test.example;

public class SourcecodeTestRenamed {

    /**
     * Comment.
     */
    private int x;
    private int y;

    public int increase(int number) {
        return ++number;
    }

    public void printHey() {
        System.out.println("Hey");
        System.out.println("Hey");
        System.out.println("Hey");
        System.out.println("Hey");
        System.out.println("Hey");
        System.out.println("Hey");
        System.out.println("Hey");
        System.out.println("Hey");
    }

    public void doSomething() {
        x = 5;
        y = 4;
        System.out.println(x + y);
    }

    public int divide(int x, int y) {
        if (y == 0 || y < 0) {
            return -1;
        }
        return x / y;
    }

    public void doSomethingElse() {
        System.out.println("Something");
    }

    public int multiplyPositive(int x, int y) {
        if (y < 0 || x < 0) {
            return -1;
        }
        return x * y;
    }

    public void printHallo() {
        System.out.println("Hallo");
    }

    public void print() {
        System.out.println("Hey");
        System.out.println("Here");
    }
}
