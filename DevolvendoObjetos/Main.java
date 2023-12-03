package DevolvendoObjetos;

public class Main {
    public static void main(String [] args){
        DevolveObjetos ob1 = new DevolveObjetos(2);
        DevolveObjetos ob2;

        System.out.println(ob1);
        ob2 = ob1.soma10();
        System.out.println(ob2);
        ob2 = ob2.soma10();
        System.out.println(ob2);
    }
}
