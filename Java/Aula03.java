package Java;
public class Aula03 {
    public static void main(String[] args) { //trabalhando identação do codigo
        int mediaFinal = 9;  
        if (mediaFinal < 6) {
            System.err.println("Reprovado");
        } 
        else if (mediaFinal == 6) {
            System.out.println("Prova Minerva");
        } 
        else {
            System.out.println("Aprovado");
        }
    }
}