package br.com.javadeveloper.subsistema2;

public class CepApi {
    private static final CepApi instance = new CepApi();

    private CepApi() {}

    public static CepApi getInstance() {
        return instance;
    }

    public String recuperarCidade(String cep) {
        return "Itaboraí";
    }

    public String recuperarEstado(String cep) {
        return "RJ";
    }
}
