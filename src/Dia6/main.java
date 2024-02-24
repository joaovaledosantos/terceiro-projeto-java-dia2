package Dia6;

public class main {
    public static void main(String[] args) {

        Car car = new Car("BMW", "X6", 2024, 130_000);

        car.setModelo("X5");

        System.out.println(car.getMarca());
        System.out.println(car.getModelo());
        System.out.println(car.getAno());
        System.out.println("Valor de venda: " + car.valorVenda());
    }
}
