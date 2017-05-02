import java.util.Scanner;
public class kasus1{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int kode, menu, harga, jumlah, total, bayar, kembali;
		String makan = "";
		harga = 0;
		do{
			System.out.println("RUMAH MAKAN ANGIN RIBUT");
			System.out.println("-----------------------");
			System.out.println("MENU & HARGA");
			System.out.println("1. Nasi Goreng - Rp. 10.000");
			System.out.println("2. Nasi Uduk - Rp. 8.000");
			System.out.println("3. Nasi Kuning - Rp. 9.000");
			System.out.println("4. Nasi Kebuli - Rp. 12.000");
			System.out.print("Masukkan Pilihan : ");
			menu = in.nextInt();
			switch(menu){
				case 1 :{
					makan = "Nasi Goreng";
					harga = 10000;
					break;
				}
				case 2 :{
					makan = "Nasi Uduk";
					harga = 8000;
					break;
				}
				case 3 :{
					makan = "Nasi Kuning";
					harga = 9000;
					break;
				}
				case 4 :{
					makan = "Nasi Kebuli";
					harga = 12000;
					break;
				}
			}
			System.out.println();
			System.out.println("Anda memilih "+makan+" dengan harga Rp. "+harga);
			System.out.print("Masukkan jumlah yang dibeli : ");
			jumlah = in.nextInt();
			total = harga * jumlah;
			System.out.println();
			System.out.println(jumlah+" Paket "+makan+" = Rp. "+total);
			System.out.print("Masukkan Pembayaran : ");
			bayar = in.nextInt();
			System.out.println();
			System.out.println("Anda membayar Rp. "+bayar);
			if(bayar==total){
				kembali = 0;
			}
			else{
				kembali = bayar-total;
			}
			System.out.println("Kembalian Rp. "+kembali);
			System.out.println();
			System.out.println("----------------------------------");
			System.out.println("----------NOTA PEMBAYARAN---------");
			System.out.println("----------------------------------");
			System.out.println(jumlah+" Paket "+makan);
			System.out.println(jumlah+" x "+harga+" = Rp. "+total+"\n\n");
			System.out.println("----------------------");
			System.out.println("Total  = Rp. "+total+"\n");
			System.out.println("Pembayaran = Rp. "+bayar);
			System.out.println("Kembalian = Rp. "+kembali);
			System.out.println("---------------------------------");
			System.out.println("---A/n RUMAH MAKAN ANGIN RIBUT---");
			System.out.println("----MENGUCAPKAN TERIMA KASIH-----");
			System.out.println("---------------------------------");
			System.out.println("\n1. Transaksi lagi");
			System.out.println("0. Keluar");
			System.out.println("Masukkan pilihan : ");
			kode = in.nextInt();
		}
		while(kode==1);
	}
}