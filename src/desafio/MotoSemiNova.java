package desafio;

/**
 * se a moto for menor que 8000, eu compro
 * se a moto for maior que 8000, eu nao compro
 */
public class MotoSemiNova {
    public static void main(String[] args) {
        int preco = 8100;
        if (preco <8000){
            System.out.println("Menor que 8.000,eu compro!");
        }
        else {
            System.out.println("Maior que 8.000, eu nao compro!");
        }
    }
}
