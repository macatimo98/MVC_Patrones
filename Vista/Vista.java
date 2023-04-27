package Vista;

import javax.swing.JFrame;

import Controlador.Controlador;

public class Vista {
    public static void main(String[] args) {
        Controlador controller = new Controlador("C:\\Users\\golden\\Documents\\NetBeansProjects\\MVC_Patrones\\src\\main\\java\\Controlador\\colores-pelo-gato-1200x550-cc.jpg", 5);
        JFrame frame = new JFrame();
        frame.add(controller.getPanel());
        frame.pack();
        frame.setVisible(true);
    }
}
