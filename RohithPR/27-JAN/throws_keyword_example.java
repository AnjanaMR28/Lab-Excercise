import java.io.FileInputStream;
import java.io.IOException;

class fileMgmt1
{
	void fileRead() throws IOException
	{
		FileInputStream fis = null;
		fis = new FileInputStream("B:/myfile.txt");
		int k;
		while((k=fis.read())!=-1)
		{
			System.out.println((char)k);
		}
		fis.close();
	}
}
public class throws_keyword_example {

	public static void main(String[] args) 
	{

	}

}
