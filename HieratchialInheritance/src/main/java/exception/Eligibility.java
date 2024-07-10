package exception;
public class Eligibility 
{
 int age;
 public void eligibility(int age)
 {
	 this.age=age;
	 if(age>=18)
		System.out.println(age+" Eligible for voting and having driving license");
	 else 
		//System.out.println(age+" Not Eligible");
		 throw new ArithmeticException(age+ " Not Eligible"); //object creation
 }
 public static void main(String[] args) 
	{
		Eligibility obj=new Eligibility();
		obj.eligibility(12);		
	}
}
