package bai9;
import java.util.Scanner;
public class bai9{
	public static void main(String[]args){
		Scanner z = new Scanner(System.in);
		System.out.println("Nhap so: ");
		int x = z.nextInt();
		System.out.println("Tong cac chu so la " + tong(x));
		System.out.println("Tich cac chu so la " + tich(x));
}	
	public static int tong(int x) {
		int tong = 0;
		while (x > 0) {
			tong += x % 10;
			x /= 10;
		}
		return tong;
	}
	public static int tich(int x) {
		int tich = 1;
		while (x > 0) {
			tich *= x % 10;
			x /= 10;
		}
		return tich;
	}
}