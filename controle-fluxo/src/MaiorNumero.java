public class MaiorNumero {
    public static void main(String[] args) {

        Integer numero1 = 5;
        Integer numero2 = 7;
        Integer numero3 = 9;
        int maior, menor;


        if (numero1 > numero2 && numero1 > numero3){
            maior = numero1;
        }
        else if (numero2 > numero1 && numero2 > numero3) {
            maior = numero2;
        } else {
            maior = numero3;
        }

        if (numero1 < numero2 && numero1 < numero3){
            menor = numero1;
        }
        else if (numero2 < numero1 && numero2 < numero3) {
            menor = numero2;
        } else {
            menor = numero3;
        }


        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
    }

}
