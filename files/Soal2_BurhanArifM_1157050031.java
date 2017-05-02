import java.util.*;

public class Soal2_BurhanArifM_1157050031 {
    static Scanner input = new Scanner(System.in);
    public static void main(String args[]) {
        System.out.print("\nInput banyak angka : ");int n = input.nextInt();
        int room[] = new int[n];
        System.out.print("Input barisan angka : ");
        for(int i=0;i<n;i++)
            room[i]=input.nextInt();
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                if(room[j]<room[i]) {
                    int swap = room[i];
                    room[i] = room[j];
                    room[j] = swap;
                }
        System.out.print("Output barisan angka : ");
        for(int i=0;i<n;i++)
            System.out.print(room[i]+" ");
    }
}