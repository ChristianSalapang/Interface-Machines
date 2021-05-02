package Gumball;

public class TestMachine {

    public static void main(String[] args) {
        System.out.println("1 Gumball = 3 Coins");
        System.out.println();
        GumballMachine gumballM = new GumballMachine();
        Person customer = new Person(4);

        customer.insertCoin(gumballM, 6);
        System.out.println();
        customer.insertCoin(gumballM, 3);
        System.out.println();
        customer.insertCoin(gumballM, 1);
        System.out.println();
        customer.insertCoin(gumballM, 4);
        System.out.println();

    }
}
