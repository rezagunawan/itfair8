import java.util.Scanner;
public class kasus2{
	public static void main(String args[]){
		int i, j;
		for(i=0;i<7;i++){
			for(j=0;j<11;j++){
				if(i==0||i==3||i==6||j==0||j==5||j==10||(i==1&&j==1)||(i==2&&j==4)||(i==5&&j==1)||(i==4&&j==4)||(i==2&&j==6)||(i==1&&j==9)||(i==4&&j==6)||(i==1&&j==9)){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}