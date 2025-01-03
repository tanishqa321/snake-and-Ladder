import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static final int WINNING_POSITION = 100;
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Welcome to Snake & Ladder Game");
        int numberOfDiceRolls=0;
        int player1Position = 0;
        int player2Position = 0;
        int currentPlayer = 1;
        Random random = new Random();
        while (player1Position < WINNING_POSITION && player2Position < WINNING_POSITION) {

            int dice = random.nextInt(6) + 1; // Roll the dice (1 to 6)
            int option = random.nextInt(3);

            numberOfDiceRolls+=1;
            if (currentPlayer == 1) {
                System.out.println("Player 1 rolls dice: " + dice);
                player1Position = SnakeAndLadder.updatePosition(player1Position, dice, option);
                System.out.println("Player 1 is now at position: " + player1Position);
                if (option == 1 && player1Position < WINNING_POSITION) {
                    System.out.println("Player 1 got a Ladder! Rolling again.");
                    continue; // Player 1 gets another chance
                }
                currentPlayer = 2; // Switch to Player 2
            } else {
                System.out.println("Player 2 rolls dice: " + dice);
                player2Position = SnakeAndLadder.updatePosition(player2Position, dice, option);
                System.out.println("Player 2 is now at position: " + player2Position);
                if (option == 1 && player2Position < WINNING_POSITION) {
                    System.out.println("Player 2 got a Ladder! Rolling again.");
                    continue; // Player 2 gets another chance
                }
                currentPlayer = 1; // Switch to Player 1
            }
        }

        System.out.println("Game Over!");
        if (player1Position == WINNING_POSITION) {
            System.out.println("Player 1 wins the game!");
        } else {
            System.out.println("Player 2 wins the game!");
        }

        System.out.println("Total dice rolls: " + numberOfDiceRolls);
    }
}