import java.io.*;
public class Astable
{
	static String uvc="";
	static String uic="";
	static String uf="";
	static String ud="";
	static double Vcc=0;
	static double Ic=0;
	static double f=0;
	static double dc=0;
	static double hfe=0;
	static double R1=0;
	static double R2=0;
	static double Rc1=0;
	static double Rc2=0;
	static String mat="";
	static double Vce=0;
	static double Vbe=0;
	static double Ib=0;
	static double T=0;
	static double Ton=0;
	static double Toff=0;
	static double C1=0;
	static double C2=0;
	public void input() throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		boolean p=true;
		while(p)
		{
			p=false;
			System.out.print("Enter the material of transistor used : ");
			mat=br.readLine();
			if(mat.charAt(0)=='g' || mat.charAt(0)=='G')
			{
				Vce=0.1;Vbe=0.3;
			}
			else
			{
				Vce=0.2;Vbe=0.7;
			}
			System.out.print("Enter the external peak to peak voltage : ");
			Vcc=Double.valueOf(br.readLine());
			System.out.print("Enter the units of external peak to peak voltage : ");
			uvc=br.readLine();
			uvc=uvc.trim();
			if(uvc.equals("GV"))
			{Vcc*=Math.pow(10,9);}
			else if(uvc.equals("MV"))
			{Vcc*=Math.pow(10,6);}
			else if(uvc.equals("kV"))
			{Vcc*=Math.pow(10,3);}
			else if(uvc.equals("V"))
			{Vcc*=Math.pow(10,0);}
			else if(uvc.equals("mV"))
			{Vcc*=Math.pow(10,-3);}
			else if(uvc.equals("uV"))
			{Vcc*=Math.pow(10,-6);}
			else if(uvc.equals("nV"))
			{Vcc*=Math.pow(10,-9);}
			else
			{System.out.println("Wrong Units!!\n\nPress Enter to enter data once again.");
				uvc=br.readLine();p=true;continue;}
			System.out.print("Enter the collector when transistor is in saturated
					region : ");
			Ic=Double.valueOf(br.readLine());
			System.out.print("Enter the units of collector current when transistor is in
					saturated region : ");
			uic=br.readLine();
			uic=uic.trim();
			if(uic.equals("GA"))
			{Ic*=Math.pow(10,9);}
			else if(uic.equals("MA"))
			{Ic*=Math.pow(10,6);}
			else if(uic.equals("kA"))
			{Ic*=Math.pow(10,3);}
			else if(uic.equals("A"))
			{Ic*=Math.pow(10,0);}
			else if(uic.equals("mA"))
			{Ic*=Math.pow(10,-3);}
			else if(uic.equals("uA"))
			{Ic*=Math.pow(10,-6);}
			else if(uic.equals("nA"))
			{Ic*=Math.pow(10,-9);}
			else
			{System.out.println("Wrong Units!!\n\nPress Enter to enter data once again.");
				uic=br.readLine();p=true;continue;}
			System.out.print("Enter the value of frequency : ");
			f=Double.valueOf(br.readLine());
			System.out.print("Enter the units of frequency : ");
			uf=br.readLine();
			uf=uf.trim();
			if(uf.equals("GHz"))
			{f*=Math.pow(10,9);}
			else if(uf.equals("MHz"))
			{f*=Math.pow(10,6);}
			else if(uf.equals("kHz"))
			{f*=Math.pow(10,3);}
			else if(uf.equals("Hz"))
			{f*=Math.pow(10,0);}
			else if(uf.equals("mHz"))
			{f*=Math.pow(10,-3);}
			else if(uf.equals("uHz"))
			{f*=Math.pow(10,-6);}
			else if(uf.equals("nHz"))
			{f*=Math.pow(10,-9);}
			else
			{System.out.println("Wrong Units!!\n\nPress Enter to enter data once again.");
				uf=br.readLine();p=true;continue;}
			System.out.print("Enter the value of duty cycle : ");
			dc=Double.valueOf(br.readLine());
			System.out.print("Enter the units of duty cycle : ");
			ud=br.readLine();
			ud=ud.trim();
			if(ud.charAt(0)=='%' || ud.charAt(0)=='P' || ud.charAt(0)=='p')
			{dc/=100;}
			System.out.print("Enter the value of hfe : ");
			hfe=Double.valueOf(br.readLine());
		}
	}
	public void calculate()
	{
		Rc1=(Vcc-Vce)/Ic;
		Rc2=Rc1;
		Ib=(1.5*Ic)/hfe;
		R1=(Vcc-Vbe)/Ib;
		R2=R1;
		T=1/f;
		Ton=T*dc;
		Toff=T-Ton;
		C1=Ton/(0.693*R1);
		C2=Toff/(0.693*R2);
	}
	public void print()
	{
		System.out.println("\n");
		System.out.println("\n");
		System.out.println("Rc1 = "+((Rc1)/1000)+"k ohm");
		System.out.println("Rc2 = "+((Rc2)/1000)+"k ohm");
		System.out.println("R1 = "+((R1)/1000)+"k ohm");
		System.out.println("R2 = "+((R2)/1000)+"k ohm");
		System.out.println("C1 = "+((C1*1000000))+" uF");
		System.out.println("C2 = "+((C2*1000000))+" uF");
		System.out.println("\n");
		System.out.println("\n");
	}
	public static void main(String args[]) throws IOException
	{
		Astable mul=new Astable();
		mul.input();
		mul.calculate();
		mul.print();
	}
}