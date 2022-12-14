//Stream Tokenizer class 
import java.io.*;
class A84
{
	public static void main(String[]args)throws IOException	
	{
		int ttword=0,ttnumber=0,other=0;
		FileReader tr=new FileReader("output.txt");
		BufferedReader br =new BufferedReader(tr);
		StreamTokenizer st=new StreamTokenizer(br);
		st.ordinaryChar('.');

		while(st.nextToken()!=StreamTokenizer.TT_EOF)
		{
			switch(st.ttype)
			{
				case  StreamTokenizer.TT_WORD:
				ttword=ttword +1;	
				System.out.println("Word is :"+st.sval);
				break;
			
				case StreamTokenizer.TT_NUMBER:
				ttnumber=ttnumber +1;	
				System.out.println("Number  is :"+st.nval);
				break;
				
				default:
				other=other+1;
				System.out.println("Other Char is  :"+(char)st.ttype);
			}
		}
		System.out.println("WORD TOKEN IS :"+ttword);
		System.out.println("NUMBER TOKEN IS :"+ttnumber);
		System.out.println("OTHER  TOKEN IS :"+other);
	}
}