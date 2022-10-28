public class MinhaClasse2 {
    
    public static void main (String[] args) {

        /*String meuNome = "Vinicius";
        int anoFabricacao = 2022;
        boolean verdadeiro = true;*/

        String primeiroNome = "vinicius";
        String segundoNome = "camargo";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do metodo " + primeiroNome.concat(" ").concat(segundoNome);
    }

}
