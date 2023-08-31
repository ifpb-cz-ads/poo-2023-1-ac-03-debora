import java.util.*;

public class TestaRetangulo {

    public static void main(String[] args) {
        Retangulo ret1 = new Retangulo();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor da altura do retangulo= ");
        double altura = teclado.nextDouble();
        System.out.println("Digite o valor da largura do retangulo= ");
        double largura = teclado.nextDouble();

        ret1.setAltura(altura);
        ret1.setLargura(largura);

        System.out.println("Área do retangulo= " + ret1.area());
    }
}

//arquivo2 da classe retangulo

public class Retangulo {

    private double altura;
    private double largura;

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double area() {
        return altura * largura;
    }
}
