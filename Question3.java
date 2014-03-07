/*
name: Chaddy Rungwe	
student no: RNGKUM001
Assignment: Question1
2013/07/22
*/
import java.util.Scanner;
import java.lang.Math;
public class Question3
{
	public static void main(String[] arg)
	{
	Scanner k = new Scanner (System.in);
	
	double N, M, i, check;
	int j;
	System.out.println("Enter the starting point N:");
	N = k.nextDouble();
	System.out.println("Enter the ending point M:");
	M = k.nextDouble();
	System.out.println("The palindromic perfect squares are as follows:");
	String testValue=" ", test=" ";
	for (i=N; i<=M; i++)
	{
		String accum = "";
		testValue= ""+(int)i; 
		int x=testValue.length();
		x=x-1;
		for (j=x; j>=0; --j)
		{
		accum+=""+ testValue.charAt(j);
		test = ""+accum;
		}
		
		if (testValue.equals(test))
		{
			check = Math.sqrt(i);
			if ((int)i == ((int)check)*((int)check))
				System.out.println((int)i);
		
		}
		
		
	}
	}
}
		
					 
	