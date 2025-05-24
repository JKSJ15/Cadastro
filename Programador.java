package Cadastro;

public class Programador extends Funcionario {
    public Programador(String nome, double Salario){
    super(nome, Salario);
    }

    @Override
    public String toString() {
        return "Programador [Nome=" + nome + ", Salario=" + Salario + "]";
    }
}
