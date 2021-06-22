package com.company;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
//import java.awt.*;

public class PlayerMovement implements KeyListener {

    private Player player;
    private Panel panel;

    public PlayerMovement(Player player, Panel panel) {
        this.player = player;
        this.panel=panel;
    }

    public void keyTyped(KeyEvent e) {

    }

    public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();
        switch (key) {
            case KeyEvent.VK_RIGHT:
                this.player.moveRight(key);
                break;
            case KeyEvent.VK_SPACE:
                this.player.moveRight(key);
                break;
            case KeyEvent.VK_LEFT:
                if(player.arm_l.getX()>0){
                this.player.moveLeft();}
            case KeyEvent.VK_ENTER:

        }

    }

    public void keyReleased(KeyEvent e) {

    }
}

