import java.util.*;

public class Soal3_BurhanArifM_1157050031 {
    static Scanner input = new Scanner(System.in);
    public static void main(String args[]) {
        System.out.print("\nInput banyak angka : ");int n = input.nextInt();
        int room[] = new int[n];
        System.out.print("Input barisan angka : ");
        for(int i=0;i<n;i++)
            room[i]=input.nextInt();
        System.out.print("Input angka yang dicari: ");int a = input.nextInt();
        int b = 0;
        for(int i=0;i<n;i++)
            if(room[i]==a) {
                b = i;
                break;
            }
        System.out.print("Output : Bilangan "+a+" ada di indeks ke-"+b);         
    }
}