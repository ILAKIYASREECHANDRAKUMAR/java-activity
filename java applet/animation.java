import java.awt.*;
import java.applet.*;
public class animation extends Applet {
		 Image pic;
		 Image pic1;

		    public void init()

		      {

		        pic=getImage(getDocumentBase(),"6.jpg");
		        pic1=getImage(getDocumentBase(),"017.jpg");

		      }

		    public void paint(Graphics grp)

		      {

		        for(int i=50;i<600;i++)

		          {

		            grp.drawImage(pic, i,50,this);
		            grp.drawImage(pic1,i,100,this);

		            try

		              {

		                Thread.sleep(600);

		              }

		            catch(Exception e){}

		          }
	}

}
