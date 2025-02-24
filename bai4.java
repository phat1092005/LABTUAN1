package bai4;
import java.util.Scanner;
public class bai4{
	public static void main(String[]args){
		Scanner z = new Scanner(System.in);
		System.out.println("Nhap nam: ");
		int y = z.nextInt();
		if((y % 4 == 0 && y % 100 !=0 )|| (y % 400 ==0)){
		System.out.println(y +" la nam nhuan.");
		} else { 
		System.out.println(y +" khong la nam nhuan.");
		}	
	}
}