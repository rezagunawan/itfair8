import java.util.*;
//toko
public class Final1_BurhanArifM_1157050031 {
    static Scanner input = new Scanner(System.in);
    static String menu[] = new String[1000];
    static int harga[] = new int[1000];
    static int buy[] = new int[50];
    static int cost[] = new int[50];
    static int tcost,tbuy,cash,change,id_max = 0;;
    public static void main(String args[]) {
        int a;
        do {
            System.out.print("\nMenu Program : ");
            System.out.print("\n[1] Input menu");
            System.out.print("\n[2] Transaksi Kasir");
            System.out.print("\n[0] Keluar");
            System.out.print("\n\nPilihan menu : ");a = input.nextInt();
            if(a!=0)
                switch(a) {
                    case 1 : input_menu();break;
                    case 2 : transaksi();break;
                    default : System.out.println("\nTidak ada pilihan tersebut");
                }
        } while((a!=0));
        System.out.print("\nTerimakasih telah menggunakan program ini :)");  
    }
    static void input_menu() {
        char lagi;
        boolean found = false;
        do {
            System.out.print("\nNama Menu : ");String food = input.next();
            for(int j=0;j<=id_max;j++)
                if(food.equals(menu[j])){
                    found = true;
                    break;
                }
            if(found)
                System.out.println("Menu Tersebut telah ada");
            else {
                menu[id_max] = food;
                System.out.print("Harga menu : ");harga[id_max] = input.nextInt();
                id_max++;
            }
            System.out.print("Ada lagi? (Y/T) : ");lagi = input.next().charAt(0);
        } while(lagi!='t');
    }
    static void transaksi() {
        char lagi;
        int n = 0;
        System.out.println("\nDaftar Menu: ");
        for(int i=0;i<id_max;i++)
            System.out.println((i+1)+". "+menu[i]+" : Rp"+harga[i]);
        do {
            System.out.print("\nMenu Pilihan : ");int a = input.nextInt();
            System.out.println("Menu Pilihan anda : "+menu[a-1]+" harga Rp"+harga[a-1]);
            System.out.print("Jumlah Pembelian : ");buy[n] = input.nextInt();
            cost[n] = buy[n] * harga[a-1];
            n++;
            System.out.print("Ada lagi? (Y/T) : ");lagi = input.next().charAt(0);
        } while(lagi!='t');
        for(int i=0;i<n;i++)
            tcost = tcost + cost[i];
        System.out.println("\nTotal Pembayaran Anda : "+tcost);
        do {
            System.out.print("Bayar : Rp");cash = input.nextInt();
            change = cash - tcost;
            if(change<0)
                System.out.println("Uang Anda kurang");
        } while(change<0);
        System.out.println("Kembali : Rp"+change);
    }
}