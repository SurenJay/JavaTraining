public class ifelse {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 5000;
        int levelComplete = 5;
        int bonus = 100;

        if (score < 5000 && score > 1000) {
            System.out.println("Your score was less than 5000 but Greater than 1000");
        } else if (score < 1000) {
            System.out.println("Tour score was less than 1000");
        } else {
            System.out.println("you got here");
        }
    }
}
