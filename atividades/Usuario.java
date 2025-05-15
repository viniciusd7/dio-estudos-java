public class Usuario {
    public static void main(String[] args) {

        TvSmart TvSmart = new TvSmart(); // usando para buscar os atributos da classe TvSmart
        System.out.println("Minha Tv Esta ligada ? " + TvSmart.ligada);
        System.out.println("Meu canal atual é " + TvSmart.canal);
        System.out.println("Meu volume atual é " + TvSmart.volume);

        TvSmart.ligar(); // ligando a tv
        System.out.println("novo status -> Minha Tv Esta ligada ? " + TvSmart.ligada); // testando implementações no
                                                                                       // codigo

        TvSmart.diminuirVolume();
        TvSmart.diminuirVolume();
        TvSmart.diminuirVolume();
        TvSmart.diminuirVolume();
        System.out.println("novo status -> Meu volume atual é " + TvSmart.volume);

        TvSmart.aumentarVolume();
        TvSmart.aumentarVolume();
        TvSmart.aumentarVolume();
        TvSmart.aumentarVolume();
        TvSmart.aumentarVolume();
        TvSmart.aumentarVolume();
        System.out.println("novo status -> Meu volume atual é " + TvSmart.volume);
        TvSmart.canal = 10;
        System.out.println("novo status -> Meu canal atual é " + TvSmart.canal);
        TvSmart.desligar();
        System.out.println("novo status -> Minha Tv Esta ligada ? " + TvSmart.ligada);
        System.out.println("Meu canal atual é " + TvSmart.canal);

        TvSmart.ligar(); // ligando a tv
        TvSmart.canal = 20;
        System.out.println("novo status -> Minha Tv Esta ligada ? " + TvSmart.ligada);
        System.out.println("novo status -> Meu canal atual é " + TvSmart.canal);
        TvSmart.mudarCanal(30);
        TvSmart.aumentarCanal();
        TvSmart.aumentarCanal();
        TvSmart.aumentarCanal();
        TvSmart.aumentarCanal();
        TvSmart.aumentarCanal();
        TvSmart.aumentarCanal();
        System.out.println("novo status -> Meu canal atual é " + TvSmart.canal);

        TvSmart.diminuirCanal();
        System.out.println("novo status -> Meu canal atual é " + TvSmart.canal);
        System.out.println("novo status -> Meu canal atual é " + TvSmart.canal);
        System.out.println("novo status -> Meu canal atual é " + TvSmart.canal);
    }
}
