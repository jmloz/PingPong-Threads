package clases;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Teclado extends KeyAdapter {
    static boolean w, s, u, d;

    @Override
    public void keyPressed(KeyEvent e) { //Validacion de que tecla se esta presionando.
        int id = e.getKeyCode();

        if (id == KeyEvent.VK_W) {
            w = true;
        }
        if (id == KeyEvent.VK_S) {
            s = true;
        }
        if (id == KeyEvent.VK_UP) {
            u = true;
        }
        if (id == KeyEvent.VK_DOWN){
            d = true;
        }
    }
    @Override
    public void keyReleased(KeyEvent e) { //Validacion de que tecla se esta dejando de presionar.
        int id = e.getKeyCode();

        if (id == KeyEvent.VK_W) {
            w = false;
        }
        if (id == KeyEvent.VK_S) {
            s = false;
        }
        if (id == KeyEvent.VK_UP) {
            u = false;
        }
        if (id == KeyEvent.VK_DOWN){
            d = false;
        }
    }



}
