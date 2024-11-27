
public class Main {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        System.out.println(calculadora.somar(1,3));
        System.out.println(calculadora.subtrair(6,2));
        System.out.println(calculadora.multiplicar(3,3));
        System.out.println(calculadora.dividir(6,4));
        System.out.println("*****Fibonacci*****");
        System.out.println(Fibo.encontrarElemento(20));

    }
}