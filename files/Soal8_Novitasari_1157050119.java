import java.util.*;
public class soal8 {
	public static void main (String [] args){
	Scanner in = new Scanner();
	
	int jumbil;
	System.out.print("Masukan jumlah bilangan :");
	jumbil=in.nextInt();
	
	for(int i=1; i<=jumbil; i++){
		if(i%2==0)
			System.out.print(i);
		else
			System.out.print(" ");
		}
	}
}
	