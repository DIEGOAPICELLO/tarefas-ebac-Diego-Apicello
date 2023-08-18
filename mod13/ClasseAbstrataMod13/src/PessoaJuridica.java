public class PessoaJuridica extends Pessoa{
    
    private String CNPJ;

    public PessoaJuridica(String name, String gender) {
        super(name, gender);
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    @Override
    public String toString() {
        return "Pessoa Juridica: " +
                this.getName() + ", " +
                this.getGender() + ", " +
                CNPJ;
    }
}
