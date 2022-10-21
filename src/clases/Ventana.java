package clases;

import javax.swing.*;

public class Ventana extends JFrame {

    private final int ANCHO = 800, ALTO = 500; //Variables que delimitan la medida de la ventana.

    private Game screen;

    public Ventana() { //Creacion del constructor y configuracion de la ventana.
        setTitle("Ping Pong - JoseM");
        setSize(ANCHO, ALTO);
        setLocationRelativeTo(null);
        setResizable(false);
        screen = new Game(); //Creacion de la Pantalla
        add(screen);

    }
}
