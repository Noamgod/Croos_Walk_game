package com.company;

import java.awt.*;

public class Leg {

    private int x;
    private int y;
    private int width;
    private int height;


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    public void paint(Graphics g) {
        g.setColor(Color.orange);
        g.fillRect(this.x, this.y, this.width, this.height);

    }
    public void  moveRight(){
        x+=2;
    }
    public void  moveLeft(){
        x-=2;
    }
    public void moveDown() { y++; }
    public void moveUp() {
        y--;
    }
}
