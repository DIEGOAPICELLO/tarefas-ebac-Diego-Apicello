package domain;

public class Produt {

    private Long id;
    private String cod;
    private String name;
    private double price;

    public Produt() {
    }

    public Produt(Long id, String cod, String name, double price) {
        this.id = id;
        this.cod = cod;
        this.name = name;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
