package pagamento;

public abstract class Pagamento {

    public abstract double calcularValor();

    public  void exibirDetalhes(){
        System.out.println("Pagamento realizado.");
    }
}

package pagamento;

public class PagamentoBoleto extends Pagamento{

    private double valor;

    @Override
    public double calcularValor() {
        return 500;
    }
}


package pagamento;

public class PagamentoCartao extends Pagamento{


    @Override
    public double calcularValor() {
        double valor = 500;
        return 0.02 * valor + valor;
    }
}


package pagamento;

public class TestePagamento {

    public static void main(String[] args) {


        PagamentoCartao cartão = new PagamentoCartao();
        System.out.println(cartão.calcularValor());

        PagamentoBoleto boleto = new PagamentoBoleto();
        System.out.println(boleto.calcularValor());

    }

}
