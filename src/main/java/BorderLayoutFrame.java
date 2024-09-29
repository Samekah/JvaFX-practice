import javax.swing.*;
import java.awt.*;

public class BorderLayoutFrame extends JFrame {

	BorderLayoutFrame(){

		JPanel north = new JPanel();
		JPanel east = new JPanel();
		JPanel south = new JPanel();
		JPanel west = new JPanel();
		JPanel centre = new JPanel();

		north.setBackground(Color.red);
		east.setBackground(Color.green);
		south.setBackground(Color.yellow);
		west.setBackground(Color.magenta);
		centre.setBackground(Color.blue);

		north.setPreferredSize(new Dimension(100,100));
		east.setPreferredSize(new Dimension(100,100));
		south.setPreferredSize(new Dimension(100,100));
		west.setPreferredSize(new Dimension(100,100));
		centre.setPreferredSize(new Dimension(100,100));

		//attach panels to the borders of the frame
		add(north,BorderLayout.NORTH);          //will expand horizontally but not vertically depending on the size of the window
		add(east,BorderLayout.EAST);            //will expand vertically but not horizontally depending on the size of the window
		add(south,BorderLayout.SOUTH);          //will expand horizontally but not vertically depending on the size of the window
		add(west,BorderLayout.WEST);            //will expand vertically but not horizontally depending on the size of the window
		add(centre,BorderLayout.CENTER);        //will expand in size proportionally to the size of the window

		setTitle("Border Layout Practice");
		setSize(900,750);
		setResizable(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}
