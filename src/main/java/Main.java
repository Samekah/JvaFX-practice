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
        label.setHorizontalTextPosition(JLabel.CENTER);           //for horizontal setting for the label text can be left, centre or right
        label.setVerticalTextPosition(JLabel.TOP);                //for vertical setting for the label text can be top, centre or bottom
        label.setVerticalAlignment(JLabel.CENTER);                //for horizontal setting for the label text and image can be left, centre or right
        label.setHorizontalAlignment(JLabel.CENTER);              //for vertical setting for the label text and image can be top, centre or bottom

//        we can also change the font and background colour and style of the text. For setting the font, it follows (fontName,fontStyle,fontSize)
//        we can also set the border colour and features, limit the size and position of our label
        label.setForeground(new Color(0x4B00C6));
        label.setBackground(new Color(0xFCBFDD));
        label.setOpaque(true);
        label.setFont(new Font("Book Antiqua",Font.PLAIN,24));
        label.setBorder(border);
        label.setBounds(200,130,image.getIconWidth(),image.getIconHeight()+90);
//        System.out.printf("Image height: %d, Image width: %d",image.getIconWidth(),image.getIconHeight());

//        we can also set how far away the text is from our image using +/- values
        label.setIconTextGap(50);

//        add to frame and make visible
        cf.add(label);
        cf.setVisible(true);
//        this line sets the size of the frame to accommodate for all components added to the frame, we turn off code that handles sizing to use this
//        cf.pack();

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