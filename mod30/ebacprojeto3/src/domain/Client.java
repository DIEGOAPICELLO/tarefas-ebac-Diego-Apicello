package domain;

public class Client {

    private Long id;
    private String cod;
    private String name;

    public Client(Long id, String cod, String name) {
        this.id = id;
        this.cod = cod;
        this.name = name;
    }

    public Client() {
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
}
