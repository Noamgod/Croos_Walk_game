package com.company;

import javax.swing.*;
import java.awt.*;


public class Panel extends JPanel {
    public Player player;
    private Street street;
    private Car car;
    private Font font;
    private Graphics g;

    public Panel(){

        this.player = new Player();
        this.car = new Car();
        this.street = new Street();

        this.setBackground(Color.BLACK);
        this.setLayout(null);
        this.setDoubleBuffered(true);
        this.mainGameLoop();
        JOptionPane.showMessageDialog(null, "Welcome!\n\tTo beat the game you must cross the road unharmed\n\tThis game is really bad  so good luck\n\t By the way the timer on the top right is pointless.\nUse the arrow keys to move in each direction.\n"+"To Sprint forward press the Space button.\n\t"+"Have Fun!","How to play",3, car.carRed);

    }


    public void paint(Graphics g) {
        super.paint(g);
        this.street.paint(g);
        this.player.paint(g);
        this.car.paint(g);

        if (car.collision(player)){
            paintLose(g);
        }

        if(player.isFlag1()){
            paintWin(g);
        }

    }
    public void paintLose(Graphics g) {
        font = g.getFont().deriveFont(200.0f);
        g.setFont(font);
        g.setColor(new Color(0xEF0215));
        g.drawString("Game Over", Def.WINDOW_WIDTH / 17, Def.WINDOW_HEIGHT / 2 + 70);
        this.g = g;
    }

    public void paintWin(Graphics g) {
        font = g.getFont().deriveFont(220.0f);
        g.setFont(font);
        g.setColor(new Color(0xD00AEF02));
        g.drawString("You Win", Def.WINDOW_WIDTH /7, Def.WINDOW_HEIGHT / 2 );
        this.g = g;
    }

    private void mainGameLoop() {
        new Thread(() -> {
            while (!car.isFlag() && !player.isFlag()) {
                repaint();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
