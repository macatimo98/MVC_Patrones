package Modelo;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Model {
    
    private Image image;
    private String imagePath;
    
    Random r = new Random();
    private int x=r.nextInt(600), y=r.nextInt(600);
    private int sizeX=15, sizeY=25;

    public Model(String imagePath, int x, int y) throws IOException{
        loadImage(imagePath);
    }

    public Random getR() {
        return r;
    }

    public void setR(Random r) {
        this.r = r;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getSizeX() {
        return sizeX;
    }

    public void setSizeX(int sizeX) {
        this.sizeX = sizeX;
    }

    public int getSizeY() {
        return sizeY;
    }

    public void setSizeY(int sizeY) {
        this.sizeY = sizeY;
    }
    
    
    private void loadImage(String Path) throws IOException {
        ImageIcon imageIcon = new ImageIcon(Path);
        this.image = imageIcon.getImage();
    }
    
    public Image getImage() {
        return image;
    }
    
    public String getImagePath() {
        return imagePath;
    }
}