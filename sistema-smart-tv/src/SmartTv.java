public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void mudarCanal(int canal){
        canal = canal;
    }

    public void aumentarCanal(){
        canal += 1;
    }

    public void diminuirCanal(){
        canal -= 1;
    }

    public void aumentarVolume(){
        volume += 1;
    }

    public void diminuirVolume(){
        volume -= 1;
    }
    
}
