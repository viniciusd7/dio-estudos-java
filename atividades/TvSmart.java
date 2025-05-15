public class TvSmart { // setando os atributos da classe TvSmart
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
