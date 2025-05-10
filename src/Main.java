public class Main {
    /**
     * metodo para devolver la puntuacion de tenis
     */

    public static String getScore(int player1Score, int player2Score) {
        String score = "";
        int tempScore = 0;

        if (player1Score == player2Score) {
            score = getTieScore(player1Score);
        }
        else if (player1Score >= 4 || player2Score >= 4) {
            score = getAdvantageOrWin(player1Score, player2Score);
        }
        else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = player1Score;
                else {
                    score += "-";
                    tempScore = player2Score;
                }
                score += getScoreForTemp(tempScore);
            }
        }
        return score;
    }

     //Método para manejar el caso de empate

    private static String getTieScore(int score) {
        switch (score) {
            case 0:
                return "Love-All";
            case 1:
                return "Fifteen-All";
            case 2:
                return "Thirty-All";
            case 3:
                return "Forty-All";
            default:
                return "Deuce";
        }
    }

     // Método para manejar los casos de puntuación en ventaja o victoria

    private static String getAdvantageOrWin(int player1Score, int player2Score) {
        int scoreDifference = player1Score - player2Score;
        if (scoreDifference == 1) {
            return "Advantage player1";
        } else if (scoreDifference == -1) {
            return "Advantage player2";
        } else if (scoreDifference >= 2) {
            return "Win for player1";
        } else {
            return "Win for player2";
        }
    }

     // Método para devolver la puntuación en formato texto

    private static String getScoreForTemp(int score) {
        switch (score) {
            case 0:
                return "Love";
            case 1:
                return "Fifteen";
            case 2:
                return "Thirty";
            case 3:
                return "Forty";
            default:
                return "";
        }
    }
    }