import java.awt.*;
import javax.swing.*;
public class line1 extends JPanel{
	public void paintComponent(Graphics g) {
	g.setColor(Color.red);
    g.drawLine(100, 100, 100, 220);
	}
	 public static void main(String[] args) {
		    JFrame.setDefaultLookAndFeelDecorated(true);
		    JFrame frame = new JFrame("Draw Line");
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    frame.setBackground(Color.white);
		    frame.setSize(200, 200);
		 
		    line1 panel = new line1();
		 
		    frame.add(panel);
		 
		    frame.setVisible(true);
		  }
		}
		 
	