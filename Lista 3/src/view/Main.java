package view;

import model.Turma;
import model.Aluno;

public class Main {
    public static void main(String[]args){
        Aluno a1 = new Aluno("Ana", "123");
        a1.cadastrarNota(8.0);
        a1.cadastrarNota(7.5);

        Aluno a2 = new Aluno("Pedro","456");
        a2.cadastrarNota(5.0);
        a2.cadastrarNota(6.0);
        Turma turma = new Turma(10);
        turma.adicionarAluno(a1);
        turma.adicionarAluno(a2);

        turma.listaAprovados();
        turma.listaReprovados();
    }
}