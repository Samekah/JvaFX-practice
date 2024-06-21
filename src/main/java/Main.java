import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        GoToAllureFrame gtaf = new GoToAllureFrame();
//        JLabel = a GUI display area for a string of text, an image or both
//        Creates a label
        JLabel label = new JLabel();
//        sets label text
        label.setText("Learning javafx is fun");
        ImageIcon image = new ImageIcon("img.png");
        label.setIcon(image);
//        add to frame
        gtaf.add(label);

    }
}