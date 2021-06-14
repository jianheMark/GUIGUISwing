import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        MyFrame myFrame =  new MyFrame();
        //JLabel jLabel = new JLabel(); //create an instance of label.
        ImageIcon image = new ImageIcon("Cosmogony_Björk_Cover.jpg");

        //SwingConstants.CENTER
        JLabel jLabel = new JLabel("<html>Heaven <br/>Heaven's body\"<br/>  Whirl around me <br/>Make me wonder</html>",SwingConstants.CENTER);
        //https://stackoverflow.com/questions/1090098/newline-in-jlabel
        //How to print multi line in java
        jLabel.setIcon(image);
        //jLabel.setForeground(new Color(217,217,217));
        jLabel.setForeground(Color.BLACK);
        jLabel.setFont(new Font("helvetica",Font.PLAIN,18));
        jLabel.setBackground(Color.gray);
        jLabel.setOpaque(true);

        //jLabel.setVerticalTextPosition(JLabel.TOP); Set the relative text position of the label.
        //jLabel.setBorder();
        jLabel.setVerticalAlignment(JLabel.CENTER);
        jLabel.setHorizontalAlignment(JLabel.CENTER);


        myFrame.add(jLabel);
        System.out.println(myFrame.getInsets());
        myFrame.setLocationRelativeTo(null); //centers a frame on screen.
        //https://docs.oracle.com/javase/tutorial/uiswing/components/frame.html
        myFrame.pack();//afer add all the component then pack the frame.
    }
}
