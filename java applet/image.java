import java.applet.*; 
import java.awt.*;
import java.awt.Graphics;
import java.awt.Image;
public class image extends Applet {
	Image img;
	   MediaTracker tr;
	   public void paint(Graphics g) {
	      tr = new MediaTracker(this);
	      img = getImage(getCodeBase(), "6.jpg");
	      tr.addImage(img,0);
	      g.drawImage(img, 0, 0, this);
	    

}
}