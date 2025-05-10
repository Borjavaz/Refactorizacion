public class Main {
    /**
     * metodo para devolver la puntuacion de tenis
     */
    public static String getScore(int m_score1, int m_score2) {
        String score = "";

        if (m_score1 == m_score2) {
            score = getTieScore(m_score1);
        }
        else if (m_score1 >= 4 || m_score2 >= 4) {
            score = getWinnerScore(m_score1, m_score2);
        }
        else {
            score = getNormalScore(m_score1, m_score2);
        }

        return score;
    }

    /**
     * Método para obtener la puntuación cuando hay un empate.
     */
    private static String getTieScore(int m_score1) {
        String score = "";

        switch (m_score1) {
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
    private static String getWinnerScore(int m_score1, int m_score2) {
        String score = "";
        int minusResult = m_score1 - m_score2;

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
    private static String getNormalScore(int m_score1, int m_score2) {
        String score = "";

        int tempScore = 0;
        for (int i = 1; i < 3; i++) {
            if (i == 1) {
                tempScore = m_score1;
            } else {
                score += "-";
                tempScore = m_score2;
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
