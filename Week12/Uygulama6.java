import java.util.Arrays;

public class cevaplar{
	public static void main(String[] args){
		int x = 0;
		int[] arr = new int[4];
		x = x + 1;
		mystersy(x, arr);
		System.out.println(x + " " + Arrays.toString(arr));
		x = x + 1;
		mystery(x, arr);
		System.out.println(x + " " + Arrays.toString(arr));
	}
	public static void mystersy(String[] args){
		x = x+1;
		arr[x] = arr[x] + 1;
		System.out.println(x + " " + Arrays.toString(arr));
	}
}