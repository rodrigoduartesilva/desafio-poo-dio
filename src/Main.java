import br.com.duarte.desafio.dominio.Bootcamp;
import br.com.duarte.desafio.dominio.Curso;
import br.com.duarte.desafio.dominio.Dev;
import br.com.duarte.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java - OO");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição Curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java - OO");
        mentoria.setDescricao("Descrição de mentoria de Java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp - Java Developer");
        bootcamp.setDescricao("Bootcamp direcionado ao aprendizado da linguagem Java.");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devRodrigo = new Dev();
        devRodrigo.setNome("Rodrigo Duarte");
        devRodrigo.inscreverBootcamp(bootcamp);
        System.out.println("Contéudos Inscritos - Rodrigo Duarte: " + devRodrigo.getConteudoInscritos());
        devRodrigo.progredir();
        devRodrigo.progredir();
        System.out.println("Contéudos Inscritos - Rodrigo Duarte: " + devRodrigo.getConteudoInscritos());
        System.out.println("Contéudos Concluídos - Rodrigo Duarte: " + devRodrigo.getConteudoConcluidos());
        System.out.println("XP: " + devRodrigo.calcularTotalXp());

        Dev devSamira = new Dev();
        devSamira.setNome("Samira Silva");
        devSamira.inscreverBootcamp(bootcamp);
        System.out.println("Contéudos Inscritos - Samira Silva: " + devSamira.getConteudoInscritos());
        devSamira.progredir();
        System.out.println("Contéudos Inscritos - Samira Silva: " + devSamira.getConteudoInscritos());
        System.out.println("Contéudos Concluídos - Samira Silva: " + devSamira.getConteudoConcluidos());
        System.out.println("XP: " + devSamira.calcularTotalXp());
    }
}