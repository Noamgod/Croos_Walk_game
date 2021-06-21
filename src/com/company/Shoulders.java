package com.company;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Shoulders {

    private int x;
    private int y;
    private int height;
    private int width;

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

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void paint(Graphics g) {
        g.setColor(Color.orange);
        g.fillRect(this.x, this.y, this.width, this.height);
    }

    public void moveRight(Shoulders shoulders) {
        shoulders.setX(shoulders.getX() + 1);
    }

    public void moveRight(int key) {
        if (key == KeyEvent.VK_RIGHT)
            this.x+=2;
        if(key == KeyEvent.VK_SPACE)
            this.x+=5;
    }

    public void moveLeft() {
        x-=2;
    }

}
