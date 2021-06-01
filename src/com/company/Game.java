package com.company;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

public class Game extends JFrame {
    private Player player;
    private Street street;
    private Car car;
    private Image image;

    public static void main(String[] args) {


        Game game = new Game();

    }

    public Game() {
        this.player = new Player();
        this.street = new Street();
        this.car = new Car();
        ImageIcon icon =new ImageIcon("images.png");
        this.setIconImage(icon.getImage());
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(Def.WINDOW_WIDTH, Def.WINDOW_HEIGHT);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setTitle("Cross Walk");
        this.setResizable(false);
        this.getContentPane().setBackground(Color.black);
        this.mainGameLoop();
        PleyerMovement pleyerMoevment = new PleyerMovement(player);
        this.addKeyListener(pleyerMoevment);

    }


    public void paint(Graphics g) {
        super.paint(g);
        this.street.paint(g);
        this.player.paint(g);
        this.car.paint(g);
        if(player.checkWin(player.getArm_l())){
            this.player.paintWin(g);
        };
    }



    private void mainGameLoop() {
        new Thread(() -> {
            while (true) {
                try {
                    repaint();
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}


