import java.util.Scanner;


public class Ch2_7 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner (System.in);
		System.out.println("Enter a line of text.");
		String s1 = keyboard.nextLine ();
		System.out.println(s1);
		s1 = s1.replace("hate", "love");  
		System.out.println("I have rephrased that line to read:");
		System.out.println(s1);
	}

}
