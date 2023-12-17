import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        HondaCivic civic = new HondaCivic("Honda", "Civic" );
        FordFocus focus = new FordFocus("Ford", "Focus");


        ListaDeCarros<Carros> listaDeCarros = new ListaDeCarros<>();

        listaDeCarros.adicionarCarro(civic);
        listaDeCarros.adicionarCarro(focus);

        listaDeCarros.exibirCarros();

    }
}