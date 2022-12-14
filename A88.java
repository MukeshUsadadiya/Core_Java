//Dimension  Class 
import java.applet.*;
import java.awt.*;
/*
	<applet code="A88" height="400" width="400">
	</applet>
*/
public class A88 extends Applet
{
	public void paint(Graphics g)
	{		
		Dimension d=getSize();
		int x=d.width/2;
		int y=d.height/2;
		
		int r=(int)((d.width<d.height)? 0.4*d.width:0.4*d.height);
		g.drawOval(x-r,y-r,r*2,r*2);
	}
}
