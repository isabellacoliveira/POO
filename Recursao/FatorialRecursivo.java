package Recursao;

public class FatorialRecursivo {
    public long fatorial(int n){
        if (n == 0) return 1;
        return n * fatorial(n - 1);
    }
}
