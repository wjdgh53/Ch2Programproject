import java.util.Scanner;


public class Ch2_12 
{

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner (System.in);
		double rad, dep, vol;
		int volGal;
		System.out.println("Please type radius in inches");
		rad = keyboard.nextDouble ();
		rad = rad/12;
		System.out.println("Please enter depth in feets");
		dep = keyboard.nextDouble ();
		vol = rad*rad*dep*3.141592;
		vol = Math.round(vol*7.48);
		System.out.println("a "+dep+"-foot well full of water with a radius of "+rad*12+" inches for the casing holds about "+vol+" gallons of water");
		if(vol >=250)
		{
			System.out.println("plenty for a family of 4 and no need to install a separate holding tank");
		}else{
			System.out.println("Not plenty for a family of 4 and need to install a separate holding tank");
		}
	}

}
