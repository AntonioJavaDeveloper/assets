import br.com.javadeveloper.desafio.dominio.Bootcamp;
import br.com.javadeveloper.desafio.dominio.Conteudo;
import br.com.javadeveloper.desafio.dominio.Curso;
import br.com.javadeveloper.desafio.dominio.Dev;
import br.com.javadeveloper.desafio.dominio.Mentoria;

import java.sql.SQLOutput;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso de Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição Curso de JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descriçã mentoria Java");
        mentoria.setData(LocalDate.now());


//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Dev 1");
        dev1.inscreverBootCamp(bootcamp);
        System.out.println("Conteúdos inscritos do Dev 1: " + dev1.getConteudosInscritos());
        dev1.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos do Dev 1: " + dev1.getConteudosInscritos());
        System.out.println("Conteúdos concluídos do Dev 1: " + dev1.getConteudosConcluidos());
        System.out.println("Total XP do Dev 1: " + dev1.calcularTotalXp());

        System.out.println("------------- X -------------");

        Dev dev2 = new Dev();
        dev2.setNome("Dev 2");
        dev2.inscreverBootCamp(bootcamp);
        System.out.println("Conteúdos inscritos do Dev 2: " + dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos do Dev 2: " + dev2.getConteudosInscritos());
        System.out.println("Conteúdos concluídos do Dev 2: " + dev2.getConteudosConcluidos());
        System.out.println("Total XP do Dev 2: " + dev2.calcularTotalXp());
    }
}