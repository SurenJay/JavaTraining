public class methodsinmethod {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelComplete = 5;
        int bonus = 100;

        int highscore = calculateScore(gameOver, score, levelComplete, bonus);
        System.out.println("Your final Score =" + highscore);

        score = 10000;
        levelComplete = 8;
        bonus = 200;

        highscore = calculateScore(true, score, levelComplete, bonus);
        System.out.println("Your final Score =" + highscore);


        int highScoreposition = calculatedhighscoreposition(1900);
        displayHighScorePosition("tim", highScoreposition);

        highScoreposition = calculatedhighscoreposition(900);
        displayHighScorePosition("bob", highScoreposition);

        highScoreposition = calculatedhighscoreposition(400);
        displayHighScorePosition("percy", highScoreposition);

        highScoreposition = calculatedhighscoreposition(50);
        displayHighScorePosition("gilbert", highScoreposition);

    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position "
                + highScorePosition + " on the highscore table");
    }

    public static int calculatedhighscoreposition(int playerscore) {
//        if (playerscore >= 1000) {
//            return 1;
//        } else if (playerscore >= 500) {
//            return 2;
//        } else if (playerscore >= 100) {
//            return 3;
//        }
//            return 4;
        int position = 4;
        if (playerscore >= 1000) {
            position = 1;
        } else if (playerscore >= 500) {
            position = 2;
        } else if (playerscore >= 100) {
            position = 3;
        }
        return position;
    }


        public static int calculateScore ( boolean gameOver, int score, int levelComplete, int bonus){


            if (gameOver) {
                int finalScore = score + (levelComplete * bonus);
                finalScore += 1000;
                return finalScore;
            }
            return -1;

        }

    }
