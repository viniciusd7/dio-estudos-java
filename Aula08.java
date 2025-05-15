public class Aula08 {
    public static void main(String[] args) {
        // operadores relacionais
        int numero1 = 1;
        int numero2 = 1;
        // sinais
        // == igual
        // != diferente
        // > maior
        // < menor
        // >= maior ou igual
        // <= menor ou igual
        boolean simounao = numero1 == numero2; // testando boolean
        System.out.println("numero1 e igual ao numero2? " + simounao); // imprimir resposta

        if (numero1 != numero2)
            System.out.println("numero1 e diferente do numero2? " + simounao); // e diferente
        else
            System.out.println("numero1 e igual ao numero2? " + simounao); // e diferente

        if (numero1 > numero2)
            System.out.println("numero1 e maior que o numero2? " + simounao); // maior
        else
            System.out.println("numero1 e menor que o numero2? " + simounao); // maior

        if (numero1 >= numero2)
            System.out.println("numero1 e maior ou igual ao numero2? " + simounao); // maior ou igual
        else
            System.out.println("numero1 e menor ou igual ao numero2? " + simounao); // maior ou igual

    }
}
