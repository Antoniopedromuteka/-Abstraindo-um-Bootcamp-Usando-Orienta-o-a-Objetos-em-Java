import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){

        Curso curso1 = new Curso();
        Curso curso2 = new Curso();

        Mentoria mentoria = new Mentoria();

        curso1.setTitulo("Curso java");
        curso1.setDescricao("descrição curso de JAVA");
        curso1.setCargaHoraria(8);

        curso2.setTitulo("Curso C#");
        curso2.setDescricao("descrição curso de C#");
        curso2.setCargaHoraria(8);


        mentoria.setTitulo("mentoria Java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());


        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);


        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMuteka = new Dev();
        devMuteka.setNome("Muteka");
        devMuteka.inscreverBootcamp(bootcamp);

        System.out.println("Conteudos Inscritos Muteka" + devMuteka.getConteudosInscritos());
        devMuteka.progredir();
        devMuteka.progredir();

        System.out.println("XP:" + devMuteka.calcularTotalXp());

        System.out.println("---------------");


        System.out.println("Conteudos Inscritos Muteka" + devMuteka.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Muteka" + devMuteka.getConteudosConcluidos());


        Dev devFabio = new Dev();
        devFabio.setNome("Fábio");
        devFabio.inscreverBootcamp(bootcamp);
        devFabio.progredir();
        devFabio.progredir();
        devFabio.progredir();
        System.out.println("Conteudos Inscritos Fábio" + devFabio.getConteudosInscritos());
        System.out.println("XP:" + devFabio.calcularTotalXp());




        System.out.println("---------------");

        System.out.println("Conteudos Inscritos Fábio" + devFabio.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Fábio" + devFabio.getConteudosConcluidos());






    }
}
