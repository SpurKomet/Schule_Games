package de.spurkomet.schule_games.pong;

import processing.core.PApplet;

public class pong extends PApplet {


    drawObject ball, leftBar, rightBar;
    @Override
    public void settings() {
        super.settings();
    }

    @Override
    public void setup() {
        super.setup();
        ball = new drawObject(random(width), random(height), 50, 50);
        leftBar = new drawObject(0 , (height/2)+(100/2), 10, 100);
        leftBar = new drawObject(width-10, (height/2)+(100/2), 10, 100);
    }

    @Override
    public void draw() {
        super.draw();
    }
}
