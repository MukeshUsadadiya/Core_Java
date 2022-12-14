import java.applet.*;
import java.awt.*;

/*
	<applet code="A90" height="400" width="400">
	</applet>
*/
public class A90 extends Applet implements Runnable
{
	int i,c;
	Thread th;
	public void init()
	{
		i=1;
		c=10;
		th=new Thread (this);
		th.start();
	}
	public void run()
	{
		try
		{
			while(i<=10)
			{
				repaint();
				Thread.sleep(1000);
				i++;
				c=c+15;
			}
		}catch(Exception e){}
	}
	public void update(Graphics g)
	{
		paint(g);
	}
	public void paint(Graphics g)
	{
		String str="Number is :"+i;
		g.drawString(str,150,c);
	}
}