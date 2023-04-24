package Programa;
public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        Cliente p2 = new Cliente();
        Funcionario p3 = new Funcionario();

        p1.setNome("Joao");
        p2.setNome("Maria");
        p3.setNome("Joao Maria");

        p2.setCodigo("188901");

        p3.setMatricula(2803888);

        System.out.println(p1.getNome());
        System.out.println(p2.getNome());
        System.out.println(p3.getNome());

        System.out.println(p2.getCodigo());
        System.out.println(p3.getMatricula());


    }

    }
