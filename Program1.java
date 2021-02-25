import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SACtest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double dblAdj = 0;
		double dblOpp = 0;
		double dblHypot1 = 0;
		double dblHypot2 = 0;
		boolean blnContinue = true;
		int intCalc = 0;
		double dblRadius = 0;
		double dblArea = 0;
		String strResults = ("");
		String strSave = ("");
		Scanner sc = new Scanner(System.in);
		Scanner scStr=new Scanner(System.in);

		while (blnContinue) {
			showmenu();
			print("Enter Your Choice");
			intCalc = sc.nextInt();
			switch (intCalc) {
			case 1:
			print("you have entered 1");
			print("enter Adjacent side length");
			dblAdj=sc.nextInt();
			print("Enter Opposite side length");
			dblOpp=sc.nextDouble();
			dblHypot1 = (Math.pow(dblAdj,2)) + (Math.pow(dblOpp,2));
			dblHypot2 = Math.sqrt(dblHypot1);
			print("The Hypotenuse is " + dblHypot2);
			strResults = strResults + "\n" + "Adjacent length = " + dblAdj + " Opposite Length = " + dblOpp + " Hypotenuse length = " + dblHypot2;
			break;
			
			case 2:
			print("you have entered 2");
			print("enter radius of circle");
			dblRadius=sc.nextDouble();
			dblArea = 3.14 * (Math.pow(dblRadius, 2));
			print("The area of a circle with a radius of " + dblRadius + " is " + dblArea);
			strResults = strResults + "\n" + "Area of a Circle with a radius of " + dblRadius + " is: " + dblArea;
			break;
			
			case 3:
				print ("you have entered 3");
				blnContinue = false;
				System.out.print("Would you like to save?");
				strSave = scStr.nextLine();
				if (strSave.equalsIgnoreCase("Y") || strSave.equalsIgnoreCase("Yes")) {
					System.out.println("Results will now be saved");
					try{
					FileWriter writer = new FileWriter("Convert.txt",true);
					writer.write("" + strResults);
					writer.close();
					}catch (IOException e){
						e.printStackTrace();
					}
				}
				
					else {
						System.out.println("Results will not be saved");
					
						
				}
				break;
				
			default:
				System.out.println("Invalid Choice! Enter 1-3");
		}
		}
	}
	public static void print(String msg){
		System.out.println(msg);
	}
	public static void showmenu() {
		print("-----------------------------");
		print("1:Calculate Hypotenuse");
		print("2:Calculate Area of a Circle");
		print("3:End Program");
		print("-----------------------------");
	}
}
