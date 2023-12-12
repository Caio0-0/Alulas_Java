package at001;
public class Cd extends Midia{
    private int nMusicas;
    public  Cd(int c,double p,String s,int m){
        super(c, p, s);
        this.nMusicas = m;
    }
    
    public String getTipo(){
        return "Cd";
    }
    public String getDetalhes(){
       return "nMusicas="+nMusicas+"\nnome="+nome+"\npreço="+preco+"\ncodigo="+codigo;
    }    
    public void setMusica(int m){
        this.nMusicas +=m;
    }
    public void inserirDados(int c,double p,String s,int m){
       this.nome = s;
      this.preco = p;
        this.codigo = c;
       this.nMusicas = m;
        
    }
    @Override
    public void printDados() {
        System.out.println("------------------------------");
        getDetalhes();    
        System.out.println("------------------------------");
      
    }
}
