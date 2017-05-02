public class soal2 {
	public static void swap(int data[], i, j, temp;){
		temp=data[i];
		data[i]=data[j];
		data[j]=temp;
	}
	
	public static void bubble(data[], i, j, temp;){
		for(int i=1; i<=data.length; i++)
			for(int j=data.length-1; j>=i-1; j--)
				if(data[j-1]>data[j])
					swap(data, j-1,j);
	}
	public static void main (String [] args){
	int [] data ={3,2,1,4,6,5}
	
	for(int a: data)
	{
		System.out.print(a+" ");
	}
	
	bubble(data)
	
	for(int a: data)
	{
		System.out.print(a+" ");
	}
	
	}
}