import java.util.*;

public class Soal1_BurhanArifM_1157050031 {
    static Scanner input = new Scanner(System.in);
    public static void main(String args[]) {
        System.out.print("\nMasukkan Angka : ");int a = input.nextInt();
        System.out.print("Output : "+a+"adalah bilangan ");
        if(a==0)
            System.out.print("Nol.");
        else if(a>0) 
            if(a%2==0)
                System.out.print("genap positif.");
            else
                System.out.print("ganjil positif.");    
        else 
            if(a%2==0)
                System.out.print("genap negatif.");
            else
                System.out.print("ganjil negatif.");
    }
}