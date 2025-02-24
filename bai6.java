package bai6;
import java.util.Scanner;
public class bai6{
	public static void main(String[]args){
		Scanner t = new Scanner(System.in);
		System.out.println("Nhap ba canh: ");
		int x = t.nextInt();
		int y = t.nextInt();
		int z = t.nextInt();
		if ((x + y > z) && (x + z > y) && (y + z > x)) {
			System.out.println("Day la hinh tam giac.");
		} else {
			System.out.println("Day khong phai la hinh tam giac.");
		}
	}
}