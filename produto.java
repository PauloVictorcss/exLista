package produto;

import javax.swing.*;

public class Produto {

    private String nome;
    private double preco;
    private int quantidadeEmEstoque = 0;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void adicionarAoEstoque(int quantidade){
        quantidadeEmEstoque += quantidade;
    }

    public void removerDoEstoque(int quantidade){
        if(quantidadeEmEstoque > 0) {
            this.quantidadeEmEstoque -= quantidade;
        }else{
            System.out.println("Quantidade já é zero");
        }
    }

    public void exibirInformacoes(){
        System.out.println("nome: " + nome + "\npreco: " + preco + "\nQuantidade em estoque: " + quantidadeEmEstoque);
    }


}



package produto;

public class Main {
    public static void main(String[] args) {


        Produto produto = new Produto();

        produto.setNome("Calculadora");
        produto.setPreco(15.0);
        produto.exibirInformacoes();

        System.out.println("\nAdicionando quantidade 5 ao estoque");
        produto.adicionarAoEstoque(5);
        produto.exibirInformacoes();

        System.out.println("\nremovendo quantidade 3 do estoque");
        produto.removerDoEstoque(3);
        produto.exibirInformacoes();


    }
}
