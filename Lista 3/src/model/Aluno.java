package model;

public class Aluno {
        private String nome;
        private String matricula;
        private double[] notas = new double[4];
        private int contadorNotas = 0;

        public Aluno(String nome, String matricula){
            this.nome = nome;
            this.matricula = matricula;
        }
        public void cadastrarNota(double nota){
            if(contadorNotas<4){
                notas[contadorNotas]=nota;
                contadorNotas++;
            }
            else{
                System.out.println("Limite de notas já cadastradas.");
            }
        }
        public double calcularMedia() {
            if (contadorNotas == 0) return 0.0;
            double soma = 0;
            for (int i = 0; i < contadorNotas; i++) {
                soma += notas[i];
            }
            return soma / contadorNotas;
        }
        public boolean estaAprovado(){
            return calcularMedia()>=7.0;
        }

         public String getNome() {
        return nome;
       }

         public String getMatricula() {
        return matricula;
    }
    public String toString(){
            return nome +"("+matricula+")- média"+calcularMedia();
    }
}
