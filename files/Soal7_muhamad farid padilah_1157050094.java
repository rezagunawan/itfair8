import java.util.Scanner;
	public class Notujuh{
		public static void main(String args[]){
			Scanner in=new Scanner (System.in);
			int aray[]=new int[100];
			int bil,a,b;
			System.out.println("masukan bilangan = ");
			bil=in.nextInt();
			for(a=1;a<=bil;a++){
				System.out.println ("bilangan ke "+a);
				aray[a]=in.nextInt();
			    }
				for(a=1;a<=bil;a++){
				if(aray[a]%2==1){
					System.out.println("ganjil= "+aray[a]);
				}
			    }
			}
	}
			