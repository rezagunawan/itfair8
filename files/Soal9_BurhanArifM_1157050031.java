import java.util.*;

public class Soal9_BurhanArifM_1157050031 {
    static Scanner input = new Scanner(System.in);
    public static void main(String args[]) {
        System.out.print("\nAnak Ayam Turun ");int a = input.nextInt();
        for(int i = 1;i<=a;a--) {
            if(a!=1)
                System.out.println("Anak ayam turun "+a+", mati satu tinggal"+(a-1));
            else
                System.out.println("Anak ayam turun 1, mati satu tinggal induknya");    
    }
}