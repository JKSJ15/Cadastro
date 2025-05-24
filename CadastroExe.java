package Cadastro;

public class CadastroExe {
    public static void main(String[] args) {

    Analista analista = new Analista("Joao", 1500);
    Analista analista2 = new Analista("Pelé", 2000);

    Programador programador = new Programador("Jakson", 2500);
    Programador programador2 = new Programador("José", 2500);
    
    Gerente gerente = new Gerente("Pablo", 3000);
    Gerente gerente2 = new Gerente("Joaquim", 2800);

    System.out.println("\n---------Analistas---------");
    Analista [] analistas = {analista, analista2};
    for (Analista a : analistas) {
        System.out.println(a);
    }
    System.out.println("\n---------Programadores---------");
    Programador [] programadores={programador, programador2};
    for (Programador p : programadores) {
        System.out.println(p);
    }
    System.out.println("\n---------Gerentes---------");
    Gerente [] gerentes={gerente, gerente2};
    for (Gerente g : gerentes) {
        System.out.println(g);
    }
    }
}

