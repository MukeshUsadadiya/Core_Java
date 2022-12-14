//Life Cycle 
import java.applet.*;
import java.awt.*;
/*
	<applet code="A86" height="400" width="400">
	</applet>
*/
public class A86 extends Applet
{
	String str="";
	public void init()
	{
		str +="init()-->";
	}
	public void start()
	{
		str +="start()-->";
	}
	public void stop()
	{
		str +="stop()-->";
	}
	public void destory()
	{
		str +="destory()-->";
	}
	public void paint(Graphics g)
	{
		g.drawString(str,50,50);
	}
}