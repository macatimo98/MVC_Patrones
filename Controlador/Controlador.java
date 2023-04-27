package Controlador;
import javax.swing.JPanel;

import Modelo.Model;

public class Controlador {
    private Model panel;

    public Controlador(String rutaImagen, int cantidad) {
        panel = new Model(rutaImagen, cantidad);
    }

    public JPanel getPanel() {
        return panel;
    }
}

