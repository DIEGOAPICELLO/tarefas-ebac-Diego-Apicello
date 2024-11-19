public class Factorial {

    public static long calcularFatorial(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }
        return number * calcularFatorial(number -1);
    }

    /**
     * Quanto ao cálculo do fatorial de um número acima de 100 com solução recursiva, não é recomendado devido a dois problemas principais:

     Estouro de pilha (StackOverflowError): A recursão criará muitas chamadas de método, excedendo o limite da pilha de execução.
     Limite de representação numérica: O tipo long suporta números até aproximadamente 20 dígitos. Fatoriais de números grandes ultrapassam esse limite, causando overflow.

     Para calcular fatoriais de números muito grandes, seria necessário usar:

     Biblioteca BigInteger para representação numérica
     Abordagem iterativa
     Algoritmos especializados para cálculos com números extremamente grandes */

}
