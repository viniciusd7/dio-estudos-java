package Java;

public class Aula02 {
    public static void main(String[] args) {

        String primeiroNome = "Vinicius";
        String segundonome = "Diniz";
        String nomeCompleto = nomeCompleto(primeiroNome, segundonome); // parametros sempre separados por virgula
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundonome) {// criadno outro metodo
        return "Resultado do método " + primeiroNome.concat("").concat(segundonome); // concatenando para ver os
                                                                                     // retornos

    }

}
