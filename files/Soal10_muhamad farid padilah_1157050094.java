import java.util.Scanner;
	public class Nosepuluh{
		public static void main(String args[]){
			Scanner in=new Scanner (System.in);
			int aray[]=new int[100];
			int bil,hasil,a;
			System.out.println("berapa faktorial =");
			bil=in.nextInt();
			hasil=0;
			for(a=1;a<=bil;a++){
				hasil=hasil+bil*(bil-1);
			}
			System.out.println("faktorial = "+hasil);
		}
	}