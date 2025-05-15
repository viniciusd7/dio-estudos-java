public class Aula09 {
    public static void main(String[] args) {
        // operadores logicos
        // && e
        // || ou
        // ! negação
        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && condicao2)
            System.out.println("as duas condicoes sao verdadeiras");
        else
            System.out.println("uma das condicoes e falsa");//

            if (condicao1 || condicao2) {
                System.out.println("uma das condicoes e verdadeira");
            } else {
                System.out.println("as duas condicoes sao falsas");
                
            }
       
        }
    }