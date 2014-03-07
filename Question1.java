/*
name: Chaddy Rungwe	
student no: RNGKUM001
Assignment: Question1
2013/07/22
*/
public class Question1
{
	public static void main(String[] args)
	{
	int x=760, y=3000;
	int z, hours, seconds, minutes, remainder;
	z=x+y;
	hours=z/3600;
	remainder=z%3600;
	minutes=remainder/60;
	seconds=remainder%60;
	System.out.printf("%d:%d:%d\n", hours, minutes, seconds);
	}
}