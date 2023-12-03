class C extends B {
    C() {
        super();
        System.out.println("Construtor default de C");
    }

    C(int arg) {
        super(arg);
        System.out.println("Construtor de C com argumento: " + arg);
    }

    @Override
    void a1() {
        super.a1();
        System.out.println("Método a1 de C");
    }

    void c1() {
        System.out.println("Método c1 de C");
    }
}
