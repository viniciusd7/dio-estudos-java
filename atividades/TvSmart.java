//exercicio 01
//vamos criar um exemplo de uma classe para representar uma SmarTV onde:
// 1- Ela tenha características: ligada (boolean), canal (int) e volume (int)
// 2- Nossa TV poderá ligar e desligar e assim mudar o estado ligada
// 3- Nossa TV aumentará e diminuirá o volume sempre em +1 ou -1
// 4- Nossa TV poderá mudar de canal de 1 em 1 ou definando o número correspondente

public class TvSmart { // Dando atributos da classe TvSmart
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        if (volume < 100) {
            volume++;
        }
    }

    public void diminuirVolume() {
        if (volume > 0) {
            volume--;
        }
    public void mudarCanal(int novoCanal) {
        if (novoCanal > 0 && novoCanal <= 100) {
            canal = novoCanal;
        }
    public void aumentarCanal() {
        if (canal < 100) {
            canal++;
        }
    public void diminuirCanal() {
        if (canal > 1) {
            canal--;
        }
    }
        }
    }
}
}
