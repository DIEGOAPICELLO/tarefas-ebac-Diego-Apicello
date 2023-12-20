@Tabela(name = "nome")
public class ClasseTabela {

    public ClasseTabela(){}
    public ClasseTabela(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ClasseTabela{" +
                "name='" + name + '\'' +
                '}';
    }
}
