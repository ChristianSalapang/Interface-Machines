package Arcade;

public class TestMachine {

    public static void main(String[] args) {

        System.out.println("Insert a coin to play!");
        System.out.println();

        ArcadeMachine arcadeM = new ArcadeMachine();
        Person player = new Person(4);

        player.insertCoin(arcadeM);
        player.insertCoin(arcadeM);
        player.insertCoin(arcadeM);
        player.insertCoin(arcadeM);

    }
}
