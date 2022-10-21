package clases;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Ball {
    //Valores de la pelota.
    private int x;
    private int y;

    private final int dx=1,dy=1; //Variables de movimiento de la pelota.

    private final int ANCHO = 20, ALTO = 20; //Tamanio de la pelota

    public Ball(int x, int y) { //Metodo constructor.
        this.x = x;
        this.y = y;

    }

    public Ellipse2D getBall() {
        return new Ellipse2D.Double(x, y, ANCHO, ALTO); //Metodo que retorna la pelota.
    }
    public void movimiento(Rectangle lim){
        x = x+dx;
        y = y+dy;

    }
}
