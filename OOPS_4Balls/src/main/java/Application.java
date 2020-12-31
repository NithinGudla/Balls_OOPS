import processing.core.PApplet;

import java.awt.*;

public class Application extends PApplet {


    Dimension screenDimensions;
    int screenWidth, screenHeight;
    int canvasHeight, canvasWidth;
    Ball ball1, ball2, ball3, ball4;
    public static final int DIAMETER = 10;


    public static void main(String[] args){

        PApplet.main("Application", args);
    }

    @Override
    public void settings() {

        screenDimensions = Toolkit.getDefaultToolkit().getScreenSize();
        screenWidth = screenDimensions.width;
        screenHeight = screenDimensions.height;

        canvasHeight = screenHeight / 2;
        canvasWidth = screenWidth / 2;

        size(canvasWidth, canvasHeight);
    }

    @Override
    public void setup() {

        ball1 = new Ball(0, canvasHeight / 5, 1);
        ball2 = new Ball(0, 2 * canvasHeight / 5, 2);
        ball3 = new Ball(0, 3 * canvasHeight / 5, 3);
        ball4 = new Ball(0, 4 * canvasHeight / 5, 4);
    }

    @Override
    public void draw() {

        drawBall(ball1);
        drawBall(ball2);
        drawBall(ball3);
        drawBall(ball4);
    }

    public void drawBall(Ball ball){

        ellipse(ball.x, ball.y, DIAMETER, DIAMETER);
        ball.update();
    }
}
