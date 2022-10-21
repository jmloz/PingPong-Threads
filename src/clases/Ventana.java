package clases;

import javax.swing.*;

public class Ventana extends JFrame {
    private Thr thr; //Objeto de la clase Thr
    private final int ANCHO = 800, ALTO = 500; //Variables que delimitan la medida de la ventana.

    private Game pantalla;

    public Ventana() { //Creacion del constructor y configuracion de la ventana.
        setTitle("Ping Pong - JoseM");
        setSize(ANCHO, ALTO);
        setLocationRelativeTo(null);
        setResizable(false);
        pantalla = new Game(); //Creacion de la Pantalla
        add(pantalla);
        addKeyListener(new Teclado());
        thr = new Thr(pantalla);
        thr.start();
    }
}
