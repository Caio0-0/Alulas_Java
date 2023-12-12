package aula2;
public class ControlheRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;


    public ControlheRemoto(){
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    public int getVolume() {
        return volume;
    }
    public boolean getLigado(){
        return ligado;
    }
    public boolean getTocando(){
        return tocando;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
//Metodos abstratos
    @Override
    public void ligar() {
       this.setLigado(true);
    }

    @Override
    public void deslogar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("Esta ligado:"+this.getLigado());
        System.out.println("Esta ligado:"+this.getTocando());
        System.out.print("Volume:"+this.getVolume());

        for(int i=0;i<=this.getVolume();i+=10){
            System.out.print("|");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu;");
    }

    @Override
    public void maisVolume() {
        if(this.getLigado()){
            this.setVolume(this.getVolume()+5);

        }
    }

    @Override
    public void menosVolume() {
        if(this.getLigado()){
            this.setVolume(this.getVolume()-5);
        }
    }

    @Override
    public void ligarMenu() {
        if(this.getLigado() && getVolume()>0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMenu() {
        if(this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if(this.getLigado() && !(getTocando())){
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if(this.getLigado() && getTocando()){
            this.setTocando(false);
        }
    }




}
