import java.awt.Font;
import java.util.Scanner;


public class Ch2_9
{

	public static void main(String[] args) 
	{
		//java.awt.Font font = new java.awt.Font("Italic",Font.BOLD,14);
		//label.setFont(font);
		Scanner keyboard = new Scanner (System.in);
		System.out.println("What is your favorite color?");
		String fColor = keyboard.nextLine ();
		//fColor.setFont(font);
		System.out.println("What is your favorite food?");
		String fFood = keyboard.nextLine ();
		System.out.println("What is your favorite animal?");
		String fAnimal = keyboard.nextLine ();
		System.out.println("Type your friend or relative first name");
		String fName = keyboard.nextLine ();
		System.out.println("I had a dream that "+fName+" ate a "+fColor+" "+fAnimal+"\nand said it tasted like "+fFood);
		
	}

}
