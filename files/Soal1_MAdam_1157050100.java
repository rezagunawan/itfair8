import java.util.Scanner;
public class soal1{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int x;
		System.out.print("Masukan angka: ");
		x=in.nextInt();
		if ((x%2==0)&&(x>0))
			System.out.print(x+" adalah Bilangan Genap Positif");
		else if((x%2==0)&&(x<0))
			System.out.print(x+" adalah Bilangan Genap Negaif");
		else if((x%2!=0)&&(x<0))
			System.out.print(x+" adalah Bilangan Ganjil Negaif");
		else if((x%2!=0)&&(x>0))
			System.out.print(x+" adalah Bilangan Ganjil Positif");
	}
}