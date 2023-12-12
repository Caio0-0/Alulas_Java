public class Lutador {
    private String nome;
    private String nacionalidede;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public  Lutador(String nome,String nacionalidade,int idade,float altura,float peso,int vitorias,int derrotas,int empates){
        this.nome = nome;
        this.nacionalidede = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
        
    }

    public void apresentar(){
        System.out.println("Lutador: "+getNome());
        System.out.println("Origem: "+getNacionalidede());
        System.out.println(+getIdade()+" anos");
        System.out.println(getAltura()+"m de altura");
        System.out.println("Pesando: "+getPeso()+"Kg");
        System.out.println("Ganhou: "+getVitorias());
        System.out.println("Perdeu: "+getDerrotas());
        System.out.println("Empatou: "+getEmpates());
    }
    public void status(){
        System.out.println(getNome());
        System.out.println("É um peso "+getCategoria());
        System.out.println("E tem "+getVitorias()+" Vitorias");
        System.out.println("E tem "+getDerrotas()+" Derrotas");
        System.out.println("E tem "+getEmpates()+" Empates ");
    }
    public void ganharLuta(){
        setDerrotas(getVitorias()+1);
    }
    public void perderLuta(){
        setDerrotas(getVitorias()+1);
    }
    public void empatarLuta(){
        setDerrotas(getVitorias()+1);
    }





    public void setAltura(float altura) {
        this.altura = altura;
    }
    public void setCategoria(String categoria) {
        if(peso<52.2){
            categoria = "Invalida";
        }else if(peso<=70.3){
            categoria = "Leve";
        }else if(peso<=83.9){
            categoria = "Medio";
        }else if(peso<=120.2){
            categoria = "Pesado";
        }else{
            categoria = "Invalido";
        }
    }
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
    public void setEmpates(int empates) {
        this.empates = empates;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setNacionalidede(String nacionalidede) {
        this.nacionalidede = nacionalidede;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPeso(float peso) {
        this.peso = peso;
        setCategoria(categoria);
    }
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }




    public float getAltura() {
        return altura;
    }
    public String getCategoria() {
        return categoria;
    }
    public int getDerrotas() {
        return derrotas;
    }
    public int getEmpates() {
        return empates;
    }
    public int getIdade() {
        return idade;
    }
    public String getNacionalidede() {
        return nacionalidede;
    }
    public String getNome() {
        return nome;
    }
    public float getPeso() {
        return peso;
    }
    public int getVitorias() {
        return vitorias;
    }

}
