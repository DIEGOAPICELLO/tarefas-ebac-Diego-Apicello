/**
 * Classe que representa uma calculadora simples
 * Operações matemáticas básicas: soma, subtração, multiplicação e divisão.
 */

public class Calculadora {

    /**
     * Realiza a soma de dois números inteiros
     * @param a o primeiro número
     * @param b o segundo número
     * @return a soma de a e b
     */
    public int somar(int a, int b) {
        return a + b;
    }

    /**
     * Realiza a subtração de dois números inteiros
     * @param a o primeiro número
     * @param b o segundo número
     * @return a subtração de a e b
     */
    public int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Realiza a multiplicação de dois números inteiros
     * @param a o primeiro número
     * @param b o segundo número
     * @return a multiplicação de a e b
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Realiza a divisão de dois números inteiros
     * @param a o primeiro número
     * @param b o segundo número
     * @return a divisão de a e b
     * @throws IllegalArgumentException se b ou a for zero
     */
    public int dividir(int a, int b) {
        if (b == 0 || a == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida.");
        }
        return a / b;
    }
}
