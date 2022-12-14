//Flow Layout 
import java.applet.*;
import java.awt.*;

/*
	<applet code="A92" height="400" width="400">
	</applet>
*/
public class A92 extends Applet 
{
	public void init()
	{
		setLayout(new FlowLayout(FlowLayout.LEFT));
		for(int i=1;i<=20;i++)
		{
			add(new Button("Button"+i));
		}
	}
}