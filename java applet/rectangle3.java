import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
public class rectangle3 extends Applet{
	public void paint(Graphics g){
	g.setColor(Color.blue);
	g.fillRect(300,150,200,200);
	g.setColor(Color.green);
	g.fillRect(100,150,200,200);
	g.setColor(Color.yellow);
	g.fillRect(50,150,200,200);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
