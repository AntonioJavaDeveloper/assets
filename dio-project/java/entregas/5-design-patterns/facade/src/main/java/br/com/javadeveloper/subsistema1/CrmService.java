package br.com.javadeveloper.subsistema1;

public class CrmService {
    private CrmService() {}

    public static void gravarCliente(String nome, String cep, String cidade, String estado) {
        System.out.println("Cliente gravado no sistema CRM");
        System.out.println("Nome: " + nome);
        System.out.println("CEP: " + cep);
        System.out.println("Cidade: " + cidade);
        System.out.println("Estado: " + estado);
    }
}
