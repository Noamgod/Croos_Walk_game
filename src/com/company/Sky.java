package com.company;

import java.awt.*;

public class  Sky{
    private int x;
    private int y;
    private int height;
    private int width;

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



    public void paint(Graphics g){
        g.setColor(Color.CYAN);
        g.fillRect(Def.SKY_X,Def.SKY_Y,Def.SKY_WIDTH, Def.SKY_HEIGHT);

    }
}
