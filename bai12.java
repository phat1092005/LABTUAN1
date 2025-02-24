package bai12;
import java.util.Scanner;
public class bai12{
	public static void main(String[]args){
		Scanner z = new Scanner(System.in);
		System.out.println("Nhap so: ");
		int x = z.nextInt();
		if (dao(x) == x) {
			System.out.println(x +" la so doi xung.");
		} else {
			System.out.println(x +" khong phai la so doi xung.");
		}
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