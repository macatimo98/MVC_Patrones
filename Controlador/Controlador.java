package Controlador;

import javax.swing.JFrame;
import Vista.Vista;

public class Controlador {
    
    private static final String IMAGE_PATH = "C:\\Users\\golden\\Documents\\NetBeansProjects\\MVC_Patrones\\src\\main\\java\\Controlador\\colores-pelo-gato-1200x550-cc.jpg";
    private static final int NUM_VIEWS = 10;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Flyweight");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        for (int i = 0; i < NUM_VIEWS; i++) {
            Vista view = new Vista(IMAGE_PATH);
            frame.add(view);
        }

        frame.setVisible(true);
    }
}
