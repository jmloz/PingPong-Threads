package clases;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class Game extends JPanel {

    Ball ball = new Ball(0,0); //Objeto de la clase Ball para poder pintar.
    Jugadores j1 = new Jugadores(10,200);
    Jugadores j2 = new Jugadores(784-10-10,200);
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
        rePintar();

    }

    public void pintar(Graphics2D g) {
        g.fill(ball.getBall()); //Retornar la bola.
        g.fill(j1.getJugadores());
        g.fill(j2.getJugadores());
    }

    public void rePintar() {
    ball.movimiento(getBounds(),puntoJ(j1.getJugadores()),puntoJ(j2.getJugadores()));
    j1.movJ1(getBounds());
    j2.movJ2(getBounds());
    }
    private boolean puntoJ(Rectangle2D r){
        return ball.getBall().intersects(r);


    }




}
