import java.util.Scanner;
public class soal8{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n;
		System.out.print("Masukan jumlah bilangan: ");
		n=in.nextInt();

		for(int i=1;i<=n*2;i++){
			if(i%2==0)
				System.out.print(i+" ");
		}
	}
}