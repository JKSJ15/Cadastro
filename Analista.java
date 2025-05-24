package Cadastro;

public class Analista extends Funcionario {
    public Analista(String nome, double Salario){
    super(nome, Salario);
   }

    @Override
    public String toString() {
        return "Analista [Nome=" + nome + ", Salario=" + Salario + "]";
    }
}
