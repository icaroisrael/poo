public class Tv {
    boolean status;
    int volume;
    int canal;

    public void ligar(){
        status = true;
    }

    public void desligar(){
        status = false;
    }

    public void aumentaVolume(){
        volume++;
    }
    public void diminuiVolume(){
        volume--;
    }
    public void aumentaCanal(){
        canal++;
    }
    public void diminuiCanal(){
        canal--;
    }
}
