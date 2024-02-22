package Dia4;

import java.text.NumberFormat;

public class aula2 {
    public static void main(String[] args) {
        NumberFormat pound = NumberFormat.getCurrencyInstance();
        String productValue = pound.format(1120.80);
        System.out.println(productValue);
    }
}
