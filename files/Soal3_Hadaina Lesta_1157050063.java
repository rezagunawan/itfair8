import java.util.Scanner;
public class searching
{
	public static void main(String[]args)
	{
		Scanner in=new Scanner(System.in);
		int a[]={2,3,1,5,4,7,8,9};
		int i,n;
		
		System.out.print("input bilangan yang anda cari : "); n=in.nextInt();
		for (i=0; i<a.length; i++)
		{
			if (n==a[i])
			{System.out.println("bilangan "+n+" ada di indeks a[ "+i+" ]");}
		
		
		}
		if  ((n!=a[0])&&(n!=a[1])&&(n!=a[2])&&(n!=a[3])&&(n!=a[4])&&(n!=a[5])&&(n!=a[6])&&(n!=a[7]))
			{System.out.println("bilangan yang anda cari tidak ada");}
		
		System.out.print("deret bilangan : ");
		for (i=0; i<a.length; i++)
		System.out.print(a[i]); 
	}

}
