import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
public class rectangle2 extends Applet{
public void paint(Graphics g){
		
	g.fillRect(300,150,200,200);
	g.setColor(Color.red);
	g.fillRect(100,150,200,200);
	g.setColor(Color.black);
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
