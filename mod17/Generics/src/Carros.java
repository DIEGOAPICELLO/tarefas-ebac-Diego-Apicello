public class Carros {

    private String marca;
    private String modelo;

    public Carros(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }


    @Override
    public String toString() {
        return marca + " " + modelo;
    }

}
