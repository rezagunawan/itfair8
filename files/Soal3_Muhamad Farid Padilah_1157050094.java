import java.util.Scanner;
	public class NoTiga{
		public static void main(String args[]){
			Scanner in=new Scanner (System.in);
			int bil,a;
			int aray[]={2,3,1,5,4,7,8,9};
			System.out.println("masukan bilangan = ");
			bil=in.nextInt();
			for(a=0;a<8;a++){
				if(aray[a]==bil){
					System.out.println("angka yang anda cari terdapat pada index "+(a+1));
				}
			}
		}
	}