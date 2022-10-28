public class Usuario {

    public static void main(String[] args) {
        
        SmartTv smartTV = new SmartTv();

        if (smartTV.ligada == false)
        System.out.println("Sua TV esta Desligada" );
        if (smartTV.ligada == true){
            System.out.println("Sua TV esta Ligada" );
            System.out.println("Qual o canal atual? : " + smartTV.canal);
            System.out.println("Qual o volume atual? : " + smartTV.volume);
        }
        
        smartTV.ligar();
        if (smartTV.ligada == true){
            System.out.println("A TV esta ligada agora");
            System.out.println("Qual o canal atual? : " + smartTV.canal);
            System.out.println("Qual o volume atual? : " + smartTV.volume);
        }

        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.aumentarVolume();

        smartTV.mudarCanal(13);
        smartTV.voltarCanal();

        smartTV.desligar();
        if(smartTV.ligada == false){
            System.out.println("TV desligando...");
        }




    }
    
}
