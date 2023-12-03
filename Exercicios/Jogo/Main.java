public class Main {
    public static void main(String[] args) {
        C c1 = new C();
        c1.a1();
        c1.b2();
        c1.c1();

        System.out.println();

        C c2 = new C(42);
        c2.a1();
        c2.b2();
        c2.c1();
    }
}
