package Cadastro;

public class Gerente extends Funcionario {
    public Gerente(String nome, double Salario){
    super(nome, Salario);
   }

    @Override
    public String toString() {
        return "Gerente [Nome=" + nome + ", Salario=" + Salario + "]";
    }

    
}
