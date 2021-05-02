package Arcade;

public class Person {
    private int coins;

    public Person(int coins) {
        this.coins = coins;
    }

    public void insertCoin(Coinable coinable) {
        System.out.println("You have " + coins + " coins.");
        if (!coinable.insertCoin());
        coins--;
        System.out.println("");

        if (coins == 0)
            System.out.println("You have no more coins!");
    }
}
