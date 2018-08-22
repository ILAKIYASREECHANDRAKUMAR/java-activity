import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class rectangle3 extends JPanel {
	public static void main(String[] args) {
		JFrame f = new JFrame();
	      f.setSize(300, 600);
	      f.add(new rectangle3());
	      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      f.setVisible(true);
	   }
	   public void paint(Graphics g) {
		   g.setColor(Color.blue);
			g.fillRect(300,150,200,200);
			g.setColor(Color.green);
			g.fillRect(100,150,200,200);
			g.setColor(Color.yellow);
			g.fillRect(50,150,200,200);

}
}