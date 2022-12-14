import java.io.*;
import java.util.*;
import java.awt.*;
public class Reader
{
 	 public static void main(String[] args) throws Exception
  	{
   
   		 File file = new File("F:/file3.txt");
		FileWriter outfile=new FileWriter(file);
		final PrintWriter out=new PrintWriter(outfile);
    	
		new Timer().scheduleAtFixedRate( new TimerTask()
		{
			public void run ()
			{
				out.println("Welcome Java");	
				System.out.println("Done");
			}
 		},0,5*1000);
		out.close();
  	}
}