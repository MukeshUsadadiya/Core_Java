import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
 
public class file
{	
    public static void main(String[] args) throws IOException
    {	
        BufferedReader r1 = new BufferedReader(new FileReader("F:\\file1.txt"));
         
        BufferedReader r2 = new BufferedReader(new FileReader("F:\\file2.txt"));
         
        String l1 = r1.readLine();
         
        String l2 = r2.readLine();
         
        boolean areEqual = true;
         
        int no = 1;
         
        while (l1 != null || l2 != null)
        {
            if(l1 == null || l2 == null)
            {
                areEqual = false;
                 
                break;
            }
            else if(! l1.equalsIgnoreCase(l2))
            {
                areEqual = false;
                 
                break;
            }
             
            l1 = r1.readLine();
             
            l2 = r2.readLine();
             
            no++;
        }
         
        if(areEqual)
        {
            System.out.println("Two files have same content.");
        }
        else
        {
            System.out.println("Two files have different content. They differ at line "+no);
             
            System.out.println("File1 has "+l1+" and File2 has "+l2+" at line "+no);
        }
         
        r1.close();
         
        r2.close();
    }
}