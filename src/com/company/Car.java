package com.company;

import java.awt.*;
import java.util.Random;

public class Car extends Canvas {
    // location of y
    int car_Green_Y = Def.WINDOW_HEIGHT;
    int car_Light_Blue_Y = Def.WINDOW_HEIGHT;
    int car_Orange_Y = 0;
    int car_Pink_Y = 0;
    int car_Yellow_Y = Def.WINDOW_HEIGHT;
    int car_Police_Y = Def.WINDOW_HEIGHT;
    int car_Purple_Y = 0;
    int car_Red_Y = Def.WINDOW_HEIGHT;

    //location of x
    int car_Green_X = 110;
    int car_LightBlue_X = 250;
    int car_Orange_X = 390;
    int car_Pink_X= 530;
    int car_Yellow_X= 670;;
    int car_Police_X=810;
    int car_Purple_X=950;
    int car_Red_X=1090;

    private Random random = new Random();
    private int rG = random.nextInt(12) + 5;
    private int rLB = random.nextInt(12) + 5;
    private int rO = random.nextInt(12) + 5;
    private int rP = random.nextInt(12) + 5;
    private int rY = random.nextInt(12) + 5;
    private int rPO = random.nextInt(12) + 5;
    private int rPU = random.nextInt(12) + 5;
    private int rR = random.nextInt(12) + 5;


    Toolkit t = Toolkit.getDefaultToolkit();
    Image carGreen = t.getImage("car green.png");
    Image carLightBlue = t.getImage("car light blue.png");
    Image carPink = t.getImage("car pink.png");
    Image carYellow = t.getImage("car yellow.png");
    Image carPolice = t.getImage("police car.png");
    Image carOrange = t.getImage("car orange.png");
    Image carPurple = t.getImage("car purple.png");
    Image carRed = t.getImage("car red.png");

    public Car() {


    }

    public void paint(Graphics g) {



        g.drawImage(carGreen, car_Green_X, car_Green_Y, this);
        g.drawImage(carLightBlue, car_LightBlue_X, car_Light_Blue_Y, this);
        g.drawImage(carOrange, car_Orange_X, car_Orange_Y, this);
        g.drawImage(carPink, car_Pink_X, car_Pink_Y, this);
        g.drawImage(carYellow, car_Yellow_X , car_Yellow_Y, this);
        g.drawImage(carPolice, car_Police_X, car_Police_Y, this);
        g.drawImage(carPurple, car_Purple_X, car_Purple_Y, this);
        g.drawImage(carRed, car_Red_X, car_Red_Y, this);
        moveAllcar();


    }

    private void moveAllcar() {
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
        if (carColor <= Def.WINDOW_HEIGHT+222) {
            carColor +=random ;
        } else {
            carColor =0;
        }
        return carColor;
    }
    public int moveCarUp(int carColor, int random) {
        if (carColor <= -222) {
            carColor = Def.WINDOW_HEIGHT;
        } else {
            carColor -= random;
        }
        return carColor;
    }

    /*      for (int j = Def.WINDOW_HEIGHT; 0 < j; j--) {
        //  g.drawImage(i, 300, 200, Color.BLACK, this);
//            Font font = g.getFont().deriveFont(200.f);
//            g.setFont(font);
        g.drawImage(carGreen, 120, (int) j, this);

    }*/

}


