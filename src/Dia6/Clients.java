package Dia6;

public class Clients {
        private String firstName;
        int age;
        int balance;

        Clients() {
            balance = 5;
        }

        void newAccount() {
            System.out.println(firstName + " account Created!");
            System.out.println("The new balance is $" + balance);
        }
    }


