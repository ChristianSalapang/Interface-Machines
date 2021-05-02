package Arcade;

public class ArcadeMachine implements Coinable, Dispensable {

    int coins;

    public ArcadeMachine() {
        this.coins = 5;
    }

    @Override
    public void dispense() {
        // method
        System.out.println("You inserted 1 coin. The game is ready to play!");
        coins++;
        System.out.println("Total coins earned by the machine: " + coins);
    }

    @Override
    public boolean insertCoin() {
        // method
        this.dispense();
        return true;
    }
}
