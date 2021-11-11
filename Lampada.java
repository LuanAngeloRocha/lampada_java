public class Lampada{
    private boolean situacaolampada;

    public boolean isSituacaolampada() {
        return situacaolampada;
    }

    public void setSituacaolampada(boolean situacaolampada) {
        this.situacaolampada = situacaolampada;
    }

    public boolean ligar(){
        return situacaolampada = true;
    }
    public boolean desligar(){
        return situacaolampada = false;
    }

    
}