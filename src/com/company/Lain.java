package com.company;

import java.awt.*;

public class Lain {
    private int x;

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

    private int y;
    private int height;
    private int width;


    public void paint(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(this.x, this.y, this.width, this.height);
    }
}
