import java.util.*;

public class Soal4_BurhanArifM_1157050031 {
    static Scanner input = new Scanner(System.in);
    public static void main(String args[]) {
        System.out.print("\nInputkan harga : Rp");int n = input.nextInt();
        System.out.print("Output : ");
        if(n<50)
            System.out.print("Gratis");
        else {
            int b = n%100;
            n = n-b;
            System.out.print("Hasil Pembulatan Rp");
            if(b<50)
                System.out.print(n);
            else
                System.out.print(n+100);
        }
    }
}