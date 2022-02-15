package br.com.meubuscadordecep.cliente;

import br.com.meubuscadordecep.dominio.Endereco;
import br.com.meubuscadordecep.viacep.ServicoDeCep;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe seu CEP: ");
        String cep = sc.nextLine();
        Endereco endereco = ServicoDeCep.buscaEnderecoPelo(cep);

        System.out.println("Logradouro: " + endereco.getLogradouro());
        System.out.println("Complemento: " + endereco.getComplemento());
        System.out.println("Bairro: " + endereco.getBairro());
        System.out.println("Localidade: " + endereco.getLocalidade());
        System.out.println("Uf: " + endereco.getUf());
    }


}

//TODO: Autor: Leandro de Barros