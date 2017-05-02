import java.util.Scanner;
public class harga
{
	public static void main(String[]args)
	{
	int j,bulat,a;
		Scanner in=new Scanner(System.in);
		
		int i,n;
		
		System.out.print("input harga dari 1-100000 : "); a=in.nextInt();
		
		if  (a>=1000&&a<=100000)
		{
			bulat=a%100;
			j=a-bulat;System.out.print(j);
		}
			
		else if (a<100)
		{System.out.print("Gratis");}

		
	}

}
