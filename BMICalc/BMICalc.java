import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;
class BMICalc 
{
    public void calc() 
	{
		try 
		{
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		} 
		catch (IOException | InterruptedException ex) 
		{
			ex.printStackTrace();
		}
		System.out.println("\n----------------- BMI CALCULATOR -----------------\n");
		LocalDate date = LocalDate.now();
		System.out.println("\t\t  " + date);
		String BMITable[][]= {
								{" Category", "BMI Minimum", "BMI Maximum"},
								{" Underweight", "    -\t", "  18.49"},
								{" Normal", "           18.5\t", "   25"},
								{" Overweight", "   25.1\t", "   30"},
								{" Obese", "           30.1\t", "   -"}
							 };
		String AskUser;
		do
		{
			try 
			{
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			} 
			catch (IOException | InterruptedException ex) 
			{
				ex.printStackTrace();
			}
			System.out.println("\n--------------------------------------------------");
			Scanner BMIScan = new Scanner(System.in);
			Scanner User = new Scanner(System.in);
			for (int row = 0; row < BMITable.length; row++) 
			{
				for (int col = 0; col < BMITable[row].length; col++)
				{
					System.out.print(BMITable[row][col] + "\t");
				}
				System.out.println("");
			}
			System.out.println("\n---------------- YOUR INFROMATION ----------------\n");
			String name="",phoneNo="",ClassBMI="",gender="",BMI="",WeightS="";
			int BilUser=1;
			System.out.print("\n Name : ");
			name=BMIScan.nextLine();
			name=name.toUpperCase();
			System.out.print(" Phone Number : ");
			phoneNo=BMIScan.nextLine();
			System.out.print(" Gender [ M or F ] : ");
			gender=BMIScan.nextLine();
			gender=gender.toUpperCase();
			if(gender.equals("M")||gender.equals("MALE")||gender.equals("F")||gender.equals("FEMALE"))
			{
				if(gender.equals("M")||gender.equals("MALE"))
				{
					gender="Male";
				}
				else if(gender.equals("F")||gender.equals("FEMALE"))
				{
					gender="Female";
				}
				int age=0 ;
				System.out.print(" Age [ 2 - 120 ] : ");
				age=BMIScan.nextInt();
				double Height =0 , Weight=0 , BMIPerson=0;
				System.out.print(" Height [ cm / m ] : ");
				Height=BMIScan.nextDouble();
				if (Height>=100)
				{
					Height/=100;
				}
				else
				{
					Height=Height;
				}
				System.out.print(" Weight : [ g / kg ] : ");
				Weight=BMIScan.nextDouble();
				if (Weight>=700)
				{
					Weight/=700;
				}
				else
				{
					Weight=Weight;
				}
				BMIPerson=Weight/(Height*Height);
				if (BMIPerson<=18.49)
				{
					ClassBMI=BMITable[1][0];
				}
				else if (BMIPerson>=18.5 && BMIPerson<=25)
				{
					ClassBMI=BMITable[2][0];
				}
				else if (BMIPerson>25 && BMIPerson<=30)
				{
					ClassBMI=BMITable[3][0];
				}
				else if (BMIPerson<=30.1)
				{
					ClassBMI=BMITable[4][0];
				}
				try 
				{
					new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				} 
				catch (IOException | InterruptedException ex) 
				{
					ex.printStackTrace();
				}
				System.out.println("\n--------------------------------------------------");
				System.out.println("\tThankYou To Calculate your BMI with Us.");
				name=name.toUpperCase();
				gender=gender.toUpperCase();
				Height*=100;
				WeightS=String.format("%.2f",Weight);
				BMI=String.format("%.2f",BMIPerson);
				ClassBMI=ClassBMI.toUpperCase();
				System.out.println("\n---------------- YOUR BMI RESULT -----------------\n");
				System.out.println("                    Your Details : ");
				System.out.println("                 Name     : "+name);
				System.out.println("                 Phone No : "+phoneNo);
				System.out.println("                 Gender   : "+gender);
				System.out.println("                 Age      : "+age);
				System.out.println("                 Height   : "+Height+" CM ");
				System.out.println("                 Weight   : "+WeightS+" KG ");
				System.out.println("                 BMI      : "+BMI);
				System.out.println("                            "+ClassBMI);
				System.out.println("\n--------------------------------------------------");
			}
			else
			{
				try 
				{
					new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				} 
				catch (IOException | InterruptedException ex) 
				{
					ex.printStackTrace();
				}
				System.out.println("\n--------------------------------------------------\n");
				System.out.print("You just Must to insert M (Male) or F (Female) only.\n");
				System.out.println("\n--------------------------------------------------");
			}
			System.out.print("Insert Y to Continue Calculate or press Enter to Exit = ");
			AskUser=User.nextLine();
			AskUser=AskUser.toUpperCase();
			try 
			{
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			} 
			catch (IOException | InterruptedException ex) 
			{
				ex.printStackTrace();
			}
			System.out.println("\n--------------------------------------------------");
			System.out.println("\n     Thankyou To Using Our BMI Calculator");
			System.out.println("\n--------------------------------------------------");
		}
		while(AskUser.equals("Y"));
    }
    public static void main(String args[]) 
	{  
        BMICalc test = new BMICalc();
        test.calc();
    }
}
