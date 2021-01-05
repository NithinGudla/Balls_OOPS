package com.nithin;

import processing.core.PApplet;
import java.awt.*;

public class BallGame extends PApplet {

    Dimension screenDimensions;
    int screenWidth, screenHeight;
    int canvasHeight, canvasWidth;
    Ball[] balls;
    int fifthPartOfHeight;
    public static final int DIAMETER = 10;
    public static final int NUMBER_OF_BALLS = 4;
    public static final String CLASS_NAME = "com.nithin.BallGame";

    public static void main(String[] args){

        PApplet.main(CLASS_NAME, args);
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


        balls = new Ball[NUMBER_OF_BALLS];
        fifthPartOfHeight = (canvasHeight / (NUMBER_OF_BALLS + 1));

        for(int i = 0; i < balls.length; i++)
            balls[i] = new Ball((i + 1) * fifthPartOfHeight, i + 1, DIAMETER);

    }

    @Override
    public void draw() {

        for (Ball ball : balls)
            ball.draw(this);
    }
}
