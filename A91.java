//Applet classs using ActionListener & Events
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*
	<applet code="A91" height="400" width="400">
	</applet>
*/
public class A91 extends Applet implements ActionListener
{
	Button b1,b2;
	List l1;
	public void init()
	{
		b1=new Button("one");
		b1.addActionListener(this);
		
		b2=new Button("two");
		b2.addActionListener(this);
		
		l1=new List();
		add(b1);
		add(b2);
		add(l1);
	}
	public void actionPerformed(ActionEvent e)
	{
		/*String str=e.getActionCommand();
		if(str.equals("one");*/
		if(e.getActionCommand().equals("one"))
		{
			l1.removeAll();
			l1.add("SUNDAY");
			l1.add("MONDAY");
			l1.add("TUESDAY");
			add(l1);
		}
		else if(e.getActionCommand().equals("two"))
		{
			l1.removeAll();
			l1.add("JUNAGADH");
			l1.add("RAJKOT");
			l1.add("SURAT");
			add(l1);
		}
	}
}