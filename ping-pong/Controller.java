package sample.control;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

public class Controller {

    private Timeline timeline;
    @FXML
    Rectangle platformPlayer;
    @FXML
    Label winBoard;
    @FXML
    Rectangle platformComputer;
    @FXML
    Label scorePlayer;
    @FXML
    Label scoreCoputer;
    @FXML
    Circle ball;
    public double cmpY = 105.0;
    public double cmpX = 568.0;
    public double ballY = 185.0;
    public double ballX = 295.0;
    public double plX = 14.0;
    public double plY = 105.0;
    public int scorePlayerInt = 1;
    public int scoreComputerInt = 1;
    public boolean closeFrameAgain = true;
    public boolean closeMoveBall = true;
    public double speedX = 0 + (int) (Math.random() * 3) - 1;
    public double speedY = 0 + (int) (Math.random() * 3) - 1;

    @FXML
    public void frame() {
        if (closeFrameAgain) {
            closeFrameAgain = false;
            KeyFrame keyFrame = new KeyFrame(new Duration(10), event -> {
                moveBall();
                win();
            }
            );
            KeyFrame keyFrame1 = new KeyFrame(new Duration(250), event -> {
                movePlatformComputer();
            }
            );
            timeline = new Timeline(keyFrame);
            timeline.setCycleCount(Timeline.INDEFINITE);
            timeline.play();
            timeline = new Timeline(keyFrame1);
            timeline.setCycleCount(Timeline.INDEFINITE);
            timeline.play();
        }
    }

    public void keyEvant(javafx.scene.input.KeyEvent event) {
        KeyCode keyCode;
        KeyCode a = event.getCode();
        movePlatformPlayer(event);
    }

    public void movePlatformPlayer(javafx.scene.input.KeyEvent event) {
        KeyCode keyCode;
        double plY = platformPlayer.getLayoutY();
        KeyCode a = event.getCode();
        if ((a == KeyCode.S) && (platformPlayer.getLayoutY() != 225)) {
            platformPlayer.setLayoutY(plY + 15);
        } else if ((a == KeyCode.W) && (platformPlayer.getLayoutY() != 15)) {
            platformPlayer.setLayoutY(plY - 15);
        }
    }

    private void movePlatformComputer() {
        double cmpY = platformComputer.getLayoutY();
        if (platformComputer.getLayoutY() != ball.getCenterY()) {
            if ((platformComputer.getLayoutY() > ball.getLayoutY() - (platformComputer.getHeight() / 2)) && (platformComputer.getLayoutY() != 15)) {
                platformComputer.setLayoutY(cmpY - 15);
            } else if ((platformComputer.getLayoutY() < ball.getLayoutY() - (platformComputer.getHeight() / 2)) && (platformComputer.getLayoutY() != 225)) {
                platformComputer.setLayoutY(cmpY + 15);
            }
        }
    }

    private void moveBall() {
        if (closeMoveBall) {
            double plY1 = platformPlayer.getLayoutY();
            double plY2 = platformPlayer.getLayoutY() + platformPlayer.getHeight();
            double bPoz = ball.getLayoutY();
            double comY1 = platformComputer.getLayoutY();
            double comY2 = platformComputer.getLayoutY() + platformComputer.getHeight();

            if ((speedX != 0) && (speedX != 0) && (speedY != 0) && (speedY != 0)) {
                if ((ball.getLayoutY() < 30) || (ball.getLayoutY() > 374)) {
                    speedY = speedY * (-1);
                }
                if ((bPoz > plY1) && (bPoz < plY2) && ((platformPlayer.getLayoutX() + (platformPlayer.getWidth() * 2) == ball.getLayoutX()))) {
                    speedX = speedX * (-1);
                } else if ((bPoz > comY1) && (bPoz < comY2) && (platformComputer.getLayoutX() - platformComputer.getWidth() == ball.getLayoutX())) {
                    speedX = speedX * (-1);
                } else if (ball.getLayoutX() < 0) {
                    winBoard.setText("");
                    reset();
                    ScoreCoputer_();

                } else if (ball.getLayoutX() > 600) {
                    winBoard.setText("");
                    reset();
                    scorePlayer_();
                }
                ball.setLayoutX(ball.getLayoutX() + speedX);
                ball.setLayoutY(ball.getLayoutY() + speedY);
            } else {
                speedX = 0 + (int) (Math.random() * 3) - 1;
                speedY = 0 + (int) (Math.random() * 3) - 1;
            }
        }
    }

    public void scorePlayer_() {
        String scorePlayerST = String.valueOf(scorePlayerInt);
        scorePlayer.setText(scorePlayerST);
        scorePlayerInt++;
    }

    public void ScoreCoputer_() {
        String scorePlayerST = String.valueOf(scoreComputerInt);
        scoreCoputer.setText(scorePlayerST);
        scoreComputerInt++;
    }

    public void win() {
        if (scoreComputerInt == 9) {
            winBoard.setText("Computer Win");
            endGame();
        } else if (scorePlayerInt == 9) {
            winBoard.setText("Player Win");
            endGame();
        }
    }

    public void endGame() {
        speedX = 0;
        speedY = 0;
        closeMoveBall = false;
        scoreComputerInt = 1;
        scorePlayerInt = 1;
        scorePlayer.setText("0");
        scoreCoputer.setText("0");
    }

    public void reset() {
        platformComputer.setLayoutY(cmpY);
        closeMoveBall = true;
        platformComputer.setLayoutX(cmpX);
        ball.setCenterX(ball.getCenterX());
        ball.setLayoutX(ballX);
        ball.setLayoutY(ballY);
        platformPlayer.setLayoutY(plY);
        platformPlayer.setLayoutX(plX);
        scoreComputerInt = 1;
        scorePlayerInt = 1;
        speedX = 0 + (int) (Math.random() * 3) - 1;
        speedY = 0 + (int) (Math.random() * 3) - 1;
        winBoard.setText("");
    }
}
