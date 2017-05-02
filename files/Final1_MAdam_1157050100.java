import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
public class soal1{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Scanner ins=new Scanner(System.in);
		int pil;

		Date tanggal=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("    dd-mm-yyyy   ");

		System.out.println("===============================");
		System.out.println("     Aplikasi PT Angin Ribut   ");
		System.out.println("===============================");
		System.out.println("         M E N U            ");
		System.out.println("1. Menu Makanan dan Harga      ");
		System.out.println("2. Pemesanan dan harga                  ");
		System.out.println("3. Kembalian         ");
		System.out.println(sdf.format(tanggal));
		System.out.println("===============================");
		System.out.print("Masukan pilihan menu(1-3): ");
		pil=in.nextInt();

		if (pil==1) menu();
		else if(pil==2) pesanan();
		else if(pil==3) kembalian();
		
	}

	private static void menu(){
		System.out.println("===============================");
		System.out.println("         MENU DAN HARGA   ");
		System.out.println("===============================");
		System.out.println("1. Nasi Goreng Rp.10000");
		System.out.println("2. Mie bakso Rp.9000");
		System.out.println("3. Batagor Rp.8000");
	}

	private static void pesanan(){
		Scanner in=new Scanner(System.in);
		Scanner ins=new Scanner(System.in);

		String a[]=new String[100];
		int b[]=new int[100];
		int c[]=new int[100];
		

		int n, harga;
		System.out.println("===============================");
		System.out.println("        Pemesanan   ");
		System.out.println("===============================");
		System.out.println("1. Nasi Goreng Rp.10000");
		System.out.println("2. Mie bakso Rp.9000");
		System.out.println("3. Batagor Rp.8000");
		System.out.println("Masukan jumlah pesanan: ");
		n=in.nextInt();


		harga=0;
		for (int z=0;z<n;z++){
			System.out.print("Masukan nama makanan ke-"+(z+1)+" :");
			a[z]=ins.nextLine();
			System.out.print("Masukan harga makanan ke-"+(z+1)+" :");
			b[z]=in.nextInt();
			System.out.print("Masukan jumlah makanan ke-"+(z+1)+" :");
			c[z]=in.nextInt();
			harga=harga+b[z]*c[z];
		}

		for (int z=0;z<n;z++){
			System.out.println("Makanan yang dipesan- ke-"+(z+1)+" adalah :"+a[z]);	
			System.out.println("Harga yang dipesan ke-"+(z+1)+" adalah :"+b[z]);	
		}
		System.out.println("Harga total yang harus dibayar Rp."+harga);

	}

		private static void kembalian(){
			int y,x;
			Scanner in=new Scanner(System.in);
			System.out.println("===============================");
			System.out.println("        Kembalian   ");
			System.out.println("===============================");
			System.out.print("Masukan Uang anda (Rp) : ");
			x=in.nextInt();
			System.out.print("Masukan Harga yang harus dibayar anda (Rp) : ");
			y=in.nextInt();
			System.out.print("Kembalian anda Rp."+(x-y)+",- \n Terimakasih sudah berbelanja.");
		}


}