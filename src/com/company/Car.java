package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.Random;


public class Car extends Canvas {
    // location of y
    public static int car_Green_Y;
    public static int car_Light_Blue_Y = Def.WINDOW_HEIGHT;
    public static int car_Orange_Y = -196;
    public static int car_Pink_Y = -196;
    public static int car_Yellow_Y = Def.WINDOW_HEIGHT;
    public static int car_Police_Y = Def.WINDOW_HEIGHT;
    public static int car_Purple_Y = -196;
    public static int car_Red_Y = Def.WINDOW_HEIGHT;

    //location of x

    public static int car_Green_X = 110;
    public static int car_LightBlue_X = 250;
    public static int car_Orange_X = 390;
    public static int car_Pink_X = 530;
    public static int car_Yellow_X = 670;
    public static int car_Police_X = 810;
    public static int car_Purple_X = 950;
    public static int car_Red_X = 1090;


    private Random random = new Random();

    private int rG = random.nextInt(5)  + 3;
    private int rLB = random.nextInt(5) + 3;
    private int rO = random.nextInt(5)  + 3;
    private int rP = random.nextInt(5)  + 3;
    private int rY = random.nextInt(5)  + 3;
    private int rPO = random.nextInt(5) + 3;
    private int rPU = random.nextInt(5) + 3;
    private int rR = random.nextInt(5)  + 3;

    public ImageIcon carGreen, carLightBlue, carPink, carYellow, carPolice, carOrange, carPurple, carRed,timer;

    public boolean isFlag() {
        return flag;
    }

    private boolean flag = false;


    public Car() {
        this.car_Green_Y = Def.WINDOW_HEIGHT;
        this.carGreen = new ImageIcon("image/car_green.png");
        this.carLightBlue = new ImageIcon("image/car_light_blue.png");
        this.carPink = new ImageIcon("image/car_pink.png");
        this.carYellow = new ImageIcon("image/car_yellow.png");
        this.carPolice = new ImageIcon("image/police_car.png");
        this.carOrange = new ImageIcon("image/car_Orange.png");
        this.carPurple = new ImageIcon("image/car_purple.png");
        this.carRed = new ImageIcon("image/car_red.png");
        this.timer =new ImageIcon("image/Chaim.gif");
    }

    public void paint(Graphics g) {
        this.carGreen.paintIcon(this, g, car_Green_X, car_Green_Y);
        this.carLightBlue.paintIcon(this, g, car_LightBlue_X, car_Light_Blue_Y);
        this.carPink.paintIcon(this, g, car_Pink_X, car_Pink_Y);
        this.carYellow.paintIcon(this, g, car_Yellow_X, car_Yellow_Y);
        this.carPolice.paintIcon(this, g, car_Police_X, car_Police_Y);
        this.carOrange.paintIcon(this, g, car_Orange_X, car_Orange_Y);
        this.carPurple.paintIcon(this, g, car_Purple_X, car_Purple_Y);
        this.carRed.paintIcon(this, g, car_Red_X, car_Red_Y);
        this.timer.paintIcon(this,g,car_Red_X+95,0);

        moveAllCar();

    }

    private void moveAllCar() {

        car_Green_Y = moveCarUp(car_Green_Y, rG);
        car_Light_Blue_Y = moveCarUp(car_Light_Blue_Y, rLB);
        car_Orange_Y = moveCarDown(car_Orange_Y, rO);
        car_Pink_Y = moveCarDown(car_Pink_Y, rP);
        car_Yellow_Y = moveCarUp(car_Yellow_Y, rY);
        car_Police_Y = moveCarUp(car_Police_Y, rPO);
        car_Purple_Y = moveCarDown(car_Purple_Y, rPU);
        car_Red_Y = moveCarUp(car_Red_Y, rR);
    }


    public int moveCarDown(int carColor, int random) {

        if (carColor <= Def.WINDOW_HEIGHT + 222) {
            carColor += random;

        } else {
            carColor = -222;
        }
        return carColor;
    }

    public int moveCarUp(int car_Y, int random) {
        if (car_Y <= -222) {
            car_Y = Def.WINDOW_HEIGHT;
        } else {
            car_Y -= random;

        }
        return car_Y;
    }

    public boolean collision(Player player) {
        Rectangle head = new Rectangle(player.head.getX(), player.head.getY(), player.head.getWidth(), player.head.getHeight());
        Rectangle arm_r = new Rectangle(player.arm_r.getX(), player.arm_r.getY(), player.arm_r.getWidth(), player.arm_r.getHeight());
        Rectangle arm_l = new Rectangle(player.arm_l.getX(), player.arm_l.getY(), player.arm_l.getWidth(), player.arm_l.getHeight());
        Rectangle leg_l = new Rectangle(player.leg_l.getX(), player.leg_l.getY(), player.leg_l.getWidth(), player.leg_l.getHeight());
        Rectangle leg_r = new Rectangle(player.leg_r.getX(), player.leg_r.getY(), player.leg_r.getWidth(), player.leg_r.getHeight());

        Rectangle carGreen = new Rectangle(car_Green_X + 10, car_Green_Y + 8, 80, 196);
        Rectangle carLightBlue = new Rectangle(car_LightBlue_X + 10, car_Light_Blue_Y + 8, 80, 196);
        Rectangle carOrange = new Rectangle(car_Orange_X + 10, car_Orange_Y, 80, 190);
        Rectangle carPink = new Rectangle(car_Pink_X + 10, car_Pink_Y, 80, 190);
        Rectangle carPurple = new Rectangle(car_Purple_X + 10, car_Purple_Y, 80, 190);
        Rectangle carRed = new Rectangle(car_Red_X + 10, car_Red_Y + 8, 80, 196);
        Rectangle carYellow = new Rectangle(car_Yellow_X + 10, car_Yellow_Y + 8, 80, 196);
        Rectangle police = new Rectangle(car_Police_X + 10, car_Police_Y + 8, 80, 196);

        if (carGreen.intersects(head) || carGreen.intersects(arm_r) || carGreen.intersects(arm_l) || carGreen.intersects(leg_r) | carGreen.intersects(leg_l) |
                carLightBlue.intersects(head) || carLightBlue.intersects(arm_r) || carLightBlue.intersects(arm_l) || carLightBlue.intersects(leg_r) || carLightBlue.intersects(leg_l) ||
                carPink.intersects(head) || carPink.intersects(arm_r) || carPink.intersects(arm_l) || carPink.intersects(leg_r) || carOrange.intersects(arm_l) ||
                carOrange.intersects(head) || carOrange.intersects(arm_r) || carOrange.intersects(arm_l) || carOrange.intersects(leg_r) || carOrange.intersects(arm_l) ||
                carPurple.intersects(head) || carPurple.intersects(arm_r) || carPurple.intersects(arm_l) || carPurple.intersects(leg_r) || carPurple.intersects(arm_l) ||
                carRed.intersects(head) || carRed.intersects(arm_r) || carRed.intersects(arm_l) || carRed.intersects(leg_r) || carRed.intersects(arm_l) ||
                carYellow.intersects(head) || carYellow.intersects(arm_r) || carYellow.intersects(arm_l) || carYellow.intersects(leg_r) || carRed.intersects(arm_l) ||
                police.intersects(head) || police.intersects(arm_r) || police.intersects(arm_l) || police.intersects(leg_r) || police.intersects(arm_l)
        ) {
            this.flag = true;

        } else flag = false;
        return flag;

    }
}