import java.util.Scanner;
public class Gangen
{
	public static void main(String[] args){
	int a,c;
	Scanner masuk= new Scanner(System.in);
	System.out.print("Masukkan Sembarang bilangan : ");
	 a = masuk.nextInt();
     c = a%2;
	if (c==0){
	System.out.print(a+"  Merupakan bilangan genap");}
	else{ System.out.print(a+" Merupakan bilangan ganjil");}
		
	
	
	}	
}