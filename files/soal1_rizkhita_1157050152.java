import java.util.Scanner;
public class soal1
{
public static void main(String []args)
{
	int a;
	Scanner in = new Scanner(System.in);
	System.out.print("angka :");
	a = in.nextInt();
	
	if(a>0)&&(a % 2=0 ){
	System.out.print("Genap positif");
	}
	else if (a<0)&&(a %2=0 ){
	System.out.print("anjil positif");
	}
	else if (a==0){
	System.out.print("nol");
	}
	else if (a>0) && (a % 3=0 ){
	System.out.print("Ganjil postif");
	}
	else if(a<0) && (a % 3=0){
	System.out.print ("Ganjil negatif")	
	}
}
}
	
	
	
