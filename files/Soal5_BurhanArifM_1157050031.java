import java.util.*;

public class Soal5_BurhanArifM_1157050031 {
    static Scanner input = new Scanner(System.in);
    public static void main(String args[]) {
        System.out.print("\nInput banyak angka : ");int n = input.nextInt();
        int room[] = new int[n];
        for(int i=0;i<n;i++) {
            System.out.print("Input bilangan ke-"+(i+1)+" : ");
            room[i]=input.nextInt();
        }
        int jumlah = 0;
        System.out.print("Output : rerata -> ");
        for(int i=0;i<n;i++){
             jumlah = jumlah + room[i];
             if(i<n-1)
                System.out.print("+");
             else
                System.out.print("/"+n+"=");
        }
        System.out.print(jumlah/n);
           
    }
}