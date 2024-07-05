import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//to be able to do something when the button is pressed we need to implement ActionListener
public class ButtonFrame extends JFrame implements ActionListener {
	JButton button;
	JLabel label;

	ButtonFrame(){
//		setting up/creating button
		button = new JButton();
		button.setBounds(300,225,325,150);
		button.addActionListener(this);

		/** we can also use a lambda expression to implement the button press instead of implementing the interface
		 *  button.addActionListener(e -> System.out.println("Lambda expression");
		 */

		button.setText("press for greeting");
		button.setFocusable(false);                     //gets rid of dashed box around text
		ImageIcon buttonImage = new ImageIcon("src/resources/images/DetailedThumbsUp.png");
		button.setIcon(buttonImage);
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.TOP);
		button.setFont(new Font("Jokerman", Font.PLAIN,30));
		button.setForeground(new Color(0x8A5BB6));
		button.setBackground(new Color(0x002EC6));
		button.setBorder(BorderFactory.createEtchedBorder());

		label = new JLabel();
		label.setBounds(360,395,250,150);
		label.setFont(new Font("Bookman Old Style", Font.PLAIN,60));
		label.setVisible(true);

		this.setTitle("JavaFX Button practice");
		ImageIcon image = new ImageIcon("src/resources/images/LR.png");
		this.setIconImage(image.getImage());
		this.setSize(900,750);
		this.setResizable(false);
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(button);
		this.add(label);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String labelText = "";
		if(e.getSource()==button){
			labelText = label.getText().equals("Howdy!!") ? "Hey!" : "Howdy!!";
			label.setText(labelText);
//			button.setEnabled(false);                       //having this here will disable the button after one click
		}
	}
}
