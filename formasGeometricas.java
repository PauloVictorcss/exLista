package formasGeomericas;

public interface Forma {

    public abstract double calcularArea();
}


package formasGeomericas;

public class Circulo implements Forma{

    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return 3.14 * (raio * raio);
    }

    public void exibirArea(){
        System.out.println(calcularArea());
    }
}


package formasGeomericas;

public class Retangulo implements Forma{

    private double base;
    private double altura;


    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    public void exibirArea(){
        System.out.println(calcularArea());
    }
}


package formasGeomericas;

public class Triangulo implements Forma{

    private double base;
    private double altura;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    public void exibirArea(){
        System.out.println(calcularArea());
    }
}


package formasGeomericas;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        Retangulo retangulo = new Retangulo();
        Triangulo tringulo = new Triangulo();

        circulo.setRaio(5.3);
        circulo.exibirArea();

        retangulo.setAltura(3.5);
        retangulo.setBase(3.7);
        retangulo.exibirArea();

        Triangulo triangulo = new Triangulo();
        triangulo.setAltura(5.5);
        triangulo.setAltura(3.4);
        triangulo.exibirArea();

    }
}
