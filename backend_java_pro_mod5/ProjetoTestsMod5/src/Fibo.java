public class Fibo {

    public static int encontrarElemento(int n){
        if (n <= 1){
            return n;
        }
        return encontrarElemento(n-1) + encontrarElemento(n -2);
    }
}
