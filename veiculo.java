package veiculo;

public class Veiculo {

    private String marca;
    private String modelo;
    private int ano;


    public Veiculo(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }


    public String getModelo() {
        return modelo;
    }


    public int getAno() {
        return ano;
    }


    public void exibirVeiculo(){
        System.out.println("Marca: " + marca + "\nModelo: " + modelo + "\nAno: " + ano);
    }
}



package veiculo;

public class Carro extends Veiculo{

    private int numeroPortas;
    public Carro(String marca, String modelo, int ano, int numeroPortas) {
        super(marca, modelo, ano);
        this.numeroPortas = numeroPortas;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    @Override
    public void exibirVeiculo() {
        System.out.println("\nMarca: " + getMarca() + "\nModelo: " + getModelo() + "\nAno: " + getAno() + "\nQuantidade de portas: " + numeroPortas);
    }
}



package veiculo;

public class Moto extends Veiculo{

    private int cilindrada;
    public Moto(String marca, String modelo, int ano, int cilindrada) {
        super(marca, modelo, ano);
        this.cilindrada = cilindrada;
    }

    @Override
    public void exibirVeiculo() {
        System.out.println("\nMarca: " + getMarca() + "\nModelo: " + getModelo() + "\nAno: " + getAno() + "\nCilindrada: " + cilindrada);
    }
}


package veiculo;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Volkswagen", "vw tigun", 2025, 4);
        carro.exibirVeiculo();

        Moto moto = new Moto("Honda", "cb 600f", 2025, 4);
        moto.exibirVeiculo();

    }
}
