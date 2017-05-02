import java.util.*;

public class Soal6_BurhanArifM_1157050031 {
    static Scanner input = new Scanner(System.in);
    public static void main(String args[]) {
        System.out.print("\nInput banyak angka : ");int n = input.nextInt();
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++)
                System.out.print(j);
            System.out.print("\n");
        }
        for(int i=1;i<=n;n--) {
            for(int j=1;j<=n;j++)
                System.out.print(j);
            System.out.print("\n");
        }      
    }
}