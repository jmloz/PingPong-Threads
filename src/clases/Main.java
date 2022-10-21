package clases;

import clases.Ventana;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Ventana ventana = new Ventana(); //Creacion del objeto ventana
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
