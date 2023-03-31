package Vista;

import java.awt.BorderLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Vista extends JFrame {
    
    private JLabel imageLabel;
    
    public Vista() {
        setTitle("Vista");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        imageLabel = new JLabel();
        add(imageLabel, BorderLayout.CENTER);
    }
    
    public void showImage(Image image) {
        ImageIcon icon = new ImageIcon(image);
        imageLabel.setIcon(icon);
        setVisible(true);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(imageModel.getImage(), imageModel.getX(), imageModel.getY());
        for(int i=0; i<kkk;i++){
            g.drawImage(imgs.get(i));        
        }
    }

    private final ArrayList<Model>imgs = new ArrayList<>();
    private final int kkk = 8000;
    public Vista(Model imageModel){
        this.imageModel = imageModel;
        for(int i=0;i<kkk;i++){
            imgs.add(new imageModel("C:\\Users\\golden\\Documents\\NetBeansProjects\\MVC_Patrones\\src\\main\\java\\Controlador\\colores-pelo-gato-1200x550-cc.jpg"));
        }
    }


}