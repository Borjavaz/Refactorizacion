public class Main {
    /**
     * metodo para devolver la puntuacion de tenis
     */

    public static String getScore(int scorePlayer1, int scorePlayer2) {
        String score = "";

        if (scorePlayer1 == scorePlayer2) {
            score = getScoreForTie(scorePlayer1);
        } else if (scorePlayer1 >= 4 || scorePlayer2 >= 4) {
            score = getScoreForAdvantageOrWin(scorePlayer1, scorePlayer2);
        } else {
            score = getScoreForNormalGame(scorePlayer1, scorePlayer2);
        }

        return score;
    }

    private static String getScoreForTie(int score) {
        switch (score) {
            case 0: return "Love-All";
            case 1: return "Fifteen-All";
            case 2: return "Thirty-All";
            case 3: return "Forty-All";
            default: return "Deuce";
        }
    }

    private static String getScoreForAdvantageOrWin(int scorePlayer1, int scorePlayer2) {
        int scoreDifference = scorePlayer1 - scorePlayer2;

        if (scoreDifference == 1) return "Advantage player1";
        if (scoreDifference == -1) return "Advantage player2";
        if (scoreDifference >= 2) return "Win for player1";
        return "Win for player2";
    }

    private static String getScoreForNormalGame(int scorePlayer1, int scorePlayer2) {
        return convertScoreToString(scorePlayer1) + "-" + convertScoreToString(scorePlayer2);
    }

    private static String convertScoreToString(int score) {
        switch (score) {
            case 0: return "Love";
            case 1: return "Fifteen";
            case 2: return "Thirty";
            case 3: return "Forty";
            default: return "";
        }
    }
    }
