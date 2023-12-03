class A {
    A() {  
        System.out.println("Construtor default de A");
    }
    
    A(int arg) {   
        this();
        System.out.println("Construtor de A com argumento: " + arg);  
    } 
    
    void a1() {      
        System.out.println("Método a1 de A");  
    }  
    
    void a2() {     
        System.out.println("Método a2 de A");  
    }
}
