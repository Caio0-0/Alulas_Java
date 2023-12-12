package aula4;

public class Aluno extends Pessoa{
    private int matr;
    private String curso;

    public void cancelarMar(){
        System.out.println("Matricula será cancelada");
    }
    public String getCurso() {
        return curso;
    }
    public int getMatr() {
        return matr;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    public void setMatr(int matr) {
        this.matr = matr;
    }
    
}
