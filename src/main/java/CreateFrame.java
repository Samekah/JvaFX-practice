import javax.swing.*;
import java.awt.*;

/**
 * This class creates and sets the style of a frame, as well as the function and config of its features
 * -> sets Title
 * -> sets Icon
 * -> sets size
 * -> sets background colour
 * -> sets if the frame is resizeable
 * -> sets function of close operation
 * -> sets visibility
 */
public class CreateFrame extends JFrame{

    CreateFrame(){

        this.setTitle("Open Allure Report");
        ImageIcon image = new ImageIcon("src/resources/images/LR.png");
        this.setIconImage(image.getImage());
        this.setSize(900,750);
        this.getContentPane().setBackground(new Color(0xCCCCFF));
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
