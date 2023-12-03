class B extends A {
    B() {
        super();
        System.out.println("Construtor default de B");
    }

    B(int arg) {
        super(arg);
        System.out.println("Construtor de B com argumento: " + arg);
    }

    @Override
    void a1() {
        super.a1();
        System.out.println("Método a1 de B");
    }

    void b2() {
        System.out.println("Método b2 de B");
    }
}
