public class ResultadoEscolarTernaria {

    public static void main(String[] args) {
        int nota = 0;
        String resultado = nota >=7 ? "Aprovado" : nota >=4 && nota <7 ? "Recuperação" : nota >=2 && nota <4 ? "Pede ponto para o professor" :  "Reprovado";
        System.out.println(resultado);
    }
        }



