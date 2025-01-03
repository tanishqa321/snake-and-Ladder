import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Welcome to Snake & Ladder Game");
        int playerPosition = 0;
        Random random = new Random();
        int dice = random.nextInt(6) + 1; // Roll the dice (1 to 6)
        int option = random.nextInt(3);
        int position =0;
        System.out.println(SnakeAndLadder.updatePosition(position,dice,option));

    }
}