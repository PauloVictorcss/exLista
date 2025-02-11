package funcionarios;

public class Funcionario {
    private String nome;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Funcionario(String nome, double salrio){
        this.nome = nome;
        this.salario = salario;
    }

    public void exibirDetalhes(){
        System.out.println("Nome: " + nome + "\nSalario: " + salario + "Bonificação: " + bonus());
    }

    public double bonus(){
        return 0.1 * salario;
    }
}

package funcionarios;

public class Desenvolvedores extends Funcionario{


    public Desenvolvedores(String nome, double salrio) {
        super(nome, salrio);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Nome: " + getNome() + "\nSalario: " + getSalario() + "Bonificação: " + bonus());
    }

    @Override
    public double bonus() {
        return 0.15 * getSalario();
    }
}



package funcionarios;

public class Gerente extends Funcionario{

    public Gerente(String nome, double salrio) {
        super(nome, salrio);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Nome: " + getNome() + "\nSalario: " + getNome() + "Bonificação: " + bonus());
    }

    @Override
    public double bonus() {
        return 0.2 * getSalario();
    }
}


package funcionarios;

public class Main {
    public static void main(String[] args) {


        Desenvolvedores desenvolvedores = new Desenvolvedores("Paulo", 5000);
        Gerente gerente = new Gerente("Elem", 10.100);

        gerente.exibirDetalhes();
        desenvolvedores.exibirDetalhes();

        System.out.println(desenvolvedores.bonus());

        System.out.println(gerente.bonus());

    }
}
