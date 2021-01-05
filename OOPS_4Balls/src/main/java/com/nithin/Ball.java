package com.nithin;

import processing.core.PApplet;

public class Ball {

    int x, y, speed, diameter;

    public Ball(int x, int y, int speed, int diameter) {

        this.x = x;
        this.y = y;
        this.speed = speed;
        this.diameter = diameter;
    }

    public Ball(int y, int speed, int diameter) {

        this.y = y;
        this.speed = speed;
        this.diameter = diameter;
    }

    public void update(){

        this.x += this.speed;
    }

    public void draw(PApplet canvas){

        canvas.ellipse(this.x, this.y, 10, 10);
        update();
    }
}
