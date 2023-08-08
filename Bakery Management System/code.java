import java.io.*;
class Bakery
{
	static String name;static char gender;static String dob;
	static String occu;static char martial;static double weight=0.0;static int item=0;
	static double totalcost=0.0;
	static int noofitems=0;static int option=0;
	static String hh="";
	static char c='y';
	static char trial='y';
	static int n;
	static int i=0;
	static double cost=0.0;static char tt='n';
	public static void clearScreen()
	{
		System.out.print("\033[H\033[2J");
		System.out.flush();
		System.out.println();
	}
	void details() throws IOException
	{
		clearScreen();
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		tt='n';
		System.out.println("\n\nEnter your details below\n\n");
		while(tt=='n' || tt=='N')
		{
			System.out.print("Enter your name : ");
			name=br.readLine();
			System.out.print("Enter your Gender : ");
			gender=(br.readLine()).charAt(0);
			if(!(gender=='m' || gender=='M' || gender=='f' || gender=='F'))
			{System.out.println("\n\nInvalid Gender. Enter your details again.\n\n");
				continue;
			}
			tt='y';
		}
		System.out.print("Enter your Date of Birth : ");
		dob=br.readLine();
		System.out.print("Enter your Occupation : ");
		occu=br.readLine();
		System.out.print("Enter your Martial Status : ");
		martial=(br.readLine()).charAt(0);
	}
	void fooditems()
	{
		clearScreen();
		System.out.println(" ___________________________________________________________________________");
		System.out.println("| FOOD ITEM            | COST in Rs. | OPTION |\n");
		System.out.println("| Pineapple Cake       | 400/kg      |    1   |");
		System.out.println("| Vanilla Cake         | 500/kg      |    2   |");
		System.out.println("| Cream Cake           | 550/kg      |    3   |");
		System.out.println("| Chocolate Cake       | 600/kg      |    4   |");
		System.out.println("| Strawberry Cake      | 600/kg      |    5   |");
		System.out.println("| Black forest Cake    | 575/kg      |    6   |");
		System.out.println("| Plum Cake            | 605/kg      |    7   |");
		System.out.println("| Egg Puff             | 25/item     |    8   |");
		System.out.println("| Veg Puff             | 25/item     |    9   |");
		System.out.println("| Chicken Puff         | 30/item     |   10   |");
		System.out.println("| Pineapple Pastry     | 30/item     |   11   |");
		System.out.println("| Vanilla Pastry       | 40/item     |   12   |");
		System.out.println("| Cream Pastry         | 50/item     |   13   |");
		System.out.println("| Chocolate Pastry     | 50/item     |   14   |");
		System.out.println("| Strawberry Pastry    | 45/item     |   15   |");
		System.out.println("| Black forest Pastry  | 60/item     |   16   |");
		System.out.println("| Plum Pastry          | 60/item     |   17   |");
		System.out.println("| Samosa               | 25/item     |   18   |");
		System.out.println("| Chicken Roll         | 35/item     |   19   |");
		System.out.println("| Veg Roll             | 30/item     |   20   |");
		System.out.println("| Bread                | 25/pack     |   21   |");
		System.out.println("| Toffees              | 30/pack     |   22   |");
		System.out.println("| Donut                | 75/pack     |   23   |");
		System.out.println("| Bakery flour         | 80/pack     |   24   |");
		System.out.println("| Wheat Rusk           | 40/pack     |   25   |");
		System.out.println("| Pineapple Cupcake    | 40/item     |   26   |");
		System.out.println("| Vanilla Cupcake      | 50/item     |   27   |");
		System.out.println("| Cream Cupcake        | 55/item     |   28   |");
		System.out.println("| Chocolate Cupcake    | 60/item     |   29   |");
		System.out.println("| Strawberry Cupcake   | 60/item     |   30   |");
		System.out.println("| Black forest Cupcake | 55/item     |   31   |");
		System.out.println("| Plum Cupcake         | 60/item     |   32   |");
		System.out.println(" __________________________________________________________________________");
		System.out.println("\n\n");
		System.out.println("Press any option between 1 to 32 if you want to buy anything.\nPress 0 if you don't want to buy anything.\n");
	}
	void input() throws IOException
	{
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		clearScreen();
		Bakery u=new Bakery();
		System.out.println("\n\n");
		System.out.print("Enter the no of food items : ");
		noofitems=Integer.valueOf(br.readLine());
		System.out.println("\n\n");
		for(i=1;i<=noofitems;i++)
		{
			n=1;
			while(n==1)
			{
				clearScreen();
				u.fooditems();
				System.out.println("\n\n");
				System.out.print("Enter the option of the food item "+i+" : ");
				option=Integer.valueOf(br.readLine());
				if(option>=0 && option<=32)
				{
					n=0;
				}
				else
				{n=1;}
				System.out.println("\n\n");
				switch(option)
				{
					case 1:
						System.out.print("Enter the weight : ");
						weight=Double.valueOf(br.readLine());
						totalcost+=(400.0*weight);
						break;
					case 2:
						System.out.print("Enter the weight : ");
						weight=Double.valueOf(br.readLine());
						totalcost+=(500.0*weight);break;
					case 3:
						System.out.print("Enter the weight : ");
						weight=Double.valueOf(br.readLine());
						totalcost+=(550.0*weight);break;
					case 4:
						System.out.print("Enter the weight : ");
						weight=Double.valueOf(br.readLine());
						totalcost+=(600.0*weight);break;
					case 5:
						System.out.print("Enter the weight : ");
						weight=Double.valueOf(br.readLine());
						totalcost+=(600.0*weight);break;
					case 6:
						System.out.print("Enter the weight : ");
						weight=Double.valueOf(br.readLine());
						totalcost+=(575.0*weight);break;
					case 7:
						System.out.print("Enter the weight : ");
						weight=Double.valueOf(br.readLine());
						totalcost+=(605.0*weight);
						break;
					case 8:
						System.out.print("Enter the no of items : ");
						noofitems=Integer.valueOf(br.readLine());
						totalcost+=(25.0*(double)(noofitems));break;
					case 9:
						System.out.print("Enter the no of items : ");
						noofitems=Integer.valueOf(br.readLine());
						totalcost+=(25.0*(double)(noofitems));break;
					case 10:
						System.out.print("Enter the no of items : ");
						noofitems=Integer.valueOf(br.readLine());
						totalcost+=(30.0*(double)(noofitems));break;
					case 11:
						System.out.print("Enter the no of items : ");
						noofitems=Integer.valueOf(br.readLine());
						totalcost+=(30.0*(double)(noofitems));break;
					case 12:
						System.out.print("Enter the no of items : ");
						noofitems=Integer.valueOf(br.readLine());
						totalcost+=(40.0*(double)(noofitems));break;
					case 13:
						System.out.print("Enter the no of items : ");
						noofitems=Integer.valueOf(br.readLine());
						totalcost+=(50.0*(double)(noofitems));break;
					case 14:
						System.out.print("Enter the no of items : ");
						noofitems=Integer.valueOf(br.readLine());
						totalcost+=(50.0*(double)(noofitems));break;
					case 15:
						System.out.print("Enter the no of items : ");
						noofitems=Integer.valueOf(br.readLine());
						totalcost+=(45.0*(double)(noofitems));break;
					case 16:
						System.out.print("Enter the no of items : ");
						noofitems=Integer.valueOf(br.readLine());
						totalcost+=(60.0*(double)(noofitems));break;
					case 17:
						System.out.print("Enter the no of items : ");
						noofitems=Integer.valueOf(br.readLine());
						totalcost+=(60.0*(double)(noofitems));break;
					case 18:
						System.out.print("Enter the no of items : ");
						noofitems=Integer.valueOf(br.readLine());
						totalcost+=(25.0*(double)(noofitems));break;
					case 19:
						System.out.print("Enter the no of items : ");
						noofitems=Integer.valueOf(br.readLine());
						totalcost+=(35.0*(double)(noofitems));break;
					case 20:
						System.out.print("Enter the no of items : ");
						noofitems=Integer.valueOf(br.readLine());
						totalcost+=(30.0*(double)(noofitems));break;
					case 21:
						System.out.print("Enter the no of items : ");
						noofitems=Integer.valueOf(br.readLine());
						totalcost+=(25.0*(double)(noofitems));break;
					case 22:
						System.out.print("Enter the no of items : ");
						noofitems=Integer.valueOf(br.readLine());
						totalcost+=(30.0*(double)(noofitems));break;
					case 23:
						System.out.print("Enter the no of items : ");
						noofitems=Integer.valueOf(br.readLine());
						totalcost+=(75.0*(double)(noofitems));break;
					case 24:
						System.out.print("Enter the no of items : ");
						noofitems=Integer.valueOf(br.readLine());
						totalcost+=(80.0*(double)(noofitems));
						break;
					case 25:
						System.out.print("Enter the no of items : ");
						noofitems=Integer.valueOf(br.readLine());
						totalcost+=(40.0*(double)(noofitems));break;
					case 26:
						System.out.print("Enter the no of items : ");
						noofitems=Integer.valueOf(br.readLine());
						totalcost+=(40.0*(double)(noofitems));break;
					case 27:
						System.out.print("Enter the no of items : ");
						noofitems=Integer.valueOf(br.readLine());
						totalcost+=(50.0*(double)(noofitems));break;
					case 28:
						System.out.print("Enter the no of items : ");
						noofitems=Integer.valueOf(br.readLine());
						totalcost+=(55.0*(double)(noofitems));break;
					case 29:
						System.out.print("Enter the no of items : ");
						noofitems=Integer.valueOf(br.readLine());
						totalcost+=(60.0*(double)(noofitems));break;
					case 30:
						System.out.print("Enter the no of items : ");
						noofitems=Integer.valueOf(br.readLine());
						totalcost+=(60.0*(double)(noofitems));break;
					case 31:
						System.out.print("Enter the no of items : ");
						noofitems=Integer.valueOf(br.readLine());
						totalcost+=(55.0*(double)(noofitems));break;
					case 32:
						System.out.print("Enter the no of items : ");
						noofitems=Integer.valueOf(br.readLine());
						totalcost+=(60.0*(double)(noofitems));break;
					case 0:
						System.out.println("Since you have pressed 0, you don't have to buy
								anything. Press Enter to go ahead.");
								hh=br.readLine();
						totalcost+=0.0;
						break;
					default: break;
				}
				if(option>32)
				{
					System.out.println("\n\nWrong Choice!!\nPress Enter to repeat.\n\n");
					hh=br.readLine();
					n=1;
					totalcost+=0.0;
				}
			}
		}
	}
	void emulate() throws IOException
	{
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		totalcost=0;
		Bakery p=new Bakery();
		c='y';
		while(c=='y' || c=='Y')
		{
			p.input();
			System.out.println("");
			System.out.println("Do you want to continue (y/n) or (Y/N)?");
			c=(br.readLine()).charAt(0);
			System.out.println("\n\n");
		}
		System.out.println("\n\n");
	}
	void display() throws IOException
	{
		clearScreen();
		System.out.println("\n\n");
		System.out.println("PAY BILL OF THE PERSON");
		System.out.println("");
		System.out.println("_____________________________________________");
		System.out.println("Name of the person : "+name);
		if(gender=='m' || gender=='M')
		{
			System.out.println("His Date of Birth : "+dob);
			System.out.println("His Occupation : "+occu);
			if(martial=='m' || martial=='M')
			{
				System.out.println("His Martial Status : Married");
			}
			else
			{
				System.out.println("His Martial Status : Unmarried");
			}
			System.out.println("\n");
			System.out.println("Total money that he should give : "+totalcost);
		}
		else if (gender=='f' || gender=='F')
		{
			System.out.println("Her Date of Birth : "+dob);
			System.out.println("Her Occupation : "+occu);
			if(martial=='m' || martial=='M')
			{
				System.out.println("Her Martial Status : Married");
			}
			else
			{
				System.out.println("Her Martial Status : Unmarried");
			}
			System.out.println("\n");
			System.out.println("Total money that she should give : "+totalcost);
		}
		System.out.println("_____________________________________________");
		System.out.println("\n\n");
	}
	public static void main(String args[]) throws IOException
	{
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		Bakery bk=new Bakery();
		trial='y';
		while(trial=='y' || trial=='Y')
		{
			totalcost=0.0;
			bk.details();
			bk.emulate();
			bk.display();
			System.out.println("\n\n");
			System.out.println("Do you want to continue the shop (y/n) or (Y/N)?");
			trial=(br.readLine()).charAt(0);
			System.out.println("\n\n");
		}
		clearScreen();
		System.out.println("\n");
		System.out.println("THE END!!");
		System.out.println("\n\n");
	}
}