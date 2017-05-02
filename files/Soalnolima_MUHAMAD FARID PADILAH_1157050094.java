import java.util.Scanner;
	public class Nolima{
		public static void main(String args[]){
			Scanner in=new Scanner (System.in);
			int aray[]=new int[100];
			int a,b,bil;
			float rata;
			System.out.println("berapa bilangan yang ingin anda masukan =");
				bil=in.nextInt();
			for(a=1;a<=bil;a++){
				System.out.println("bilangan ke "+a+" = ");
				aray[a]=in.nextInt();
			}
			b=0;
			for(a=1;a<=bil;a++){
				b=b+aray[a];
			}
			rata=b/bil;
			System.out.println("rata-rata = "+rata);
			}
			}