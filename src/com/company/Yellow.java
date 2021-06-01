package com.company;

import java.awt.*;

public class Yellow {
    private int x;
    private int y;
    private int height;
    private int width;

    public void Paint(Graphics g){
        g.setColor(Color.YELLOW);
        g.fillRect(Def.YELLOW_X,Def.YELLOW_Y,Def.YELLOW_WIDTH,Def.YELLOW_HEIGHT);
    }


}
