import java.util.Scanner;
public class Soal5
{
	public static void main(String[] args){
	int a[]=new int[6];
	Scanner masuk= new Scanner(System.in);
	System.out.print("Masukkan Jumlah bilangan : ");
	 int c = masuk.nextInt();
	for (int z=1;z<=c;z++){
		System.out.print("Masukkan bilangan ke-"+z+" : ");
		a[z] = masuk.nextInt();
		
	}
	int m =0;
	for (int z=1;z<=c;z++){
		m=m+a[z];
	}
	int r = m/c;
	System.out.println("Rata rata dari : ");
	for (int z=1;z<=c;z++){
		System.out.print(a[z]+"+");
	}
	System.out.print("/"+c+"= "+r);
	
	}	
}