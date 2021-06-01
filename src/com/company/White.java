package com.company;

import java.awt.*;

public class White {
    private int x;
    private int y;
    private int height;
    private int width;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void paint(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(this.x, this.y, this.width, this.height);
    }

}
