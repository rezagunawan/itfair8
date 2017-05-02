import java.util.*;
public class no_4{
	public static void main(String[]args){
		Scanner in = new Scanner(System.in);
		
		System.out.println("Inputkan Harga : Rp.");
		int harga =in.nextInt();
		
		 if(harga<=100 && harga%10!=0){
			System.out.println(" harga menjadi Gratis");}
		 else if(harga>100 && harga%100!=0){
		int hasil= harga-(harga%100);
		System.out.println("Harga : Rp."+hasil);
		
		}
		
	}
}