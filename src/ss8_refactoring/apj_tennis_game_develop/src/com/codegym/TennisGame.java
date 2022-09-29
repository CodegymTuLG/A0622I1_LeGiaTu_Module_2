package ss8_refactoring.apj_tennis_game_develop.src.com.codegym;

public class TennisGame {

    public static String getScore(String playerName1, String playerName2, int playerScore1, int playerScore2) {
        boolean isDraw = playerScore1 == playerScore2;
        boolean isHaveWinner = playerScore1 >= 4 || playerScore2 >= 4;
        if (isDraw) {
            return getDrawGame(playerScore1);
        }
        if (isHaveWinner) {
            return getWinner(playerScore1, playerScore2);
        }
        return getScore(playerScore1) + "-" + getScore(playerScore2);
    }

    public static String getDrawGame(int drawScore) {
        switch (drawScore) {
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

    public static String getWinner(int playerScore1, int playerScore2) {
        int minusResult = playerScore1 - playerScore2;

        if (minusResult == 1) {
            return "Advantage player1";
        } else if (minusResult == -1) {
            return "Advantage player2";
        } else if (minusResult >= 2) {
            return "Win for player1";
        } else {
            return "Win for player2";
        }
    }

    private static String getScore(int playerScore) {
        switch (playerScore) {
            case 0:
                return "Love";
            case 1:
                return "Fifteen";
            case 2:
                return "Thirty";
            default:
                return "Forty";
        }
    }
}

