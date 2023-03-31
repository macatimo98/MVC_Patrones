package Modelo;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Model {
    
    private Image image;
    private String imagePath;
    
    public Model(String imagePath) throws IOException {
        this.imagePath = imagePath;
        loadImage();
    }
    
    private void loadImage() throws IOException {
        File file = new File(imagePath);
        image = ImageIO.read(file);
    }
    
    public Image getImage() {
        return image;
    }
    
    public String getImagePath() {
        return imagePath;
    }
}