import java.util.Scanner;
public class soal5{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n,jum;
		float rat;
		System.out.print("Masukan jumlah bilangan: ");
		n=in.nextInt();
		int a[]=new int[n];

		jum=0;
		for(int i=0;i<a.length;i++){
			System.out.print("Masukan bilangan ke-"+(i+1)+" :");
			a[i]=in.nextInt();
			jum=jum+a[i];
		}

		rat=jum/n;
		System.out.print("Output: \n");
		System.out.println("Rata-rata: ");

		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" +");
		}
		System.out.print("= "+rat);
	}
}