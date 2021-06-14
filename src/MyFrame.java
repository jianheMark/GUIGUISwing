import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application.
        //https://docs.oracle.com/javase/7/docs/api/javax/swing/JFrame.html#setDefaultCloseOperation%28int%29
        this.setSize(750, 750); //set the size.
        this.setResizable(true);//resize the frame.
        this.setTitle("Welocme to new world."); //set the Title.
        ImageIcon imageIcon = new ImageIcon("logo.png");
        this.setIconImage(imageIcon.getImage());
        this.getContentPane().setBackground(new Color(217, 217, 217));

        this.setBackground(Color.YELLOW);
        this.setVisible(true);//Make the frame visible.
    }

}
