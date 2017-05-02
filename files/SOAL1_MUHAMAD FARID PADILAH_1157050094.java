import java.util.Scanner;
public class RM{
	public static void main(String[]args){
		Scanner in = new Scanner(System.in);
		int pil;
		System.out.println("===== Selamat datang di RM padang");
		System.out.println("===========masukan pilihan======== ");
		System.out.println("1. Menu dan Harga");
		System.out.println("2. Pembayaran ");
		System.out.println("3. Sisa kembalian");
		System.out.println("4.nilai tambah ");
		System.out.println("MASUKAN PILIHAN = ");
		pil=in.nextInt();
			if(pil==1){
			menu();
			}
			else if(pil==2){
			bayar();	
			}
			else if(pil==3){
			kembalian();
			}
			else if(pil==4){
			tambah();
			}
			}
			public static void menu(){
				System.out.println("===========masukan pilihan======== ");
				System.out.println("1. Ayam Goreng 	RP.10,000");
				System.out.println("2. Ayam penyet	RP.15,000");
				System.out.println("3. Ayam Bakar	RP.12,000");
			}
			public static void bayar(){
				int men;
				Scanner in = new Scanner(System.in);
				System.out.println("===========masukan pilihan======== ");
				System.out.println("1. Ayam Goreng ");
				System.out.println("2. Ayam penyet");
				System.out.println("3. Ayam Bakar");
				System.out.println("menu apa yang anda pilih =");
				men=in.nextInt();
				if(men==1)
				{
				System.out.println("anda harus membayar RP 10,000");
				}
				else if(men==2)
				{
				System.out.println("anda harus membayar RP 15,000");
				}
				else if(men==3)
				{
				System.out.println("anda harus membayar RP 12,000");
				}
				}
			public static void kembalian(){
				int har,bay,tot;
				Scanner in = new Scanner(System.in);
				System.out.println("masukan harga yang harus anda bayar = ");
				har=in.nextInt();
				System.out.println("masukan pecahan uang yang akan anda bayarkan = ");
				bay=in.nextInt();
				if(bay>har){
				tot = bay-har;
				System.out.println("uang kembalian = "+tot);
				}
				else if(bay==har){
					System.out.println("uang anda pas");
				}
				else if (bay<har){
					System.out.println("maaf,uang anda kurang ");
				}
				}
			public static void tambah(){
				int tam,tot,hasil;
				Scanner in = new Scanner(System.in);
				System.out.println("masukan hutang Anda = ");
				tam=in.nextInt();
				System.out.println("biaya yang di beli sebelumnya = ");
				hasil=in.nextInt();
				tot=hasil+tam;
				System.out.println("biaya total "+tot );
			}
				
}
		