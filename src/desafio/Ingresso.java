package desafio;

/**
 * se voce tiver menor que 18 anos, pagara metade do preco
 * se voce for maior que 18 anos, pagara o preco normal por ingresso
 */
public class Ingresso {
    public static void main(String[] args) {
        int idade = 19;
        if (idade < 18) {
            System.out.println("Voce ira pagar metade do preco!");
        } else {
            System.out.println("Voce ira pagar o preco inteiro!");
        }
    }
}
