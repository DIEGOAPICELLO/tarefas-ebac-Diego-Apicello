import java.util.Objects;

public class Pessoas {

    private String name;
    private String sexo;

    public Pessoas (){

    }

    public Pessoas(String name, String sexo) {
        this.name = name;
        this.sexo = sexo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoas pessoas = (Pessoas) o;
        return Objects.equals(name, pessoas.name) && Objects.equals(sexo, pessoas.sexo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sexo);
    }

    @Override
    public String toString() {
        return "Pessoas{" +
                "name='" + name + '\'' +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}
