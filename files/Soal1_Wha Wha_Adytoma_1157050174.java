import java.util.*;
public class no_1{
	public static void main(String[]args){
		Scanner in = new Scanner(System.in);
		
		System.out.print("Masukan Bilangan : ");
		int bil = in.nextInt();
		
		if(bil%2==0) {
		System.out.println(bil+" Merupakan Bilangan Genap");}
		
		else if (bil%2<0){
			System.out.println(bil+" Merupakan bilangan ganjil negatif");
			}
			
		else if(bil%2>0){System.out.println
		(bil+" merupakan bilangan ganjil positif");}
		
		}
}