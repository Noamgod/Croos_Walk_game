package com.company;

import java.awt.*;

public class Street {
    private Lain lain1, lain2, lain3, lain4, lain5, lain6, lain7, lain8, lain9, lain10, lain11, lain12,
            lain13, lain14, lain15, lain16, lain17,
            crosswalk_1, crosswalk_2, crosswalk_3, crosswalk_4, crosswalk_5, crosswalk_6, crosswalk_7, crosswalk_8;
    private Grass grass_r, grass_l;
    private Sky sky;
    private Red red1, red2, red3, red4, red5, red6;
    private White white1, white2, white3, white4;
    private Yellow yellow;


    public Street() {

//crass
        this.grass_r = new Grass();
        this.grass_l = new Grass();
//sideWalk
        this.red1 = new Red();
        this.red2 = new Red();
        this.red3 = new Red();
        this.red4 = new Red();
        this.red5 = new Red();
        this.red6 = new Red();
        this.white1 = new White();
        this.white2 = new White();
        this.white3 = new White();
        this.white4 = new White();
        this.yellow = new Yellow();
        //lain
        this.lain1 = new Lain();
        this.lain2 = new Lain();
        this.lain3 = new Lain();
        this.lain4 = new Lain();
        this.lain5 = new Lain();
        this.lain6 = new Lain();
        this.lain7 = new Lain();
        this.lain8 = new Lain();
        this.lain9 = new Lain();
        this.lain10 = new Lain();
        this.lain11 = new Lain();
        this.lain12 = new Lain();
        this.lain13 = new Lain();
        this.lain14 = new Lain();
        this.lain15 = new Lain();
        this.lain16 = new Lain();
        this.lain17 = new Lain();

// Crosswalk
        this.crosswalk_1 = new Lain();
        this.crosswalk_2 = new Lain();
        this.crosswalk_3 = new Lain();
        this.crosswalk_4 = new Lain();
        this.crosswalk_5 = new Lain();
        this.crosswalk_6 = new Lain();
        this.crosswalk_7 = new Lain();
        this.crosswalk_8 = new Lain();

// Coordinates and size
        grass_r.setX(0);
        grass_r.setY(0);
        grass_r.setWidth(Def.GRASS_WIDTH);
        grass_r.setHeight(Def.WINDOW_HEIGHT);
        grass_l.setX(Def.WINDOW_WIDTH - 468);
        grass_l.setY(0);
        grass_l.setWidth(Def.GRASS_WIDTH);
        grass_l.setHeight(Def.WINDOW_HEIGHT);
        red1.setX(grass_l.getWidth());
        red1.setY(10);
        red1.setWidth(Def.COLOR_WIDTH);
        red1.setHeight(Def.COLOR_HEIGHT);
        white1.setX(red1.getX());
        white1.setY(red1.getY() + red1.getHeight());
        white1.setHeight(Def.COLOR_HEIGHT);
        white1.setWidth(Def.COLOR_WIDTH);
        red2.setX(red1.getX());
        red2.setY(white1.getY() + white1.getHeight());
        red2.setHeight(Def.COLOR_HEIGHT);
        red2.setWidth(Def.COLOR_WIDTH);
        white2.setX(red1.getX());
        white2.setY(red2.getY() + red2.getHeight());
        white2.setHeight(Def.COLOR_HEIGHT);
        white2.setWidth(Def.COLOR_WIDTH);
        red3.setX(red1.getX());
        red3.setY(white2.getY() + white2.getHeight());
        red3.setHeight(Def.COLOR_HEIGHT);
        red3.setWidth(Def.COLOR_WIDTH);
        red4.setX(grass_l.getX() - red1.getWidth());
        red4.setY(10);
        red4.setWidth(Def.COLOR_WIDTH);
        red4.setHeight(Def.COLOR_HEIGHT);
        white3.setX(grass_l.getX() - red1.getWidth());
        white3.setY(red1.getY() + red1.getHeight());
        white3.setHeight(Def.COLOR_HEIGHT);
        white3.setWidth(Def.COLOR_WIDTH);
        red5.setX(grass_l.getX() - red1.getWidth());
        red5.setY(white1.getY() + white1.getHeight());
        red5.setHeight(Def.COLOR_HEIGHT);
        red5.setWidth(Def.COLOR_WIDTH);
        white4.setX(grass_l.getX() - red1.getWidth());
        white4.setY(red2.getY() + red2.getHeight());
        white4.setHeight(Def.COLOR_HEIGHT);
        white4.setWidth(Def.COLOR_WIDTH);
        red6.setX(grass_l.getX() - red1.getWidth());
        red6.setY(white2.getY() + white2.getHeight());
        red6.setHeight(Def.COLOR_HEIGHT);
        red6.setWidth(Def.COLOR_WIDTH);




        // crosswalks
        crosswalk_1.setY(red5.getY() - white3.getHeight() / 4);
        crosswalk_1.setX(red2.getX() + red2.getWidth() + 30);
        crosswalk_1.setHeight(Def.CROSS_WALK_HEIGHT);
        crosswalk_1.setWidth(Def.CROSS_WALK_WIDTH);
        crosswalk_2.setY(red5.getY() - white3.getHeight() / 4);
        crosswalk_2.setX(crosswalk_1.getX() + crosswalk_1.getWidth() + 59);
        crosswalk_2.setHeight(Def.CROSS_WALK_HEIGHT);
        crosswalk_2.setWidth(Def.CROSS_WALK_WIDTH);
        crosswalk_3.setY(red5.getY() - white3.getHeight() / 4);
        crosswalk_3.setX(crosswalk_2.getX() + crosswalk_2.getWidth() + 59);
        crosswalk_3.setHeight(Def.CROSS_WALK_HEIGHT);
        crosswalk_3.setWidth(Def.CROSS_WALK_WIDTH);
        crosswalk_4.setY(red5.getY() - white3.getHeight() / 4);
        crosswalk_4.setX(crosswalk_3.getX() + crosswalk_3.getWidth() + 59);
        crosswalk_4.setHeight(Def.CROSS_WALK_HEIGHT);
        crosswalk_4.setWidth(Def.CROSS_WALK_WIDTH);
        crosswalk_5.setY(red5.getY() - white3.getHeight() / 4);
        crosswalk_5.setX(crosswalk_4.getX() + crosswalk_4.getWidth() + 59);
        crosswalk_5.setHeight(Def.CROSS_WALK_HEIGHT);
        crosswalk_5.setWidth(Def.CROSS_WALK_WIDTH);
        crosswalk_6.setY(red5.getY() - white3.getHeight() / 4);
        crosswalk_6.setX(crosswalk_5.getX() + crosswalk_5.getWidth() + 59);
        crosswalk_6.setHeight(Def.CROSS_WALK_HEIGHT);
        crosswalk_6.setWidth(Def.CROSS_WALK_WIDTH);
        crosswalk_7.setY(red5.getY() - white3.getHeight() / 4);
        crosswalk_7.setX(crosswalk_6.getX() + crosswalk_6.getWidth() + 59);
        crosswalk_7.setHeight(Def.CROSS_WALK_HEIGHT);
        crosswalk_7.setWidth(Def.CROSS_WALK_WIDTH);
        crosswalk_8.setY(red5.getY() - white3.getHeight() / 4);
        crosswalk_8.setX(crosswalk_7.getX() + crosswalk_7.getWidth() + 59);
        crosswalk_8.setHeight(Def.CROSS_WALK_HEIGHT);
        crosswalk_8.setWidth(Def.CROSS_WALK_WIDTH);

        //lain
        lain1.setX(crosswalk_1.getX() + crosswalk_1.getWidth() + 25);
        lain1.setY(75);
        lain1.setHeight(Def.LAIN_HEIGHT);
        lain1.setWidth(Def.LAIN_WIDTH);
        lain2.setX(crosswalk_1.getX() + crosswalk_1.getWidth() + 25);
        lain2.setY(lain1.getHeight() + lain1.getY() + 75);
        lain2.setHeight(Def.LAIN_HEIGHT);
        lain2.setWidth(Def.LAIN_WIDTH);
        lain3.setX(crosswalk_1.getX() + crosswalk_2.getWidth() + 25);
        lain3.setY(lain1.getHeight() + lain2.getY() + 75);
        lain3.setHeight(Def.LAIN_HEIGHT);
        lain3.setWidth(Def.LAIN_WIDTH);
        lain4.setX(crosswalk_2.getX() + crosswalk_1.getWidth() + 25);
        lain4.setY(0);
        lain4.setHeight(Def.LAIN_HEIGHT);
        lain4.setWidth(Def.LAIN_WIDTH);
        lain5.setX(crosswalk_2.getX() + crosswalk_1.getWidth() + 25);
        lain5.setY(lain1.getHeight() + lain4.getY() + 75);
        lain5.setHeight(Def.LAIN_HEIGHT);
        lain5.setWidth(Def.LAIN_WIDTH);
        lain6.setX(crosswalk_2.getX() + crosswalk_1.getWidth() + 25);
        lain6.setY(lain1.getHeight() + lain5.getY() + 75);
        lain6.setHeight(Def.LAIN_HEIGHT);
        lain6.setWidth(Def.LAIN_WIDTH);
        lain7.setX(crosswalk_2.getX() + crosswalk_1.getWidth() + 25);
        lain7.setY(lain1.getHeight() + lain6.getY() + 75);
        lain7.setHeight(Def.LAIN_HEIGHT);
        lain7.setWidth(Def.LAIN_WIDTH);
        lain8.setX(crosswalk_3.getX() + crosswalk_1.getWidth() + 25);
        lain8.setY(lain1.getY());
        lain8.setHeight(Def.LAIN_HEIGHT);
        lain8.setWidth(Def.LAIN_WIDTH);
        lain9.setX(crosswalk_3.getX() + crosswalk_1.getWidth() + 25);
        lain9.setY(lain3.getY());
        lain9.setHeight(Def.LAIN_HEIGHT);
        lain9.setWidth(Def.LAIN_WIDTH);
        lain10.setX(crosswalk_5.getX() + crosswalk_1.getWidth() + 25);
        lain10.setY(lain1.getY());
        lain10.setHeight(Def.LAIN_HEIGHT);
        lain10.setWidth(Def.LAIN_WIDTH);
        lain11.setX(crosswalk_5.getX() + crosswalk_1.getWidth() + 25);
        lain11.setY(lain3.getY());
        lain11.setHeight(Def.LAIN_HEIGHT);
        lain11.setWidth(Def.LAIN_WIDTH);
        lain12.setX(crosswalk_6.getX() + crosswalk_1.getWidth() + 25);
        lain12.setY(lain4.getY());
        lain12.setHeight(Def.LAIN_HEIGHT);
        lain12.setWidth(Def.LAIN_WIDTH);
        lain13.setX(crosswalk_6.getX() + crosswalk_1.getWidth() + 25);
        lain13.setY(lain1.getHeight() + lain12.getY() + 75);
        lain13.setHeight(Def.LAIN_HEIGHT);
        lain13.setWidth(Def.LAIN_WIDTH);
        lain14.setX(crosswalk_6.getX() + crosswalk_1.getWidth() + 25);
        lain14.setY(lain1.getHeight() + lain13.getY() + 75);
        lain14.setHeight(Def.LAIN_HEIGHT);
        lain14.setWidth(Def.LAIN_WIDTH);
        lain15.setX(crosswalk_6.getX() + crosswalk_1.getWidth() + 25);
        lain15.setY(lain1.getHeight() + lain14.getY() + 75);
        lain15.setHeight(Def.LAIN_HEIGHT);
        lain15.setWidth(Def.LAIN_WIDTH);
        lain16.setX(crosswalk_7.getX() + crosswalk_1.getWidth() + 25);
        lain16.setY(lain1.getY());
        lain16.setHeight(Def.LAIN_HEIGHT);
        lain16.setWidth(Def.LAIN_WIDTH);
        lain17.setX(crosswalk_7.getX() + crosswalk_7.getWidth() + 25);
        lain17.setY(lain3.getY());
        lain17.setHeight(Def.LAIN_HEIGHT);
        lain17.setWidth(Def.LAIN_WIDTH);

    }

    public void paint(Graphics g) {
        this.grass_l.paint(g);
        this.grass_r.paint(g);
        //Right
        this.red1.paint(g);
        this.white1.paint(g);
        this.red2.paint(g);
        this.white2.paint(g);
        this.red3.paint(g);
        //Left
        this.red4.paint(g);
        this.white3.paint(g);
        this.red5.paint(g);
        this.white4.paint(g);
        this.red6.paint(g);
        //yellow line
        this.yellow.Paint(g);
        //crosswalks
        this.crosswalk_1.paint(g);
        this.crosswalk_2.paint(g);
        this.crosswalk_3.paint(g);
        this.crosswalk_4.paint(g);
        this.crosswalk_5.paint(g);
        this.crosswalk_6.paint(g);
        this.crosswalk_7.paint(g);
        this.crosswalk_8.paint(g);
        //lain
        this.lain1.paint(g);
        this.lain3.paint(g);
        this.lain4.paint(g);
        this.lain5.paint(g);
        this.lain6.paint(g);
        this.lain7.paint(g);
        this.lain8.paint(g);
        this.lain9.paint(g);
        this.lain10.paint(g);
        this.lain11.paint(g);
        this.lain12.paint(g);
        this.lain13.paint(g);
        this.lain14.paint(g);
        this.lain15.paint(g);
        this.lain16.paint(g);
        this.lain17.paint(g);

    }
}
