import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe os nomes separados por: ' , ' ");
        String nomes = sc.nextLine();
        List<Pessoas> listaPessoas = listaPorGenero(nomes);
        System.out.println("Lista separada por genero:");
        imprimirLista(listaPessoas);
        
    }

    private static List<Pessoas> listaPorGenero(String nomes) {
        String[] nomesInformados = nomes.split(",");
        List<Pessoas> listaPorGenero = new ArrayList<>();
        for (int i = 0; i < nomesInformados.length; i+=2) {
            String nome = nomesInformados[i].trim();
            String sexo = nomesInformados[i+1].trim();
            listaPorGenero.add(new Pessoas(nome, sexo));
        }
        return listaPorGenero;
    }

    public static void imprimirLista (List<Pessoas> listaPorGen) {
        List<Pessoas> mulher = new ArrayList<>();
        List<Pessoas> homem = new ArrayList<>();

        for (Pessoas pessoa : listaPorGen) {
            if (pessoa.getSexo().equalsIgnoreCase("F")) {
                mulher.add(pessoa);
            }else if (pessoa.getSexo().equalsIgnoreCase("M")){
                homem.add(pessoa);
            }
        }
        System.out.println("Mulheres:");
        for (Pessoas mulheres : mulher) {
            System.out.println(mulheres.getNome());
        }
        System.out.println("Homens:");
        for (Pessoas homens : homem) {
            System.out.println(homens.getNome());
        }
    }
}