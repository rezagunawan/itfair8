import java.util.*;

public class Soal7_BurhanArifM_1157050031 {
    static Scanner input = new Scanner(System.in);
    public static void main(String args[]) {
        System.out.print("\nMasukkan jumlah Angka : ");int a = input.nextInt();
        System.out.print("output bilangan : ");
        int i = 1,b=0;
        while(i<=a) {
            if(b%2==1) {
                System.out.print(b+" ");
                i++;
            }
            b++;
        }
    }
}