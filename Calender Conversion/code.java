import java.io.*;
public class calender
{
	static int date;
	static String m;
	static int mon;
	static int year;
	static char c;
	static String o;
	static boolean u=true;
	static boolean a,b,cc;
	static int addfac;
	static void input() throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			System.out.print("Enter the date : ");
			date=Integer.valueOf(br.readLine());
			System.out.print("Enter the month : ");
			m=br.readLine();
			m=m.trim();
			m=m.toLowerCase();
			System.out.print("Enter the year : ");
			year=Integer.valueOf(br.readLine());
			System.out.println("Is the given date from Julian calender or Gregorian Calender : ");
			c=Character.toLowerCase((br.readLine()).charAt(0));
			if(c!='g' && c!='j')
			{
				System.out.println("Wrong Choice of Calender");
				System.out.println("Press Enter to re-enter the calender date : ");
				c=Character.toLowerCase((br.readLine()).charAt(0));
				continue;
			}
			else if(year<=1500 || year>2300)
			{
				System.out.println("Wrong Choice of year");
				System.out.println("Press Enter to re-enter the calender date : ");
				c=Character.toLowerCase((br.readLine()).charAt(0));
				continue;
			}
			else
			{
				break;
			}
		}
	}
	static boolean julianLeapYear(int ye)
	{
		if(ye%4==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	static boolean gregorianLeapYear(int ye)
	{
		if(ye%100==0)
		{
			if(ye%400==0)
			{return true;}
			else
			{return false;}
		}
		else
		{
			if(ye%4==0)
			{return true;}
			else
			{return false;}
		}
	}
	static void monnum() throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		o=m.substring(0,3);
		u=false;
		if(o.equals("jan"))
		{
			mon=1;
		}
		else if(o.equals("feb"))
		{
			mon=2;
		}
		else if(o.equals("mar"))
		{
			mon=3;
		}
		else if(o.equals("apr"))
		{
			mon=4;
		}
		else if(o.equals("may"))
		{
			mon=5;
		}
		else if(o.equals("jun"))
		{
			mon=6;
		}
		else if(o.equals("jul"))
		{
			mon=7;
		}
		else if(o.equals("aug"))
		{
			mon=8;
		}
		else if(o.equals("sep"))
		{
			mon=9;
		}
		else if(o.equals("oct"))
		{
			mon=10;
		}
		else if(o.equals("nov"))
		{
			mon=11;
		}
		else if(o.equals("dec"))
		{
			mon=12;
		}
		else
		{
			mon=0;
			System.out.println("You have entered the wrong month. Press Enter to re-enter
					the details");
					o=br.readLine();
			u=true;
		}
	}
	static int add(int yu)
	{
		if(yu>=1800 && yu<=1899)
		{
			addfac=12;
		}
		else if(yu>=1900 && yu<=2099)
		{
			addfac=13;
		}
		else if(yu>=1501 && yu<=1699)
		{
			addfac=10;
		}
		else if(yu>=1700 && yu<=1799)
		{
			addfac=11;
		}
		else if(yu>=2100 && yu<=2300)
		{
			addfac=14;
		}
		return addfac;
	}
	static void congregtojul()
	{
		date-=add(year);
		mon--;
		a=((mon==1)||(mon==3)||(mon==5)||(mon==7)||(mon==8)||(mon==10)||(mon==0));
		b=((mon==4)||(mon==6)||(mon==9)||(mon==12));
		cc=(mon==2);
		if(date<1)
		{
			if(a)
			{
				date+=31;
			}
			else if(b)
			{
				date+=30;
			}
			else if(cc)
			{
				if(julianLeapYear(year))
				{
					date+=29;
				}
				else
				{
					date+=28;
				}
			}
			if(mon==0)
			{
				mon=12;
				year--;
			}
		}
		else
		{
			mon++;
		}
	}
	static void calmon()
	{
		switch(mon)
		{
			case 1:m="January";
				break;
			case 2:m="February";
				break;
			case 3:m="March";
				break;
			case 4:m="April";
				break;
			case 5:m="May";
				break;
			case 6:m="June";
				break;
			case 7:m="July";
				break;
			case 8:m="August";
				break;
			case 9:m="September";
				break;
			case 10:m="October";
				break;
			case 11:m="November";
				break;
			case 12:m="December";
				break;
		}
	}
	static void conjultogreg()
	{
		date+=add(year);
		a=((mon==1)||(mon==3)||(mon==5)||(mon==7)||(mon==8)||(mon==10)||(mon==12));
		b=((mon==4)||(mon==6)||(mon==9)||(mon==12));
		cc=(mon==2);
		if(a)
		{
			if(date>=31)
			{
				date-=31;
				mon++;
			}
			if(mon==13)
			{
				mon=1;
				year++;
			}
		}
		else if(b)
		{
			if(date>=30)
			{
				date-=30;
				mon++;
			}
		}
		else if(cc)
		{
			if(gregorianLeapYear(year))
			{
				if(date>=29)
				{
					date-=29;
					mon++;
				}
			}
			else
			{
				if(date>=28)
				{
					date-=28;
					mon++;
				}
			}
		}
	}
	public static void main(String args[]) throws IOException
	{
		while(u)
		{
			calender.input();
			calender.monnum();
			if(u)
			{
				continue;
			}
			if(c=='g')
			{
				calender.congregtojul();
				calender.calmon();
				System.out.println("Julian Date : "+m+" "+date+", "+year);
				System.exit(0);
			}
			else if(c=='j')
			{
				calender.conjultogreg();
				calender.calmon();
				System.out.println("Gregorian Date : "+m+" "+date+", "+year);
				System.exit(0);
			}
		}
	}
}