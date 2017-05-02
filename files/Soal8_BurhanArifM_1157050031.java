import java.util.*;

public class Soal8_BurhanArifM_1157050031 {
    static Scanner input = new Scanner(System.in);
    public static void main(String args[]) {
        System.out.print("\nMasukkan jumlah Angka : ");int a = input.nextInt();
        System.out.print("output bilangan : ");
        int i = 1,b=1;
        while(i<=a) {
            if(b%2==0) {
                System.out.print(b+" ");
                i++;
            }
            b++;
        }
    }
}