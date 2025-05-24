package Cadastro;

public abstract class Funcionario {
    protected String nome;
    protected double Salario;
    
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.Salario = salario;
    }
}
