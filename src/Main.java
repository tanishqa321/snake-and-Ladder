import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static final int WINNING_POSITION = 100;
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Welcome to Snake & Ladder Game");

        int playerPosition = 0;
        Random random = new Random();
        while (playerPosition < WINNING_POSITION) {
            int dice = random.nextInt(6) + 1; // Roll the dice (1 to 6)
            int option = random.nextInt(3);
            int position = playerPosition;
            playerPosition = SnakeAndLadder.updatePosition(position, dice, option);
            if (playerPosition < 0) playerPosition = 0;
            //UC5
            if (playerPosition > WINNING_POSITION) {
                playerPosition -= dice;
            }
            System.out.println(playerPosition);
        }

    }
}