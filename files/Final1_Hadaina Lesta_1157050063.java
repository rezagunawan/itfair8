import java.util.Scanner;
public class pilih
 {
	public static void main (String [] args)
	{
	String a[]={"anggur","apel","jeruk"};
	int harga[]={1000,2000,3000};
	int pil[]= new int [100];
	int jum[]=new int [100];
	
	int jwb;
	int j,total,uang;
		Scanner in = new Scanner(System.in);
		int i,b,c,d,n;
		for (i=0; i<a.length; i++ )
		{ System.out.println(i+") "+a[i]+ "/kg = "+harga[i]); }
		do
		{j=0;j++;
		System.out.print("Masukan pilihan : "); n=in.nextInt();
		System.out.print("Masukan jumlah  : "); jum[j]=in.nextInt();
		System.out.print("mau mengulang pilih angka 0=tidak, 1=ya : "); jwb=in.nextInt();
		
		
		}
			while (jwb!=0);
			total=0 ;
			for (j=0; j<a.length; j++)
			total=total+(jum[j]*harga[j]);
		System.out.println("Total  : "+total); 
			System.out.print("Masukan uang : "); uang=in.nextInt();
			if (uang>=total)
			{
			System.out.print("Kemabalian: "+(uang-total));}
			else 
			{
			System.out.print("Uang anda kurang");}
				
			
		
		
	}
}