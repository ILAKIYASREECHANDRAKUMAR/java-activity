
import java.awt.FlowLayout;
import java.awt.event.*;

import javax.swing.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class googlemap extends JFrame{
	public googlemap() {
        initialize();
	}
       
   
	  private void initialize() {
	        setSize(300, 300);
	        setLayout(new FlowLayout(FlowLayout.LEFT));
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        

	        JComboBox comboBox = new JComboBox();
	        comboBox.setEditable(true);
	        comboBox.addItem("newyork");
	        comboBox.addItem("chennai");
	        comboBox.addItem("katmandu");
	        comboBox.addItem("kualalampur");
	        comboBox.addItem("hongkong");
	        
	  
	        //
	        // Create an ActionListener for the JComboBox component.
	        //
	        comboBox.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent event) {
	                //
	                // Get the source of the component, which is in our combo
	                // box.
	                //
	                JComboBox comboBox = (JComboBox) event.getSource();

	                Object selected = comboBox.getSelectedItem();
	                if(selected.toString().equals("newyork"))
	                
	                {
	                	newyork();
	                }
	                else if(selected.toString().equals("chennai"))
	                {
	                	chennai();
	                }
	                else if(selected.toString().equals("katmandu"))
	                {
	                	katmandu();
	                }
	                else if(selected.toString().equals("kualalampur"))
	                {
	                	kualalampur();
	                }
	                
	                else if(selected.toString().equals("hongkong"))
	                {
	                	hongkong();
	                }

	            }
	        });
	        getContentPane().add(comboBox);
	        
	    }
	public void newyork()
	{

			JFrame test = new JFrame("New york");
			try {
			String latitude = "40.714728";
			String longitude = "-73.998672";
			String imageUrl = "https://maps.googleapis.com/maps/api/staticmap?center="
			+ latitude
			+ ","
			+ longitude
			+ "&zoom=11&size=612x612&scale=2&maptype=roadmap";
			String destinationFile = "image.jpg";
			// read the map image from Google
			// then save it to a local file: image.jpg
			//
			URL url = new URL(imageUrl);
			InputStream is = url.openStream();
			OutputStream os = new FileOutputStream(destinationFile);
			byte[] b = new byte[2048];
			int length;
			while ((length = is.read(b)) != -1) {
			os.write(b, 0, length);
			}
			is.close();
			os.close();
			} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
			}
			// create a GUI component that loads the image: image.jpg
			//
			ImageIcon imageIcon = new ImageIcon((new ImageIcon("image.jpg"))
			.getImage().getScaledInstance(630, 600,
			java.awt.Image.SCALE_SMOOTH));
			test.add(new JLabel(imageIcon));
			// show the GUI window
			test.setVisible(true);
			test.pack();
			}
	public void chennai() {
		
		JFrame test = new JFrame("Chennai");
		try {
		String latitude = "13.0827";
		String longitude = "80.2707";
		String imageUrl = "https://maps.googleapis.com/maps/api/staticmap?center="
		+ latitude
		+ ","
		+ longitude
		+ "&zoom=11&size=612x612&scale=2&maptype=roadmap";
		String destinationFile = "image.jpg";
		// read the map image from Google
		// then save it to a local file: image.jpg
		//
		URL url = new URL(imageUrl);
		InputStream is = url.openStream();
		OutputStream os = new FileOutputStream(destinationFile);
		byte[] b = new byte[2048];
		int length;
		while ((length = is.read(b)) != -1) {
		os.write(b, 0, length);
		}
		is.close();
		os.close();
		} catch (IOException e) {
		e.printStackTrace();
		System.exit(1);
		}
		// create a GUI component that loads the image: image.jpg
		//
		ImageIcon imageIcon = new ImageIcon((new ImageIcon("image.jpg"))
		.getImage().getScaledInstance(630, 600,
		java.awt.Image.SCALE_SMOOTH));
		test.add(new JLabel(imageIcon));
		// show the GUI window
		test.setVisible(true);
		test.pack();
		}
public void katmandu()
{
	JFrame test = new JFrame("katmandu");
	try {
	String latitude = "27.7172";
	String longitude = "85.3240";
	String imageUrl = "https://maps.googleapis.com/maps/api/staticmap?center="
	+ latitude
	+ ","
	+ longitude
	+ "&zoom=11&size=612x612&scale=2&maptype=roadmap";
	String destinationFile = "image.jpg";
	// read the map image from Google
	// then save it to a local file: image.jpg
	//
	URL url = new URL(imageUrl);
	InputStream is = url.openStream();
	OutputStream os = new FileOutputStream(destinationFile);
	byte[] b = new byte[2048];
	int length;
	while ((length = is.read(b)) != -1) {
	os.write(b, 0, length);
	}
	is.close();
	os.close();
	} catch (IOException e) {
	e.printStackTrace();
	System.exit(1);
	}
	// create a GUI component that loads the image: image.jpg
	//
	ImageIcon imageIcon = new ImageIcon((new ImageIcon("image.jpg"))
	.getImage().getScaledInstance(630, 600,
	java.awt.Image.SCALE_SMOOTH));
	test.add(new JLabel(imageIcon));
	// show the GUI window
	test.setVisible(true);
	test.pack();
	}
public void kualalampur()
{JFrame test = new JFrame("kualalampur");
try {
String latitude = "3.1390";
String longitude = "101.6869";
String imageUrl = "https://maps.googleapis.com/maps/api/staticmap?center="
+ latitude
+ ","
+ longitude
+ "&zoom=11&size=612x612&scale=2&maptype=roadmap";
String destinationFile = "image.jpg";
// read the map image from Google
// then save it to a local file: image.jpg
//
URL url = new URL(imageUrl);
InputStream is = url.openStream();
OutputStream os = new FileOutputStream(destinationFile);
byte[] b = new byte[2048];
int length;
while ((length = is.read(b)) != -1) {
os.write(b, 0, length);
}
is.close();
os.close();
} catch (IOException e) {
e.printStackTrace();
System.exit(1);
}
// create a GUI component that loads the image: image.jpg
//
ImageIcon imageIcon = new ImageIcon((new ImageIcon("image.jpg"))
.getImage().getScaledInstance(630, 600,
java.awt.Image.SCALE_SMOOTH));
test.add(new JLabel(imageIcon));
// show the GUI window
test.setVisible(true);
test.pack();
}

public void hongkong()
{
	JFrame test = new JFrame("hongkong");
	try {
	String latitude = "22.3964";
	String longitude = "114.1095";
	String imageUrl = "https://maps.googleapis.com/maps/api/staticmap?center="
	+ latitude
	+ ","
	+ longitude
	+ "&zoom=11&size=612x612&scale=2&maptype=roadmap";
	String destinationFile = "image.jpg";
	// read the map image from Google
	// then save it to a local file: image.jpg
	//
	URL url = new URL(imageUrl);
	InputStream is = url.openStream();
	OutputStream os = new FileOutputStream(destinationFile);
	byte[] b = new byte[2048];
	int length;
	while ((length = is.read(b)) != -1) {
	os.write(b, 0, length);
	}
	is.close();
	os.close();
	} catch (IOException e) {
	e.printStackTrace();
	System.exit(1);
	}
	// create a GUI component that loads the image: image.jpg
	//
	ImageIcon imageIcon = new ImageIcon((new ImageIcon("image.jpg"))
	.getImage().getScaledInstance(630, 600,
	java.awt.Image.SCALE_SMOOTH));
	test.add(new JLabel(imageIcon));
	// show the GUI window
	test.setVisible(true);
	test.pack();
	}

public static void main(String[] args) {
	SwingUtilities.invokeLater(new Runnable() {
        public void run() {
        	
            new googlemap().setVisible(true);
        }
    });
}
}