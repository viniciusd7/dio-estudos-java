public class Aula06 {
    // trabalhando com operadores de atribuição
    public static void main(String[] args) {
        // Operadores de atribuição
        int a = 10;
        int b = 5;

        a += b; // a = a + b
        System.out.println("a += b: " + a); // 15

        a -= b; // a = a - b
        System.out.println("a -= b: " + a); // 10

        a *= b; // a = a * b
        System.out.println("a *= b: " + a); // 50

        a /= b; // a = a / b
        System.out.println("a /= b: " + a); // 10

        a %= b; // a = a % b
        System.out.println("a %= b: " + a); // 0

        // Operadores de incremento e decremento
        int c = 1;
        c++; // c = c + 1
        System.out.println("c++: " + c); // 2

        c--; // c = c - 1
        System.out.println("c--: " + c); // 1
    }

}
