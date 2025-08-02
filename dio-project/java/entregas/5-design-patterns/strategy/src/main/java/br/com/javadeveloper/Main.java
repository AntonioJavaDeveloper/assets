package br.com.javadeveloper;

public class Main {
    public static void main(String[] args) {
        Comportamento agressivo = new ComportamentoAgressivo();
        Comportamento defesivo = new ComportamentoDefesivo();
        Comportamento normal = new ComportamentoNormal();

        Robo robo = new Robo();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defesivo);
        robo.mover();
        robo.mover();
    }
}