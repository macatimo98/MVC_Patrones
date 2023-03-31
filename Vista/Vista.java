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
}