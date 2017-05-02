import java.util.Scanner;
public class soal2{
	public static void main(String[] args) {
	




	int a[]={3,2,1,4,6,5};

	System.out.print("Input: ");
	for (int i=0;i<a.length;i++){
		System.out.print(a[i]+" ");
	}

	for (int i=1;i<a.length;i++){
		for (int j=0;j<a.length-1;j++){
			if(a[j+1]<a[j]){
				int tmp=a[j+1];
				a[j+1]=a[j];
				a[j]=tmp;
			}
		}
	}

	System.out.print("\nOutput: ");
	for (int i=0;i<a.length;i++){
		System.out.print(a[i]+" ");
	}

}
}