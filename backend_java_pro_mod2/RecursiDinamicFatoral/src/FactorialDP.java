public class FactorialDP {

    public static long factorialTopDown(int n, long[] memo) {
        if (n == 0 || n == 1) return 1;

        if (memo[n] != 0) return memo[n];

        memo[n] = n * factorialTopDown(n -1, memo);
        return memo[n];
    }

    public static long factorialBottomUp(int n){
        long[] dp = new long[n + 1];

        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = i * dp[i -1];
        }
        return dp[n];

        /**
         * Comparação das soluções:
         *
         * Top-Down (Memoization):
         * Usa recursão com memorização
         * Calcula valores sob demanda
         * Armazena resultados já calculados
         * Complexidade: O(n)
         * Overhead de chamadas recursivas
         *
         * Bottom-Up (Tabulação):
         * Iterativo e direto
         * Preenche tabela progressivamente
         * Calcula todos os valores de forma sequencial
         * Complexidade: O(n)
         * Mais eficiente em memória e performance
         *
         * Diferenças principais:
         *
         * Top-Down: recursivo, memorização
         * Bottom-Up: iterativo, tabulação
         *
         * Limitações para números grandes:
         * Ambas as soluções sofrem com overflow numérico
         * Não recomendado para fatoriais acima de 20
         */

        /**
         *A solução com programação dinâmica é melhor por três razões principais:

         1 - Eficiência Computacional
         Elimina recálculos redundantes
         Reduz complexidade de tempo de O(2^n) para O(n)
         Armazena resultados intermediários para reutilização


         2 - Otimização de Memória
         Evita múltiplas chamadas recursivas
         Diminui overhead de pilha de execução
         Utiliza memória de forma mais controlada


         3 - Desempenho
         Mais rápida que recursão tradicional
         Resolve problema de estouro de pilha
         Permite processamento de problemas maiores */

    }
}
