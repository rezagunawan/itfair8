import java.util.Scanner;
public class kasus9{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int i;
		int n =10;
		System.out.print("Anak ayam turun 10\n");
		for(i=n;i>=1;i--){
			if(i==1){
				System.out.print("Anak ayam turun "+i+", mati 1 tinggal induknya\n");
			}
			else{
				System.out.print("Anak ayam turun "+i+", mati 1 tinggal "+(i-1)+"\n");
			}
		}
	}
}