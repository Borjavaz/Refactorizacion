public class Main {
    /**
     * metodo para devolver la puntuacion de tenis
     */

        public static String getScore(int player1Score, int player2Score) {
            String score = "";

            if (player1Score == player2Score) {
                score = getEqualScore(player1Score);
            } else if (player1Score >= 4 || player2Score >= 4) {
                int scoreDifference = player1Score - player2Score;
                if (scoreDifference == 1) score = "Advantage player1";
                else if (scoreDifference == -1) score = "Advantage player2";
                else if (scoreDifference >= 2) score = "Win for player1";
                else score = "Win for player2";
            } else {
                for (int i = 1; i < 3; i++) {
                    int tempScore = (i == 1) ? player1Score : player2Score;
                    if (i == 2) score += "-";
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

        private static String getEqualScore(int score) {
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
    }