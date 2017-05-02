import java.util.*;
public class no_5{
	public static void main(String[]args){
		Scanner in = new Scanner(System.in);
		
		
		int jumlah=0;
		int rata=0;
	int[]data = new int[100];	
	   System.out.println("masukan jumlah bilangan : ");
	   int jum = in.nextInt();
	   
	   for(int a=0;a<jum;a++){
		System.out.print("Masukan Bilangan ke-"+a+" : ");
		 data[a]=in.nextInt();
		System.out.println();
		 jumlah = data[a]+jumlah;
		 rata= jumlah/jum;
		}
		
		System.out.print("Rata-rata :");
		 for(int a=0;a<jum;a++){
		 System.out.print(data[a]+"+ ");
		 }
		 System.out.println("= "+rata);
	}
}