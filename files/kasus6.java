import java.util.Scanner;
public class kasus6{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int i, n;
		System.out.print("input : ");
		n = in.nextInt();
		for(i=0;i<n*2;i++){
			if(i%2!=0){
				System.out.print(i+" ");
			}
		}
	}
}