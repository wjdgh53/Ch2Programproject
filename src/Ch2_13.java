import java.util.Scanner;


public class Ch2_13 {
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner (System.in);
		double bmrWoman,bmrMan,ccBarMan,ccBarWoman,weight,height,age;
		System.out.println("How much do you weight in pounds");
		weight = keyboard.nextDouble ();
		System.out.println("How tall are you in inches?");
		height = keyboard.nextDouble ();
		System.out.println("How old are you?");
		age = keyboard.nextDouble ();
		bmrWoman = 655 + (4.3 * weight)+(4.7*height)-(4.7*age);
		bmrMan = 66+(6.3 * weight)+(12.9 * height)-(6.8 * age);
		ccBarMan = bmrMan/230;
		ccBarWoman = bmrWoman/230;
		System.out.println("Chocolate Bar for man = "+ccBarMan);
		System.out.println("Chocolate Bar for woman = "+ccBarWoman);
	}

}
