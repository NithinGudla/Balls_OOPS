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

        ball1 = new Ball(0, canvasHeight / 5, 1, DIAMETER);
        ball2 = new Ball(0, 2 * canvasHeight / 5, 2, DIAMETER);
        ball3 = new Ball(0, 3 * canvasHeight / 5, 3, DIAMETER);
        ball4 = new Ball(0, 4 * canvasHeight / 5, 4, DIAMETER);
    }

    @Override
    public void draw() {

        ball1.draw(this);
        ball2.draw(this);
        ball3.draw(this);
        ball4.draw(this);
    }
}
