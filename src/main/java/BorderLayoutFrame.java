import javax.swing.*;
import java.awt.*;

public class BorderLayoutFrame extends JFrame {

	BorderLayoutFrame(){

		setLayout(new BorderLayout(10,10));			//adding values to border layout adds margin to the borders - has to be done before addin components

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

		// Panels have a flow layout by default, however it is possible to apply a layout manager to it and create sub panels
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();

		centre.setLayout(new BorderLayout(10,10));

		panel1.setBackground(Color.black);
		panel2.setBackground(Color.darkGray);
		panel3.setBackground(Color.gray);
		panel4.setBackground(Color.lightGray);
		panel5.setBackground(Color.white);

		panel1.setPreferredSize(new Dimension(50,50));
		panel2.setPreferredSize(new Dimension(50,50));
		panel3.setPreferredSize(new Dimension(50,50));
		panel4.setPreferredSize(new Dimension(50,50));
		panel5.setPreferredSize(new Dimension(50,50));

		centre.add(panel1,BorderLayout.NORTH);          //will expand horizontally but not vertically depending on the size of the window
		centre.add(panel2,BorderLayout.EAST);            //will expand vertically but not horizontally depending on the size of the window
		centre.add(panel3,BorderLayout.SOUTH);          //will expand horizontally but not vertically depending on the size of the window
		centre.add(panel4,BorderLayout.WEST);            //will expand vertically but not horizontally depending on the size of the window
		centre.add(panel5,BorderLayout.CENTER);

		setTitle("Border Layout Practice");
		setSize(900,750);

		setResizable(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}
