public class SmartTV {


    /**
     * Estas duas estrelinhas acima
     * é para identificar que você
     * pretende elaborar um comentário
     * a nível de documentação.
     * Que incrível !!!
     */


    boolean ligada = false;
    int canal = 10;
    int volume = 1;



    public void ligar () {
        ligada = true;
    }

    public void desligar () {
        ligada = false;
    }

    public void aumentar() {
         volume++;
    }

    public void diminuir() {
        volume--;
    }

    public void aumentarCanal( ){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }

    public void canal(int novoCanal) {
        canal = novoCanal;
    }
}
