package bai11;
import java.util.Scanner;
public class bai11{
	public static void main(String[]args){
		Scanner z = new Scanner(System.in);
		System.out.println("Nhap so: ");
		int x = z.nextInt();
		System.out.println("So duoc dao nguoc la "  + dao(x));
	}
	public static int dao(int x) {
		int dao = 0;
		while (x > 0) {
			dao = dao * 10 + x %10;
			x /= 10;
		}
		return dao;
	}
}