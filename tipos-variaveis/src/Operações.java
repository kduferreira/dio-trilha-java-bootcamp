public class Operações {

    public static void main(String[] args) {
/* */
        // para fazer  concatenação de dois caracteres
        String nome_completo = "Linguagem " + " Java";
        System.out.println(nome_completo);

        //a partir do momento que o java identificar um caracter ele
        // inicia a concatenação e nao realiza mais as operações aritimeticas
        String concatenacao = "?";
        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);
        concatenacao =  1+"1"+1+1;
        System.out.println(concatenacao);
        concatenacao =  1+"1"+1+"1";
        System.out.println(concatenacao);

        concatenacao =  "1"+1+1+1;
        System.out.println(concatenacao);

        // como usar operador usuario unario
        int numero = 5;

        numero = -numero;
        System.out.println( numero);

        numero = numero * -1;
        System.out.println(numero);



        int numero1 = 5;

        numero1++;
        //numero1 = numero1 +1;
        System.out.println(numero1);
        System.out.println(++numero1);
        System.out.println(numero1);

        int numero2 =5;
        numero2--;
        System.out.println(numero2);

        System.out.println(--numero2);
        System.out.println(numero2);
    }



}
