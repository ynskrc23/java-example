import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Javaders3 {
	static Scanner veri = new Scanner(System.in);
	
	public static void main(String[] args) {	
		System.out.print("Lütfen yaþýnýzý giriniz:");
		int yas = yasKontrol();
		if(yas != 0) {
			System.out.println(yas+ " yaþýndasýnýz");
		}
	}
	
	public static int yasKontrol() {
		try {
			return veri.nextInt();
		}
		catch(InputMismatchException e){
			veri.next();
			System.out.println("Tam sayý giriniz");
			return 0;
		}
	}
	
}