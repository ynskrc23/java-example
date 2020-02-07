package javadersleri;

import java.util.*;
import java.util.Scanner;

/**
 *
 * @author Karaca
 */

public class JavaMetot {
	public int topla(int s1, int s2) {
		return s1 + s2;
	}
	
	public int cikar(int s1, int s2) {
		return s1 - s2;
	}
	
	public int carp(int s1, int s2) {
		return s1 * s2;
	}
	
	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		JavaMetot nesne = new JavaMetot();
		
		int a1,a2,sonuc = 0;
		System.out.print("1-Toplama"
				+ " 2-Cıkarma"
				+ " 3-Carpma"
				+ "\nLutfen seçim yapınız:");
		int secim = giris.nextInt();
		
		if(secim == 1) {
			System.out.print("birinci sayi: ");
			a1 = giris.nextInt();
			System.out.print("ikinci sayi: ");
			a2 = giris.nextInt();
			sonuc = nesne.topla(a1,a2);
			System.out.println("Sonuc: " + sonuc);
		}
		else if(secim == 2) {
			System.out.print("birinci sayi: ");
			a1 = giris.nextInt();
			System.out.print("ikinci sayi: ");
			a2 = giris.nextInt();
			sonuc = nesne.cikar(a1,a2);
			System.out.println("Sonuc: " + sonuc);
		} 
		else if(secim == 3) {
			System.out.print("birinci sayi: ");
			a1 = giris.nextInt();
			System.out.print("ikinci sayi: ");
			a2 = giris.nextInt();
			sonuc = nesne.carp(a1,a2);
			System.out.println("Sonuc: " + sonuc);
		} 
		else
			System.out.println("Hatalı seçim");
		
		System.out.println("Karekok: " + Math.sqrt(sonuc));
	}
}
