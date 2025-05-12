package model;

public class Turma {
    private Aluno[] alunos;
    private int contadorAlunos = 0;

    public Turma(int tamanho){
        alunos = new Aluno[tamanho];
    }
    public void adicionarAluno(Aluno aluno){
        if(contadorAlunos < alunos.length){
            alunos[contadorAlunos]=aluno;
            contadorAlunos++;
        }
        else{
            System.out.println("Turma cheia.");
        }
    }
    public void listaAprovados(){
        System.out.println("Alunos aprovados:");
        for(int i = 0; i < contadorAlunos; i++){
            if(alunos[i].estaAprovado()){
                System.out.println(alunos[i]);
            }
        }
    }
    public void listaReprovados() {
        System.out.println("Alunos reprovados:");
        for (int i = 0; i < contadorAlunos; i++) {
            if (!alunos[i].estaAprovado()) {
                System.out.println(alunos[i]);
            }
        }
    }
}
