public class Main {
    public static void main(String args[]) {
        ExampleFirst();
        ExampleSecond();
        ExampleThird();
    }

    public static void ExampleSecond() {
        ExampleSecond es = new ExampleSecond();
        ExampleSecond.start();
    }
    public static void ExampleFirst() {
        ExampleFirst ef = new ExampleFirst();
        ExampleFirst.start();
    }
    public static void ExampleThird() {
        ExampleThird et = new ExampleThird();
        ExampleThird.start();
    }
}

