public class ExampleSecond {
    public static void start() {
        A superOb = new A();
        B subOb = new B();
// суперкласс може т исполь зоваться самостоятельно
        superOb.i = 10;
        superOb.j = 20;
        System.out.println(" Coдepжимoe объекта supe rOb : ");
        superOb.showij();
        System.out.println();
/* Подкласс име ет доступ ко всем открытым членам
своего суперкласса . */
        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println(" Coдepжимoe объекта subOb : ");
        subOb.showij();
        subOb.showk();
        System.out.println();
        System.out.println("Cyммa i, j и k в объекте subOb:");
        subOb.sum();
    }
}
