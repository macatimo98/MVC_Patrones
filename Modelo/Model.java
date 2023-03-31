package Modelo;

import java.awt.Image;
import java.util.HashMap;

public class Model {
    private static final HashMap<String, Model> flyweights = new HashMap<>();
    private Image image;

    private Model(Image image) {
        this.image = image;
    }

    public static Model getFlyweight(String imagePath) {
        Model flyweight = flyweights.get(imagePath);

        if (flyweight == null) {
            Image image = loadImage(imagePath);
            flyweight = new Model(image);
            flyweights.put(imagePath, flyweight);
        }

        return flyweight;
    }

    private static Image loadImage(String imagePath) {
        // cargar la imagen desde el archivo
        return null;
    }

    public Image getImage() {
        return image;
    }
}
