import java.util.Scanner;
public class kasus10{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int i, n, hasil;
		hasil = 1;
		System.out.print("input : ");
		n = in.nextInt();
		for(i=n;i>=1;i--){
			hasil = hasil * i;
		}
		System.out.print("Hasil = "+hasil);
	}
}