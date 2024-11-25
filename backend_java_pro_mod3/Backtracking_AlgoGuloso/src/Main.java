import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] S1 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        int n1 = 2;
        System.out.println("Teste 1: S = [1,2,3,4,5,6,7,8,9,10,11,12,13,14], n = 2");
        List<List<Integer>> result1 = SubConjuntoBacktracking.encontrarSubconjunto(S1, n1);
        System.out.println("Saída: " + result1);
        System.out.println("************************");
        System.out.println("Teste 2: S = [1,2,3,4,5,6,7,8,9,10], n = 1");
        int[] S2 = {1,2,3,4,5,6,7,8,9,10};
        int n2 = 1;
        List<List<Integer>> result2 = SubConjuntoBacktracking.encontrarSubconjunto(S2, n2);
        System.out.println(result2);
    }
}