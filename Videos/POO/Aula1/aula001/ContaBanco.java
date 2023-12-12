public class ContaBanco {
    public int numConta ;
    String tipo;
    private String dono;
    private float saldo;
    private boolean status;


    public ContaBanco(){
        saldo = 0;
        status = false;
    }
    public void abrirConta(String t){
        setTipo(t);
        setStatus(true);
        if(t == "CC"){
            setSaldo(50);
        }else if(t =="CP"){
            setSaldo(150);
        }
    }
    public void fecharConta(){
        if(saldo>0 ){
            System.out.println("Voce ainda tem "+saldo+"R$ na sua conta!!Retire o dinheiro para fechar");
        }else if(saldo<0){
            System.out.println("Voce esta devenso"+saldo+"R$ Pague sua divida");
        }else{
            setStatus(false);
        }
        
    }

    public float deposita(float valor){
        if(status==true){
            saldo +=valor;
        }else{
            System.out.println("Voce ainda não tem uma conta para fazer deposito");
        }

        return 0 ;
    }

    public float sacar(float valor){
        if(status==true && saldo>valor){
            saldo =saldo-valor;
        }else{
            if(status==false){
                System.out.println("Voce não tem uma conta");
            }
            if(saldo<valor){
                System.out.println("Voce nõa tem dinheiro o suficiente para sacar");
            }
        }

        return 0;
    }
    public float pagarMensal(){

        if(tipo =="CC"){
            saldo = saldo-12;
        }else{
            saldo = saldo-20;
        }

        return 0;
    }





    public String getDono() {
        return dono;
    }
    public int getNumConta() {
        return numConta;
    }
    public float getSaldo() {
        return saldo;
    }
    public String getTipo() {
        return tipo;
    }



    public void setDono(String dono) {
        this.dono = dono;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }


    void info(){
        System.out.println("Dono:"+dono);
        System.out.println("Tipo da conta:");
        System.out.println("Saldo:"+saldo);
        System.out.println("Aberta:"+status);
        System.out.println("Numero da conta:"+numConta);
    }
}
