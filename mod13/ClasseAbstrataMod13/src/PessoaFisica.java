public class PessoaFisica extends Pessoa{

    private String CPF;

    public PessoaFisica(String name, String gender) {
        super(name, gender);
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    @Override
    public String toString() {
        return "Pessoa Fisica: " +
                this.getName() + ", " +
                this.getGender() + ", " +
                CPF;
    }
}
