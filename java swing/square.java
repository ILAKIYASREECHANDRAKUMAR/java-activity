import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class square extends JPanel{
	public static void main(String[] args) {
		JFrame f = new JFrame();
	      f.setSize(400, 400);
	      f.add(new square());
	      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      f.setVisible(true);
	   }
	   public void paint(Graphics g) {
		   g.setColor(Color.red);
	      g.fillRect (5, 15, 50, 75);
	}

}
