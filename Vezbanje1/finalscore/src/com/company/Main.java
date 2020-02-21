package com.company;


public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println(" your score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println(" your score was " + highScore);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Dusan",highScorePosition);
         highScorePosition = calculateHighScorePosition(800);
        displayHighScorePosition("BOB",highScorePosition);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " you have managed to be "
                + position + "on the highscore table");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return  1;
        } else if (playerScore >= 500 ) {
            return  2;
        } else if (playerScore >= 100) {
            return  3;
        } else {
            return  4;
        }
    }

}

