public class Main {
    /**
     * metodo para devolver la puntuacion de tenis
     */
    public static String getScore(int player1Score, int player2Score) {
        if (player1Score < 0 || player2Score < 0 || player1Score > 4 || player2Score > 4) {
            return "Invalid score input!";
        }

        String score = "";

        if (player1Score == player2Score) {
            score = getTieScore(player1Score);
        }
        else if (player1Score >= 4 || player2Score >= 4) {
            score = getWinnerScore(player1Score, player2Score);
        }
        else {
            score = getNormalScore(player1Score, player2Score);
        }

        return score;
    }

    /**
     * Método para obtener la puntuación cuando hay un empate.
     */
    private static String getTieScore(int player1Score) {
        String score = "";

        switch (player1Score) {
            case 0:
                score = "Love-All";
                break;
            case 1:
                score = "Fifteen-All";
                break;
            case 2:
                score = "Thirty-All";
                break;
            case 3:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;
        }

        return score;
    }

    /**
     * Método para obtener el marcador en los casos en los que hay un ganador.
     */
    private static String getWinnerScore(int player1Score, int player2Score) {
        String score = "";
        int minusResult = player1Score - player2Score;

        if (minusResult == 1) {
            score = "Advantage player1";
        } else if (minusResult == -1) {
            score = "Advantage player2";
        } else if (minusResult >= 2) {
            score = "Win for player1";
        } else {
            score = "Win for player2";
        }

        return score;
    }

    /**
     * Método para obtener el marcador normal sin empate.
     */
    private static String getNormalScore(int player1Score, int player2Score) {
        String score = "";

        int tempScore = 0;
        for (int i = 1; i < 3; i++) {
            if (i == 1) {
                tempScore = player1Score;
            } else {
                score += "-";
                tempScore = player2Score;
            }

            switch (tempScore) {
                case 0:
                    score += "Love";
                    break;
                case 1:
                    score += "Fifteen";
                    break;
                case 2:
                    score += "Thirty";
                    break;
                case 3:
                    score += "Forty";
                    break;
            }
        }

        return score;
    }
}
