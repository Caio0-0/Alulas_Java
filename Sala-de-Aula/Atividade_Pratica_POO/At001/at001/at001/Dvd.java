package at001;
public class Dvd extends Midia{
    private int nFaixas;

    public  Dvd(int c,double p,String s,int f){
        super(c, p, s);
        this.nFaixas = f;
    }
    public String getTipo(){
        return "Dvd";
    }
    public String getDetalhes(){
      return "nFaixa="+nFaixas+"\nnome="+nome+"\npreço="+preco+"codigo="+codigo;

    }    
    public void setFaixas(int f){
       this.nFaixas += f;
    }
    public void inserirDados(int c,double p,String s,int f){
        this.nFaixas = f;
        this.nome = s;
        this.preco = p;
        this.codigo = c;
    }
    @Override
    public void printDados() {
        System.out.println("------------------------------");
        System.out.println("\nnome="+nome+"\npreço="+preco+"\ncodigo="+codigo+"\nnFaixas="+nFaixas);
        System.out.println("------------------------------");
   
    }
 
}
