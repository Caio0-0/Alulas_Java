package aula4;

public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    public void fazerAniversario(){
        this.idade++;
    }
    


    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getIdade() {
        return idade;
    }
    public String getNome() {
        return nome;
    }
    public String getSexo() {
        return sexo;
    }


    public String toString(){
        return "Pessoa{"+"nome="+nome+", idade"+idade+"}";
    }
}
