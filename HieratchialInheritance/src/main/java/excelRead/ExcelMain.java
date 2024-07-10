package excelRead;
import java.io.IOException;
public class ExcelMain 
{
	public static void main(String[] args) throws IOException
	{
		System.out.println(ExcelData.getStringData(1,0));
		System.out.println(ExcelData.getIntegerData(1,1));	
		System.out.println(ExcelData.getStringData(2,0));
		System.out.println(ExcelData.getIntegerData(2,1));
		System.out.println(ExcelData.getStringData(3,0));
		System.out.println(ExcelData.getIntegerData(3,1));		
		System.out.println(ExcelData.getStringData1(1,0));
		System.out.println(ExcelData.getIntegerData1(1,1));	
		System.out.println(ExcelData.getStringData1(2,0));
		System.out.println(ExcelData.getIntegerData1(2,1));
		System.out.println(ExcelData.getStringData1(3,0));
		System.out.println(ExcelData.getIntegerData1(3,1));
	}
}
