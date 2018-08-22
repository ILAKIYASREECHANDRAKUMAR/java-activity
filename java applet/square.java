import java.util.*;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.color.*;

public class square extends Applet {
	public void paint(Graphics g)
	{
		Color PURPLE = new Color(0,0,255);
		  g.fillRect(230, 80, 150, 100);
		 g.setColor(PURPLE);
		    g.drawRect(50, 80, 150, 100);
		    
		}
		public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
