
package simulationgame;

import java.awt.*;
import java.awt.image.*;
import javax.swing.*;
import javax.imageio.*;
import java.io.*;

public class main {
    
    public static void main(String[] args) throws IOException {
        JFrame j = new JFrame();
        j.setTitle("Simluation Game");
        j.setSize(400, 400);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setVisible(true);
        String imgPath = "C:\\Users\\19andruwnearnhardt\\Pictures\\Sketches\\Friedrich_Nietzsche_Colored.png";
        Image img = ImageIO.read(new File(imgPath));
        Graphics g = j.getGraphics();
        g.drawImage(img, 0, 0, 400, 400, null);
    }
}
