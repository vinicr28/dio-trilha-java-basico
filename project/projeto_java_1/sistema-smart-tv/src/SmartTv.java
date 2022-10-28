public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("aumentando volume para: " + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("diminuindo volume para: " + volume);
    }

    public void mudarCanal (int novoCanal){
        canal = novoCanal;
        System.out.println("mudou para o canal escolhido: " + canal);
    }

    public void proximoCanal(){
        canal++;
        System.out.println("mudou para o canal: " + canal);
    }

    public void voltarCanal(){
        canal--;
        System.out.println("mudou para o canal: " + canal);
    }
}
