package Gumball;

public class Person {
    private int coins;
    private int price;


    public Person(int coins) {
        this.coins = coins;
        this.price = 3;
    }

    // insert coin
    public void insertCoin(Coinable coinable, int coins) {
        System.out.println("You have inserted " + coins + " coins.");
        if(coins > 2) {
            if(!coinable.insertCoin()) {
                System.out.println(coins + " coins are refunded.");
            }
            else {
                coins = coins - price;
                System.out.println("Your change is: " + coins + " coins");
            }
        }
        else {
            System.out.println("You do not have enough coins to purchase a Gumball! " + coins + " coins returned");
        }
    }
}
