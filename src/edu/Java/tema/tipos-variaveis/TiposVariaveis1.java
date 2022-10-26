public class TiposVariaveis1 {

    public static void main(String[] args) {
        int idade = 21;
        double salarioMinimo = 2500; //não usa o . para milhares 
        double exemploFracao = 2.500; // significa que o valor é 2,50 e não 2.500,00

        byte idadeExemplo = 123;
        short ano = 2022;
        int cep = 13338245; // se começar com 0, talvez tenha que ser outro tipo
        long cpf = 44984842815L; // se começar com 0, talvez tenha que ser outro tipo - precisa terminar com L
        float pi = 3.14F; //precisa terminar com f
        double slario = 1278.33;
        
        
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numerocurto2 = (short) numeroNormal; // casting
    }


}