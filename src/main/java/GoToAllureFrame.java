import javax.swing.*;
import java.awt.*;

public class GoToAllureFrame extends JFrame{

    GoToAllureFrame(){
        //set this title
        this.setTitle("Open Allure Report");
        //sets default close behaviour to exit
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //sets size
        this.setSize(900,750);
        //prevent this from being resized
        this.setResizable(false);
        //changes program logo
        ImageIcon image = new ImageIcon("LR.png");
        this.setIconImage(image.getImage());
        // sets visibility
        this.setVisible(true);
        this.getContentPane().setBackground(new Color(0xCCCCFF));
    }
}
