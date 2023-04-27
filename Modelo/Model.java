package Modelo;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Model extends JPanel {

    private Image imagen;
    private int cantidad;

    public Model(String rutaImagen, int cantidad) {
        try {
            BufferedImage img = ImageIO.read(new File(rutaImagen));
            this.imagen = img.getScaledInstance(img.getWidth(), img.getHeight(), Image.SCALE_SMOOTH);
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.cantidad = cantidad;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 0; i < cantidad; i++) {
            g.drawImage(imagen, i * imagen.getWidth(null), 0, this);
        }
    }
}

