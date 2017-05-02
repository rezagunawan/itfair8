import java.util.Scanner;
public class bilangan
{
	public static void main(String[]args)
	{
		Scanner in=new Scanner(System.in);
		int a;
		System.out.print("Masukan bilangan : "); a=in.nextInt();
		if (a==0)
		{System.out.print("bilangan"+a+ "adalah nol");}
		 else if (a%2!=0)
		 {if (a<0){System.out.print("bilangan"+a+ "adalah ganjil negatif");}
		else if (a>0) System.out.print("bilangan"+a+ "adalah ganjil positif");	}
		
		 else if (a%2==0)
		{ if (a<0){System.out.print("bilangan"+a+ "adalah genap negatif");}
		else if (a>0) System.out.print("bilangan"+a+ "adalah genap positif");	}
	}

}
