import java.util.*;
public class soal10 {
	public static void main (String [] args){
	Scanner in = new Scanner();
	
	int jumbil;
	System.out.print("Masukan bilangan :");
	jumbil=in.nextInt();
	
	for(int i=jumbil; i>=jumbil; i--){
			System.out.print(i+" x ");
			if (i==1)
				System.out.print(i+" x "+jml);
			
			int jml+=(i*(i-1));
			
		}
	}
}
	