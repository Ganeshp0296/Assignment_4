public class SnakeNLadder {
    public static void main(String[] args) {
        System.out.println("Welcome to snake and ladder game");
        SnakeNLadder sl = new SnakeNLadder();
        sl.throwingDice();
    }
    public int  throwingDice() {
        int startPosition = 0;
        while (true) {
            System.out.println("Current value: " + startPosition);
            if (startPosition == 100) {
                break;
            }
            int random = (int) (Math.random() * 6 + 1);
            startPosition += random;
            if (startPosition > 100) {
                startPosition -= random;
				
            }
        }
        return startPosition;
    }
}
