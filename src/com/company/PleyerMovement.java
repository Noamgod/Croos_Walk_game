package com.company;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

    public class PleyerMovement implements KeyListener {
        private Player player;

        public PleyerMovement(Player player) {
            this.player = player;
        }

        public void keyTyped(KeyEvent e) {

        }
        public void keyPressed(KeyEvent e) {

            int key = e.getKeyCode();
            switch (key) {
                case KeyEvent.VK_RIGHT:
                    this.player.moveRight();
                    break;
                case KeyEvent.VK_LEFT:
                    this.player.moveLeft();
                    break;
                case KeyEvent.VK_SPACE:
                    this.player.moveUp();
                    this.player.moveRight();
            }

        }

        public void keyReleased(KeyEvent e) {

        }
    }

