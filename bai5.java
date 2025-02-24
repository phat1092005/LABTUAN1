package bai5;
import java.util.Scanner;
public class bai5{
	public static void main(String[]args){
		Scanner t = new Scanner(System.in);
		System.out.println("Nhap ba so: ");
		int x = t.nextInt();
		int y = t.nextInt();
		int z = t.nextInt();
		int min = x;
		if (y < min) y = min;
		if (z < min) z = min;
		System.out.println("So be nhat trong ba so la: "+ min);
	}
}