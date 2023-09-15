package Escola;

public class Escola {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
       aluno.setNome("Julyana");
       aluno.setIdade(23);

        System.out.println("O(a) aluno(a) " + aluno.getNome() + " tem " + aluno.getIdade() + " anos ");
        //RESULTADO NO CONSOLE
        //O aluno Felipe tem 8 anos
    }
}