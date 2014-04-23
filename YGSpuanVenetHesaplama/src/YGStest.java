import java.util.Scanner;


public class YGStest {


	

	public static void main(String[] args)
	{
		try {
		
		double Dogru,Yanlis,MBos,FBos,SBos,TBos,MatNet,MatPuan,TNet,TPuan,SNet,SPuan,FNet,FPuan;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Matematik");
		System.out.println("Doğru=");
		Dogru=scan.nextDouble();
		System.out.println("Yanlis=");
		Yanlis=scan.nextDouble();
		System.out.println("Bos=");
		
		MBos=scan.nextDouble();
		if (Dogru+Yanlis+MBos>40 || MBos<0)
		{
			System.out.println("Soru sayımız 40.Lütfen tekrar deneyiniz.");
			main(args);
		}
		MatNet=YGS.Net(Dogru, Yanlis);
		MatPuan=YGS.Puan(Dogru, Yanlis);
		
		System.out.println("Türkçe");
		System.out.println("Doğru=");
		Dogru=scan.nextDouble();
		System.out.println("Yanlis=");
		Yanlis=scan.nextDouble();
		System.out.println("Bos=");
		TBos=scan.nextDouble();
		if (Dogru+Yanlis+TBos>40 || TBos<0)
		{
			System.out.println("Soru sayımız 40.Lütfen tekrar deneyiniz.");
			main(args);
		}
		TNet=YGS.Net(Dogru, Yanlis);
		TPuan=YGS.Puan(Dogru, Yanlis);
		
		System.out.println("\nSosyal Bilgiler");
		System.out.println("Doğru=");
		Dogru=scan.nextDouble();
		System.out.println("Yanlis=");
		Yanlis=scan.nextDouble();
		System.out.println("Bos=");
		SBos=scan.nextDouble();
		if (Dogru+Yanlis+SBos>40 || SBos<0)
		{
			System.out.println("Soru sayımız 40.Lütfen tekrar deneyiniz.");
			main(args);
		}
		SNet=YGS.Net(Dogru, Yanlis);
		SPuan=YGS.Puan(Dogru, Yanlis);
		
		System.out.println("Fen Bilgisi");
		System.out.println("Doğru=");
		Dogru=scan.nextDouble();
		System.out.println("Yanlis=");
		Yanlis=scan.nextDouble();
		System.out.println("Bos=");
		FBos=scan.nextDouble();
		if (Dogru+Yanlis+FBos>40 || FBos<0)
		{
			System.out.println("Soru sayımız 40.Lütfen tekrar deneyiniz.");
			main(args);
		}
		FNet=YGS.Net(Dogru, Yanlis);
		FPuan=YGS.Puan(Dogru, Yanlis);
		
		System.out.println("\nMatematik Net="+MatNet);
		System.out.println("Matematik Puan="+MatPuan);
		System.out.println("Matematik Boş="+MBos);
		System.out.println("\nTürkçe Net="+TNet);
		System.out.println("Türkçe Puan="+TPuan);
		System.out.println("Türkçe Boş="+TBos);
		System.out.println("\nSosyal Bilgiler Net="+SNet);
		System.out.println("Sosyal Bilgiler Puan="+SPuan);
		System.out.println("Sosyal Bilgiler Bos="+SBos);
		System.out.println("\nFen Bilgisi Net="+FNet);
		System.out.println("Fen Bilgisi Puan="+FPuan);
		System.out.println("Fen Bilgisi Bos="+FBos);
		
		
		
		System.out.println("\nToplam Net="+(MatNet+TNet+SNet+FNet));
		System.out.println("Toplam Puan="+(MatPuan+TPuan+SPuan+FPuan));
		
		
		
		} 
		catch (Exception e) 
		{
			System.out.println("Hatalı Bir Giris Yaptiniz.Lütfen Tekrar Deneyiniz. ");
			main(args);
		}
	}
		

}
