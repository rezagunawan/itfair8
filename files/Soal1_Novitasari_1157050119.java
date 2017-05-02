import java.util.Scanner;
public class soal1 {
	public static void main (String [] args){
		Scanner in = new Scanner();
		int masuk;
		System.out.print("Masukan angka :");
		masuk=in.nextInt();
			
			if (masuk%2==0)
				System.out.print(masuk+" adalah bilangan genap.");
			else
				System.out.print(masuk+" adalah bilangan ganjil.");
	}
}