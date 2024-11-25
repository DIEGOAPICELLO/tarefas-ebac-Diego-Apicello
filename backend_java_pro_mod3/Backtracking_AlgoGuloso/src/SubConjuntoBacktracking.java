import java.util.ArrayList;
import java.util.List;

public class SubConjuntoBacktracking {

    public static List<List<Integer>> encontrarSubconjunto(int[] S, int n) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(S, n, 0, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(int[] s, int n, int inicio, List<Integer> subconjuntoAtual, List<List<Integer>> result) {
        if (subconjuntoAtual.size() == n) {
            result.add(new ArrayList<>(subconjuntoAtual));
            return;
        }
        if (subconjuntoAtual.size() + (s.length - inicio) < n) {
            return;
        }

        for (int i = inicio; i < s.length; i++) {
            subconjuntoAtual.add(s[i]);
            backtrack(s, n, i + 1, subconjuntoAtual, result);
            subconjuntoAtual.remove(subconjuntoAtual.size() - 1);
        }
    }
}
