import java.util.Scanner;
public class soal9{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n;
		System.out.print("Masukan jumlah ayam");
		n=in.nextInt();
		System.out.print("Anak ayam turun "+n+"\n");
		for(int j=n; j>0;j--){
			System.out.println("Anak ayam turun "+j+" mati satu tinggal "+(j-1));
			j=j-1;
		}
		System.out.println("Anak ayam turun 1 mati satu tinggal induknya");
	}
}