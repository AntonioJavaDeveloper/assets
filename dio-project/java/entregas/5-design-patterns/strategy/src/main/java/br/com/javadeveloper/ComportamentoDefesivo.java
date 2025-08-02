package br.com.javadeveloper;

public class ComportamentoDefesivo implements Comportamento{
    @Override
    public void mover() {
        System.out.println("Movendo defensivamente...");
    }
}
