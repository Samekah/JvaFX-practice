import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
//        creates a frame and adds components to it
        CreateFrame cf = new CreateFrame();

//        JLabel = a GUI display area for a string of text, an image or both this creates a label
        JLabel label = new JLabel();
        Border border = BorderFactory.createLineBorder(Color.blue, 5);

        label.setText("Learning javafx is fun");                                         //sets label text
        ImageIcon image = new ImageIcon("src/resources/images/img.png");         //creates an image
        label.setIcon(image);                                                            //sets label image

//        swing by default puts label text to the right of an image, to change this we can do the following:
        label.setHorizontalTextPosition(JLabel.CENTER);           //for horizontal setting the label can be left, centre or right
        label.setVerticalTextPosition(JLabel.TOP);           //for horizontal setting the label can be top, centre or right

//        we can also change the font and background colour and style of the text. For setting the font, it follows (fontName,fontStyle,fontSize)
//        we can also set the border colour and features, limit the size of out label
        label.setForeground(new Color(0x4B00C6));
        label.setBackground(new Color(0xFCBFDD));
        label.setOpaque(true);
        label.setFont(new Font("Book Antiqua",Font.PLAIN,24));
        label.setBorder(border);

//        we can also set how far away the text is from our image using +/- values
        label.setIconTextGap(50);


//        add to frame and make visible
        cf.add(label);
        cf.setVisible(true);

    }
}
//        GraphicsEnvironment ge = GraphicsEnvironment
//                .getLocalGraphicsEnvironment();
//
//        Font[] allFonts = ge.getAllFonts();
//
//        for (Font font : allFonts) {
//            System.out.println(font.getFontName(Locale.UK));
//        }