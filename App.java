import java.io.*;
import java.awt.*;
public class App
{
	public static void main(String []args) throws IOException 
	{
		File f1=new File("C:/Program Files/Apache Software Foundation/Tomcat 8.0/bin/Tomcat8w.exe");
		Desktop.getDesktop().open(f1);
	}
}