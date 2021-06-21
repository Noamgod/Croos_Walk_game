package com.company;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Player {

    private Graphics g;
    private Font font;
    public Head head;
    public Body body;
    public Arm arm_l, arm_r;
    public Leg leg_l, leg_r;
    public Shoulders shoulders_l, shoulders_r;
    public Eyes eyes_r, eyes_l, eyes_middle;

    public boolean isFlag() {
        return flag;
    }

    private boolean flag = false, flag1 = false;

    public boolean isFlag1() {
        return flag1;
    }

    public Player() {
        this.head = new Head();
        this.body = new Body();
        this.arm_l = new Arm();
        this.arm_r = new Arm();
        this.leg_l = new Leg();
        this.leg_r = new Leg();
        this.shoulders_l = new Shoulders();
        this.shoulders_r = new Shoulders();
        this.eyes_l = new Eyes();
        this.eyes_r = new Eyes();
        this.eyes_middle = new Eyes();
        paintPlayer();
    }

    private void paintPlayer() {
        body.setX(Def.BODY_X);
        body.setY(Def.BODY_Y);
        body.setHeight(Def.BODY_HEIGHT);
        body.setWidth(Def.BODY_WIDTH);
        head.setX(body.getX());
        head.setHeight(body.getHeight() / 2);
        head.setWidth(body.getWidth());
        head.setY(body.getY() - head.getHeight());
        leg_r.setX(body.getX());
        leg_r.setY(body.getY() + body.getHeight());
        leg_r.setHeight(Def.LEG_HEIGHT);
        leg_r.setWidth(Def.LEG_WIDTH);
        leg_l.setX(body.getX() + body.getWidth() - leg_r.getWidth());
        leg_l.setY(leg_r.getY());
        leg_l.setHeight(Def.LEG_HEIGHT);
        leg_l.setWidth(Def.LEG_WIDTH);
        shoulders_l.setWidth(Def.SHOULDERS_WIDTH);
        shoulders_l.setHeight(Def.SHOULDERS_HEIGHT);
        shoulders_l.setY(body.getY());
        shoulders_l.setX(body.getX() - shoulders_l.getWidth());
        shoulders_r.setWidth(Def.SHOULDERS_WIDTH);
        shoulders_r.setHeight(Def.SHOULDERS_HEIGHT);
        shoulders_r.setY(body.getY());
        shoulders_r.setX(body.getX() + body.getWidth());
        arm_r.setX(shoulders_r.getX() + Def.SHOULDERS_WIDTH);
        arm_r.setY(shoulders_r.getY());
        arm_r.setHeight(Def.ARM_HEIGHT);
        arm_r.setWidth(Def.ARM_WIDTH);
        arm_l.setX(shoulders_l.getX() - shoulders_l.getWidth());
        arm_l.setY(body.getY());
        arm_l.setHeight(Def.ARM_HEIGHT);
        arm_l.setWidth(Def.ARM_WIDTH);
        eyes_l.setX(head.getX() + head.getWidth() / 4);
        eyes_l.setY(head.getY() + head.getHeight() / 2 - 10);
        eyes_l.setHeight(10);
        eyes_l.setWidth(10);
        eyes_r.setX(eyes_l.getX() + 15);
        eyes_r.setY(head.getY() + head.getHeight() / 2 - 10);
        eyes_r.setHeight(10);
        eyes_r.setWidth(10);
        eyes_middle.setX((eyes_l.getX()+eyes_l.getX())/2+10);
        eyes_middle.setY(eyes_l.getY() + 10);
        eyes_middle.setWidth(8);
        eyes_middle.setHeight(8);
    }

    public void paint(Graphics g) {
        this.head.paint(g);
        this.body.paint(g);
        this.leg_r.paint(g);
        this.leg_l.paint(g);
        this.shoulders_l.paint(g);
        this.shoulders_r.paint(g);
        this.arm_r.paint(g);
        this.arm_l.paint(g);
        this.eyes_l.paint(g);
        this.eyes_r.paint(g);
        this.eyes_middle.paint(g);
        if (checkWin(arm_r.getX())) {
            flag1 = true;
        }
    }


    public void moveRight(int key) {
        arm_l.moveRight(key);
        arm_r.moveRight(key);
        body.moveRight(key);
        head.moveRight(key);
        shoulders_l.moveRight(key);
        shoulders_r.moveRight(key);
        leg_l.moveRight(key);
        leg_r.moveRight(key);
        eyes_l.moveRight(key);
        eyes_r.moveRight(key);
        eyes_middle.moveRight(key);

    }

    public void moveLeft() {
        arm_l.moveLeft();
        arm_r.moveLeft();
        body.moveLeft();
        head.moveLeft();
        shoulders_l.moveLeft();
        shoulders_r.moveLeft();
        leg_l.moveLeft();
        leg_r.moveLeft();
        eyes_l.moveLeft();
        eyes_r.moveLeft();
        eyes_middle.moveLeft();
    }

    public int getArm_l() {
        int getArmL = arm_l.getX();
        return getArmL;
    }

    public boolean checkWin(int arm) {
        if (arm_l.getX() >= 1202) {
            flag = true;             //The X location of red5 1202
        } else {
            flag = false;
        }
        return flag;
    }

}

