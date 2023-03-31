package Controlador;

import java.io.IOException;

import javax.swing.JOptionPane;

import Modelo.Model;
import Vista.Vista;

public class Controlador {
    
    public static void main(String[] args) {
        try {
            Model model = new Model("C:\\Users\\golden\\Documents\\NetBeansProjects\\MVC_Patrones\\src\\main\\java\\Controlador\\colores-pelo-gato-1200x550-cc.jpg");
            Vista view = new Vista();
            view.showImage(model.getImage());
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "No se pudo cargar la imagen", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
