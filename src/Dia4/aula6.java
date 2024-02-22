package Dia4;

public class aula6 {
    public static void main(String[] args) {
    int valorCarro = 85000;
    if (valorCarro > 100_000)
        System.out.println("Não comprar. Acima da tabela");
    else if (valorCarro >=90_000 && valorCarro <=100_000)
        System.out.println("Comprar o carro");
    else
        System.out.println("Náo comprar. Valor abaixo da tabela");
    }
}
