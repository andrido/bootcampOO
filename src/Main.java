import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso cursoPython = new Curso();
        cursoPython.setTitulo("Curso Python");
        cursoPython.setDescricao("Descrição do curso de Python");
        cursoPython.setCargaHoraria(10);

        Curso cursoGo = new Curso();
        cursoGo.setTitulo("Curso Go");
        cursoGo.setDescricao("Descrição do curso de Go");
        cursoGo.setCargaHoraria(6);

        Mentoria mentoriaGo = new Mentoria();
        mentoriaGo.setTitulo("Mentoria de Go");
        mentoriaGo.setDescricao("Descrição da mentoria de Go");
        mentoriaGo.setData(LocalDate.now());

        Bootcamp bootcampFullStack = new Bootcamp();
        bootcampFullStack.setNome("Bootcamp Full Stack Developer");
        bootcampFullStack.setDescricao("Descrição do Bootcamp Full Stack Developer");
        bootcampFullStack.getConteudos().add(cursoPython);
        bootcampFullStack.getConteudos().add(cursoGo);
        bootcampFullStack.getConteudos().add(mentoriaGo);

        Dev devAna = new Dev();
        devAna.setNome("Ana");
        devAna.inscreverBootcamp(bootcampFullStack);
        System.out.println("Conteúdos Inscritos Ana: " + devAna.getConteudosInscritos());
        devAna.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Ana: " + devAna.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Ana: " + devAna.getConteudosConcluidos());
        System.out.println("XP: " + devAna.calcularTotalXp());

        System.out.println("-------");

        Dev devCarlos = new Dev();
        devCarlos.setNome("Carlos");
        devCarlos.inscreverBootcamp(bootcampFullStack);
        System.out.println("Conteúdos Inscritos Carlos: " + devCarlos.getConteudosInscritos());
        devCarlos.progredir();
        devCarlos.progredir();
        devCarlos.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Carlos: " + devCarlos.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Carlos: " + devCarlos.getConteudosConcluidos());
        System.out.println("XP: " + devCarlos.calcularTotalXp());
    }
}
