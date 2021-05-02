package Gumball;

public class GumballMachine implements Coinable, Dispensable {

    int gums = 0;

    public GumballMachine() {
        this.gums = 6;
    }

    @Override
    public void dispense() {
        // method
        this.gums--;
        System.out.println("1 Gumball dispensed");
        System.out.println("Remaining Gumballs: " + gums);
    }

    @Override
    public void reload (int count) {
        // method
        this.gums += count;
    }

    @Override
    public boolean insertCoin() {
        // method
        if(this.gums > 0) {
            this.dispense();
            return true;
        }
        System.out.println("The machine is out of Gumballs.");
        return false;

    }
}
