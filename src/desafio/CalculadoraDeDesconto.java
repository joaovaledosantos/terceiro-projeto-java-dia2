package desafio;

/**
 * Se o preco for menor que 10 reais, 10% de desconto.
 * se o preco for maior que 10 reais, 20% de desconto.
 */
public class CalculadoraDeDesconto {
    public static void main(String[] args) {
        double preco = 4.99;
        if (preco < 10) {
            System.out.println("Seu desconto sera de 10%.");
        } else {
            System.out.println("Seu desconto sera de 20%.");
        }

    }
}
