package clases;

import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Jugadores {
    private int x, y;
    static int ANCHO = 10, ALTO = 40;

    public Jugadores(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Rectangle2D getJugadores() {
        return new Rectangle2D.Double(x, y, ANCHO, ALTO);
    }

    public void movJ1(Rectangle lim) {
        if (Teclado.w && y > lim.getMinY()) {
            y--;
        }
        if (Teclado.s && y < lim.getMaxY()) {
            y++;
        }

    }

    public void movJ2(Rectangle lim) {
        if (Teclado.u && y > lim.getMinY() ) {
            y--;
        }
        if (Teclado.d && y < lim.getMaxY()-ALTO) {
            y++;
        }

    }
}
