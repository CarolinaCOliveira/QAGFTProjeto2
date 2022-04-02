package Projeto2;

import java.time.LocalDate;

public class Main {
    public static void main(String [] args) {
        Curso curso1 = new Curso ();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Do nível básico ao avançado");
        curso1.setCargaHoraria(30);

        Curso curso2 = new Curso ();
        curso2.setTitulo("Curso PHP");
        curso2.setDescricao("Aprendendo a trabalhar com PHP");
        curso2.setCargaHoraria(10);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Projeto de POO e Bootcamp em Java");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Venha ser Java Developer conosco, mais de 140 horas de aula orientadas!!");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        System.out.println("-".repeat(200));
        System.out.println(" ".repeat(40) + "DESENVOLVEDORES E PROGRESSÃO - BOOTCAMP JAVA DEVELOPER #1");
        System.out.println("-".repeat(200));
        System.out.println(" ".repeat(100));

        Dev devCarolina = new Dev();
        devCarolina.setNome(" ".repeat(60) + "Carolina Oliveira");
        devCarolina.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Carolina Oliveira: " + devCarolina.getConteudosInscritos());
        devCarolina.progredir();
        System.out.println(" ".repeat(100));
        System.out.println("Conteúdos Inscritos após Progressão Carolina Oliveira: " + devCarolina.getConteudosInscritos());
        System.out.println(" ".repeat(100));
        System.out.println("Conteúdos Concluídos Carolina Oliveira: " + devCarolina.getConteudosConcluidos());
        System.out.println("XP: " + devCarolina.calcularTotalXp());

        System.out.println(" ".repeat(100));
        System.out.println("-".repeat(200));
        System.out.println(" ".repeat(100));

        Dev devAfonso = new Dev();
        devAfonso.setNome(" ".repeat(60) + "Afonso Ferreira");
        devAfonso.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Afonso Ferreira: " + devAfonso.getConteudosInscritos());
        devAfonso.progredir();
        System.out.println(" ".repeat(100));
        System.out.println("Conteúdos Inscritos após Progressão Afonso Ferreira: " + devAfonso.getConteudosInscritos());
        System.out.println(" ".repeat(100));
        System.out.println("Conteúdos Concluídos Afonso Ferreira: " + devAfonso.getConteudosConcluidos());
        System.out.println("XP: " + devAfonso.calcularTotalXp());





    }
}
