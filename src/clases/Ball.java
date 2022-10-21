package clases;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Ball {
    //Valores de la pelota.
    private int x;
    private int y;

    private int dx = 1, dy = 1; //Variables de movimiento de la pelota.

    private final int ANCHO = 15, ALTO = 15; //Tamanio de la pelota

    public Ball(int x, int y) { //Metodo constructor.
        this.x = x;
        this.y = y;

    }

    public Ellipse2D getBall() {
        return new Ellipse2D.Double(x, y, ANCHO, ALTO); //Metodo que retorna la pelota.
    }

    public void movimiento(Rectangle lim, boolean puntoJ1,boolean puntoJ2) {
        x += dx;
        y += dy;

        if(puntoJ1){
            dx=-dx;
            x=25;
        }
        if(puntoJ2){
            dx=-dx;
            x=755;
        }
        if (x > lim.getMaxX()) {
            dx = -dx;
        }
        if (y > lim.getMaxY()) {
            dy = -dy;
        }
        if (x < 0) {
            dx = -dx;
        }
        if (y < 0) {
            dy = -dy;
        }
    }

}
