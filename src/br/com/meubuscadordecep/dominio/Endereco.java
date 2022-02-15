package br.com.meubuscadordecep.dominio;

public class Endereco {
    String logradouro;
    String complemento;
    String bairro;
    String localidade;
    String uf;

    public String getLogradouro() {
        return logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public String getUf() {
        return uf;
    }

    @Override
    public String toString() {
        return "Endereco{" + "logradouro=" + logradouro + ", complemento:" + complemento + ", bairro=" + bairro + ", localidade=" + localidade + ", uf:" + uf + '}';
    }
}
