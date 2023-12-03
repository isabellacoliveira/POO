package DevolvendoObjetos;

public class DevolveObjetos {
    private int a;

    public DevolveObjetos(int a) {
        this.a = a;
    }

    public String toString(){
        return "a = " + a;
    }

    public DevolveObjetos soma10(){
        DevolveObjetos temp = new DevolveObjetos(a + 10);
        return temp;
    }
}
