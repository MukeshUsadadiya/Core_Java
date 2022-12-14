//PARAM tag
import java.applet.*;
import java.awt.*;
/*
	<applet code="A89.class" height="400" width="400">
	<PARAM NAME="font" VALUE="Snap ITC">
	<PARAM NAME="size" VALUE="32"'>
	<PARAM NAME="str" VALUE="Example of Param Tag">
	</applet>
*/
public class A89 extends Applet
{
	public void paint(Graphics g)
	{		
		String myfont=getParameter("font");
		int fontsize=Integer.parseInt(getParameter("size"));
		
		Font f =new Font(myfont,Bold,fontsize);
		g.setFont(f);
		String s=getParameter("str");	
		g.drawString(s,50,100);
	}
}
