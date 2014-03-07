/*
name: Chaddy Rungwe	
student no: RNGKUM001
Assignment: Question1
2013/07/22
*/
public class Question2
{
	public static void main(String[] args)
	{
	int firstNumber=5, secondNumber=10, thirdNumber=15;
	
	if (firstNumber < secondNumber && secondNumber < thirdNumber)
		System.out.println(firstNumber+" "+secondNumber+" "+thirdNumber);
	
	else if (firstNumber < thirdNumber && thirdNumber < secondNumber)
		System.out.println(firstNumber+" "+thirdNumber+" "+secondNumber);
	
	else if (secondNumber < thirdNumber && thirdNumber < firstNumber)
		System.out.println(secondNumber+" "+thirdNumber+" "+firstNumber);
	
	else if (secondNumber < firstNumber &&  firstNumber < thirdNumber)
		System.out.println(secondNumber+" "+firstNumber+" "+thirdNumber);
	
	else if (thirdNumber < firstNumber && firstNumber < secondNumber)
		System.out.println(thirdNumber+" "+firstNumber+" "+secondNumber);
		
	else if (thirdNumber < secondNumber && secondNumber < firstNumber)
		System.out.println(thirdNumber+" "+secondNumber+" "+firstNumber);
	}
}
	
		