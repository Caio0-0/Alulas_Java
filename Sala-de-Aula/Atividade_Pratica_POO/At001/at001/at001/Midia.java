package at001;
public class Midia {
    public int codigo;
    public double preco;
    public String nome;


    public  Midia(int c,double p, String n){
        this.codigo = c;
        this.preco = p;
        this.nome = n;
    }


    public String getTipo(){
        return "Midia";
    }
    public String getDetalhes(){
        return "codigo="+codigo+"\npreço="+preco+"\nnome="+nome;
    }
    public void printDados(){
        System.out.println("------------------------------");
        System.out.println("\nnome="+nome+"\npreço="+preco+"\ncodigo="+codigo);
        System.out.println("------------------------------");
    }
    public void inserirDados(int c,double p, String n){
        this.codigo = c;
        this.preco = p;
        this.nome = n;
    }
}
