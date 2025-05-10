public class Main {
    /**
     * metodo para devolver la puntuacion de tenis
     */

        public static String getScore(int scorePlayer1, int scorePlayer2) {
            String score = "";

            // Si los puntajes son iguales
            if (scorePlayer1 == scorePlayer2) {
                score = getTieScore(scorePlayer1);
            }
            // Si un jugador tiene más de 4 puntos
            else if (scorePlayer1 >= 4 || scorePlayer2 >= 4) {
                int minusResult = scorePlayer1 - scorePlayer2;
                if (minusResult == 1) score = "Advantage player1";
                else if (minusResult == -1) score = "Advantage player2";
                else if (minusResult >= 2) score = "Win for player1";
                else score = "Win for player2";
            }
            // Si los puntajes no son iguales y ninguno tiene más de 4 puntos
            else {
                score = getNormalScore(scorePlayer1, scorePlayer2);
            }

            return score;
        }

        /**
         * Devuelve la puntuación de empate
         */
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

        /**
         * Devuelve la puntuación normal para los casos que no son empate
         */
        private static String getNormalScore(int scorePlayer1, int scorePlayer2) {
            String score = "";
            int tempScore = 0;
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = scorePlayer1;
                else {
                    score += "-";
                    tempScore = scorePlayer2;
                }
                score += getScoreName(tempScore);
            }
            return score;
        }

        /**
         * Devuelve el nombre de la puntuación
         */
        private static String getScoreName(int score) {
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
