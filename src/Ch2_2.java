import java.util.Scanner;


public class Ch2_2 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner (System.in);
		System.out.println("type two words with blanks or enter");
		String s1 = keyboard.next ();
		String s2 = keyboard.next ();
		int lengths1 = s1.length();
		int lengths2 = s2.length();
		System.out.println(s1+" "+lengths1);
		System.out.println(s2+" "+lengths2);
		System.out.println("type new words");
		String s3 = keyboard.next ();
		int lengths3 = s3. length();
		System.out.println(s3+" "+lengths3);

	}
}
