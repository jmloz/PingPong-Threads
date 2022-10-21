package clases;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;

public class Game extends JPanel {

    Ball ball = new Ball(0,0); //Objeto de la clase Ball para poder pintar.
    //Creacion del constructor JPanel.
    public Game() {
        setBackground(Color.BLACK);

    }

    @Override //Metodo para dibujar las pelotas y raquetas.
    public void paintComponent(Graphics g) {
        super.paintComponent(g); //
        Graphics2D g2 = (Graphics2D) g; //Implementacion de la clse Graphics2D
        g2.setColor(Color.WHITE); //Asignacion de color a la pelota
        pintar(g2); // Implementacion del metodo para dibujar la pelota


    }

    public void pintar(Graphics2D g) {
        g.fill(ball.getBall());

    }

    public void rePintar() {

    }
}
