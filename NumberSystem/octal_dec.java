import java.util.Scanner;
public class Main
{
	public static void main(String args[])
	{      
		//scanner class object creation
		Scanner sc = new Scanner(System.in);    
		//input from user
		System.out.print("Enter a octal number : ");
		int octal = sc.nextInt();
		//Declare variable to store decimal number  
		int decimal = 0;
		//Declare variable to use in power		
		int n = 0;  
		//writing logic for the conversion
		while(octal > 0)
		{
			int temp = octal % 10;  
			decimal += temp * Math.pow(8, n);  
			octal = octal/10;  
			n++;  
		}
		//printing result
		System.out.println("Decimal number : "+decimal); 
		//closing scanner class(not compulsory, but good practice)
		sc.close();   
	}
}