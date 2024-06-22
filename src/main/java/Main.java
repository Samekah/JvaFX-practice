import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        creates a frame and adds components to it
        CreateFrame cf = new CreateFrame();

//        JLabel = a GUI display area for a string of text, an image or both this creates a label
        JLabel label = new JLabel();

        label.setText("Learning javafx is fun");                    //sets label text
        ImageIcon image = new ImageIcon("src/resources/images/img.png");         //creates an image
        label.setIcon(image);                                       //sets label image

//        add to frame
        cf.add(label);

    }
}