import java.util.Scanner;
public class soal3{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a[]={2,3,1,5,4,7,8,9};
		int x;
		System.out.print("Bilangan: ");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.print("\nMasukan angka yang dicari :");
		x=in.nextInt();
		for(int i=0;i<a.length;i++){
			if(x==a[i]){
				System.out.print("Output : Bilangan "+x+" ada di indeks ke "+(i+1));
			}
		}



	}
}