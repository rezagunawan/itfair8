import java.util.Scanner;
public class kasus5{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int n, i, jum, bil;
		jum = 0;
		System.out.print("masukkan jumlah bilangan : ");
		n = in.nextInt();
		for(i=0;i<n;i++){
			System.out.print("Masukkan bilangan ke-"+(i+1)+" : ");
			bil = in.nextInt();
			jum = jum + bil;
		}
		double rata = jum/n;
		System.out.print("rata = "+rata);
	}
}