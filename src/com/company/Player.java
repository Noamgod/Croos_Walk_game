package com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.awt.*;

    public class Player extends Car {
        private Graphics g;
        private Font font;
        private Head head;
        private Body body;


        private Arm arm_l, arm_r;
        private Leg leg_l, leg_r;
        private Shoulders shoulders_l, shoulders_r;

        public Player() {
            this.head = new Head();
            this.body = new Body();
            this.arm_l = new Arm();
            this.arm_r = new Arm();
            this.leg_l = new Leg();
            this.leg_r = new Leg();
            this.shoulders_l = new Shoulders();
            this.shoulders_r = new Shoulders();
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
            System.out.println("LeftY "+arm_l.getY());
            System.out.println("LeftX "+arm_l.getX());
            System.out.println("rightY "+arm_r.getY());
            System.out.println("RightX "+arm_r.getX());

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
//        if (CheckCar()) {
//            this.paintLose(g);
//        }
        }

        public boolean CheckCar() {

            if (checkLose(carGreen, car_Green_X, car_Green_Y) ||
                    checkLose(carLightBlue, car_LightBlue_X, car_Light_Blue_Y) ||
                    checkLose(carOrange, car_Orange_X, car_Orange_Y) ||
                    checkLose(carPink, car_Pink_X, car_Pink_Y) ||
                    checkLose(carYellow, car_Yellow_X, car_Yellow_Y) ||
                    checkLose(carPolice, car_Police_X, car_Police_Y) ||
                    checkLose(carPurple, car_Purple_X, car_Purple_Y) ||
                    checkLose(carRed, car_Red_X, car_Red_Y)) {
                return true;

            }
            else{
                return false;
            }
        }

        public void moveRight() {
            arm_l.moveRight();
            arm_r.moveRight();
            body.moveRight();
            head.moveRight();
            shoulders_l.moveRight();
            shoulders_r.moveRight();
            leg_l.moveRight();
            leg_r.moveRight();
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
        }

        public void moveUp() {
            arm_l.moveUp();
            arm_r.moveUp();
            body.moveUp();
            head.moveUp();
            shoulders_l.moveUp();
            shoulders_r.moveUp();
            leg_l.moveUp();
            leg_r.moveUp();
        }

        public void moveDown() {
            arm_l.moveDown();
            arm_r.moveDown();
            body.moveDown();
            head.moveDown();
            shoulders_l.moveDown();
            shoulders_r.moveDown();
            leg_l.moveDown();
            leg_r.moveDown();
        }

        public boolean checkWin(int arm) {
            boolean flag;
            if (arm_l.getX() >= 1202) {
                flag = true;             //The X location of red5 1202
            } else {
                flag = false;
            }
            return flag;
        }

        public void paintWin(Graphics g) {
            font = g.getFont().deriveFont(220.0f);
            g.setFont(font);
            g.setColor(new Color(0xD00AEF02));
            g.drawString("You Win", Def.WINDOW_WIDTH / 7, Def.WINDOW_HEIGHT / 2 + 100);
            this.g = g;
        }
        public void painttest(Graphics g) {
            if (CheckCar()) {
                this.paintLose(g);
            }

        }

        public void paintLose(Graphics g) {
            font = g.getFont().deriveFont(200.0f);
            g.setFont(font);
            g.setColor(new Color(0xEF0215));
            g.drawString("Game Over", Def.WINDOW_WIDTH / 17, Def.WINDOW_HEIGHT / 2 + 70);
            this.g = g;
        }

        public int getArm_l() {
            int getArmL = arm_l.getX();
            return getArmL;
        }


        public boolean checkLose(Image car, int Car_color_X, int Car_color_Y) {
            boolean flag = false;
            if ((arm_r.getY() <= Car_color_Y && arm_r.getY() + arm_r.getHeight() >= Car_color_Y) && (arm_r.getX()+arm_r.getWidth() >= Car_color_X)) {
                flag = true;
            }
            return flag;
        }


    }

