package bai3;
import java.util.Scanner;
public class bai3{
	public static void main(String[]args){
		Scanner z = new Scanner(System.in);
		System.out.println("Nhap do F: ");
		double f = z.nextDouble();
		double c = (f-32)/1.8;
		System.out.println("Do C la:"+ c);
	}
}