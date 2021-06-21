package com.company;

import javax.swing.*;
import java.awt.*;


public class Game extends JFrame {


    public static void main(String[] args) {
        Game game = new Game();
    }

    public Game() {
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(Def.WINDOW_WIDTH, Def.WINDOW_HEIGHT);
        this.setResizable(false);
        this.setTitle("Cross Walk");
        this.setLocationRelativeTo(null);
        Panel mainPanel = new Panel();
        this.add(mainPanel);
        mainPanel.setBounds(0, 0, Def.WINDOW_WIDTH, Def.WINDOW_HEIGHT);
        ImageIcon icon = new ImageIcon("image/Icon.png");
        this.setIconImage(icon.getImage());
        PlayerMovement playerMovement = new PlayerMovement(mainPanel.player,mainPanel);
        this.addKeyListener(playerMovement);
    }


}


