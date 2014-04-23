
public class YGS 
{

	public static double Net(double Dogru,double Yanlis)
	{
		
			
		if (Dogru<0 || Dogru>40 || Yanlis<0 ||Yanlis>40 || Yanlis+Dogru>40)
		{
			System.out.println("Soru sayımız 40.Lütfen tekrar deneyiniz.");
			YGStest.main(null);
		}
		double hesap=0,Net=0;
		hesap=Yanlis/4;
		Net=Dogru-hesap;
		
		
		return  Net;
	}
	
	
	public static double Puan(double Dogru,double Yanlis)
	{
		if (Dogru<0 || Dogru>40 || Yanlis<0 ||Yanlis>40 ||Yanlis+Dogru>40)
		{
			System.out.println("Soru sayımız 40.Lütfen tekrar deneyiniz.");
			YGStest.main(null);
		}
		double hesap=0,Net=0,Puan=0;
		hesap=Yanlis/4;
		Net=Dogru-hesap;
		Puan=Net*4;
		return Puan;
	}


	
	
	
	
}
