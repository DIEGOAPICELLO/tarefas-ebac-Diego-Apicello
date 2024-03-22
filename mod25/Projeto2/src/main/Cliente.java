package main;

public class Cliente {
   private Long CPF, tel;
   private String name, end, cidade, estado;
   private Integer numero;

   public Cliente(){}

    public Cliente(Long CPF, Long tel, String name, String end, String cidade, String estado, Integer numero) {
        this.CPF = CPF;
        this.tel = tel;
        this.name = name;
        this.end = end;
        this.cidade = cidade;
        this.estado = estado;
        this.numero = numero;
    }

    public Long getCPF() {
        return CPF;
    }

    public void setCPF(Long CPF) {
        this.CPF = CPF;
    }

    public Long getTel() {
        return tel;
    }

    public void setTel(Long tel) {
        this.tel = tel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
}
