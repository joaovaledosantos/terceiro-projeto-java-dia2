package Dia5;

import java.util.Scanner;

public class aula42 {
    public static void main(String[] args) {
        //coletar o nome do produto
        System.out.print("Digite o nome do produto: ");
        Scanner s = new Scanner(System.in);
        String nomeProduto = s.next().toLowerCase();
        //Retornar o valor do produto

        switch (nomeProduto) {
            case "banana":
                System.out.println("R$9,50");
                break;
            case "manga":
                System.out.println("R$12,80");
                break;
            case "abacate":
                System.out.println("R$16,10");
        }
   }
}
