import java.util.Scanner;
public class kasus4{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int n, x, y;
		String z;
		System.out.print("Input : ");
		n = in.nextInt();
		x = n/100;
		y = x*100;
		if(n>100){
			if(n<y || n>y){
				n = y;
				System.out.print(n);
			}
		}
		else if(n<100){
			System.out.print("Gratis");	
		}
	}
}