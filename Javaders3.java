import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Javaders3 {
	static Scanner veri = new Scanner(System.in);
	
	public static void main(String[] args) {	
		System.out.print("L�tfen ya��n�z� giriniz:");
		int yas = yasKontrol();
		if(yas != 0) {
			System.out.println(yas+ " ya��ndas�n�z");
		}
	}
	
	public static int yasKontrol() {
		try {
			return veri.nextInt();
		}
		catch(InputMismatchException e){
			veri.next();
			System.out.println("Tam say� giriniz");
			return 0;
		}
	}
	
}