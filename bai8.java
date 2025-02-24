package bai8;
import java.util.Scanner;
public class bai8{
	public static void main(String[]args){
		Scanner z = new Scanner(System.in);
		System.out.println("Nhap so: ");
		int x = z.nextInt();
		System.out.println("Chu so dau tien la " + dau(x));
		System.out.println("Chu cuoi cung la " + cuoi(x));
}	
	public static int dau(int x) {
		while (x >= 10) x /= 10;
		return x;
	}
	public static int cuoi(int x) {
		return x % 10;
	}
}