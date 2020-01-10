import java.io.*;
import java.util.Scanner;

public class Javaders1 {
	
	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		
		int a, b, c, d, random;	
		
		System.out.print("Birinci deger giriniz:");
		a = giris.nextInt();
		
		System.out.print("Ikinci deger giriniz:");
		b = giris.nextInt();
		
		random = (int) (Math.random()* 10);
		
		if (a == random || b == random) {
			System.out.println("Eslesme saglandi");
		}
		else {
			System.out.println("Tekrar deneyiniz");
		}
		
		System.out.println("------------------------------");
		
		c = Math.max(a, b);
		System.out.println("MAX sayi:"+c);
		
		System.out.println("Random sayi:"+random);
		
		System.out.println("------------------------------");
		
		System.out.print("Dongu deger giriniz:");
		d = giris.nextInt();
		
		for(int i=0; i<=d; i++) {
			System.out.println("Selamun Aleykün Baba");
		}
		
	}
	
}