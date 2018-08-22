import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class rectangle2 extends JPanel {
	public static void main(String[] args) {
		JFrame f = new JFrame();
	      f.setSize(300, 600);
	      f.add(new rectangle2());
	      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      f.setVisible(true);
	   }
	   public void paint(Graphics g) {
		   g.fillRect(300,150,200,200);
			g.setColor(Color.red);
			g.fillRect(100,150,200,200);
			g.setColor(Color.black);
		}
	}
