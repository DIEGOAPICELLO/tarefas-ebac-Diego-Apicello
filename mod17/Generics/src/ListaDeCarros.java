import java.util.ArrayList;
import java.util.List;

class ListaDeCarros<T extends Carros> {
    private List<T> carros;

    public ListaDeCarros() {
        this.carros = new ArrayList<>();
    }

    public void adicionarCarro(T carro) {
        carros.add(carro);
    }

    public void exibirCarros() {
        for (T carro : carros) {
            System.out.println(carro);
        }
    }

}
