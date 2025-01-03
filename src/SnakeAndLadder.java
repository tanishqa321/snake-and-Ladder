public class SnakeAndLadder {

    public static int updatePosition(int position, int dice, int option) {
        switch (option) {
            case 0: // No Play
                break;
            case 1: // Ladder
                position += dice;
                break;
            case 2: // Snake
                position -= dice;

                break;
        }



        return position;
    }
}
