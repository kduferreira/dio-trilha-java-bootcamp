
public class Usuario {
    public static void main(String[] args) {


        SmartTV smartTV = new SmartTV();

        System.out.println("Tv esta ligada? " + smartTV.ligada);
        System.out.println("Qual canal esta ? " + smartTV.canal);
        System.out.println("Qual o Volume que se encontra? " + smartTV.volume);

        smartTV.ligar();
        System.out.println("Novo Status -> Tv esta ligada? " + smartTV.ligada);

        smartTV.desligar();
        System.out.println("Novo Status -> Tv esta ligada? " + smartTV.ligada);

        smartTV.aumentar();
        System.out.println("Qual o Volume que se encontra? " + smartTV.volume);

        smartTV.diminuir();
        System.out.println("Qual o Volume que se encontra? " + smartTV.volume);

        smartTV.canal(4);
        System.out.println("Novo canal -> canal: " + smartTV.canal);


        smartTV.aumentarCanal();
        System.out.println("Novo canal -> canal: " + smartTV.canal);
        smartTV.diminuirCanal();
        System.out.println("Novo canal -> canal: " + smartTV.canal);
        }


    }
