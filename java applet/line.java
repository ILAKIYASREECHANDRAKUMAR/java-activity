import java.util.*;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.color.*;
public class line extends Applet{
public void paint(Graphics g)
{
	Color c[]={Color.red};
	for(int i=0;i<c.length;i++)
		g.setColor(c[i]);
	g.drawLine(10, 10,50,50);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
