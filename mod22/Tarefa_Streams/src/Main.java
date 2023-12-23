import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.util.stream.Collectors.toList;

public class Main {
    public static void main(String[] args) {

        List<Pessoa> listaDePessoas = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira as informações das pessoas (Digite 'sair' para encerrar):");
        while (true) {
            System.out.println("Nome:" );
            String nome = sc.nextLine();
            if(nome.equalsIgnoreCase("sair")){
                break;
            }
            System.out.println("Sexo: (M/F) ");
            char sexoChar = sc.nextLine().toUpperCase().charAt(0);
            Sexo sexo = (sexoChar == 'M') ? Sexo.MASCULINO : Sexo.FEMININO;

            listaDePessoas.add(new Pessoa(nome, sexo));
        }
        System.out.println("Lista de Pessoas: " + listaDePessoas);

        List<Pessoa> listaFeminina = listaDePessoas.stream()
                .filter(pessoa -> pessoa.getSexo().equals("FEMININO"))
                .toList();
        System.out.println("Lista de Mulheres: ");

        listaFeminina.forEach(pessoa -> System.out.println(pessoa.getName()));

    }
}
