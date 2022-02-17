package com.dio.gftQA;

import com.dio.gftQA.dominio.Bootcamp;
import com.dio.gftQA.dominio.Curso;
import com.dio.gftQA.dominio.Dev;
import com.dio.gftQA.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        final String devName = "Me";

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Um curso java dinâmico orientado a prática");
        curso1.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        Dev devMe = new Dev();
        devMe.setNome(devName);
        devMe.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos: " + devMe + " " + devMe.getConteudosInscritos());
        devMe.progredir();
        devMe.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos: " + devMe + " " + devMe.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos: " + devMe + " " + devMe.getConteudosConcluidos());
        System.out.println("XP:" + devMe.calcularTotalXP());

        System.out.println("------------------------------------------------------");
    }
}
