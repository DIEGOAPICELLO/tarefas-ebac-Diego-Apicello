public class Main {
    public static void main(String[] args) {

        System.out.println("**********SOLUÇÃO RECURSIVA**********");
        System.out.println("Fatorial de 3: " + Factorial.calcularFatorial(3));
        System.out.println("Fatorial de 7: " + Factorial.calcularFatorial(7));
        System.out.println("Fatorial de 9: " + Factorial.calcularFatorial(9));

        System.out.println("**********PROGRAMAÇÃO DINAMICA**********");

        int n = 7;
        long[] memo = new long[n + 1];

        System.out.println("Top-Down: " + FactorialDP.factorialTopDown(n, memo));
        System.out.println("Bottom-Up: " + FactorialDP.factorialBottomUp(n));

    }
}