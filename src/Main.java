public class Main {
    /**
     * metodo para devolver la puntuacion de tenis
     */
    public static String getScore(int player1Score, int player2Score) {
        String score = "";
        int tempScore = 0;

        // Caso empate
        if (player1Score == player2Score) {
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
        }
        // Caso "Advantage" o "Win"
        else if (player1Score >= 4 || player2Score >= 4) {
            int scoreDifference = player1Score - player2Score;

            // Asegurarse de que la diferencia es 1 o mayor para "Advantage"
            if (scoreDifference == 1) {
                score = "Advantage player1";
            } else if (scoreDifference == -1) {
                score = "Advantage player2";
            } else if (scoreDifference >= 2) {
                score = "Win for player1";
            } else {
                score = "Win for player2";
            }
        }
        // Caso normal
        else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = player1Score;
                else {
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
