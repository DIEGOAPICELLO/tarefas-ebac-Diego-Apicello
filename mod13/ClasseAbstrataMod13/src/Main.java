import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        PessoaFisica pessoaFisica = new PessoaFisica("Diego" , "Masculino");
        pessoaFisica.setCPF("000.000.000-00");
        PessoaJuridica pessoaJuridica = new PessoaJuridica("Diego1", "Masculino");
        pessoaJuridica.setCNPJ("00.000.000.0001.00");

        System.out.println(pessoaFisica);
        System.out.println(pessoaJuridica);

    }
}