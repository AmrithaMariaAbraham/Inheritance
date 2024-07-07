package exception;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionHandling 
{
	int a=5,div;
	int b[]=new int[5];	
    String s=null;
	public void add() throws IOException 
	{
		try
		{
			System.out.println(s.length());
	    }
		catch(NullPointerException e)
		{
			try
			{
				System.out.println("Nullpointer Exception:"+e);
				b[6]=3;
			}
			catch(ArrayIndexOutOfBoundsException ex)
			{		
				try 
				{
					System.out.println("Index value out of value:"+ex);
					div=a/0;
					System.out.println("Division:"+div);
				}
				catch(ArithmeticException ex1)
				{
					try
					{
						System.out.println("Division by zero not possible:" +ex1);
						String path="C://Javatraining//Files//";
						 File f=new File(path+"File.txt");
	                       if (f.createNewFile())
	                        {
	                            System.out.println("File " + f.getName() + " is created successfully.");  
	                            FileWriter fwrite = new FileWriter(path+"File.txt");
	                            fwrite.write("New file created, adding value");
	                            fwrite.close();
	                            System.out.println("File " + f.getName() + " updated successfully."); 
                          }
	                        else
	                        {
	                        	f.delete();
	                        	System.out.println("Deleted since file is already exist in the directory.");	 
	                        }
	                                                   
					}
				catch(FileNotFoundException ex2)
					{
					System.out.println("File not found" +ex2);
					}
				}
				
			}
			
		}		
	}
	public static void main(String[] args) throws IOException 
	{
		ExceptionHandling obj=new ExceptionHandling();
		obj.add();
	}
}
//1 try and multiple catch block program-->arrayindexoutofbound
