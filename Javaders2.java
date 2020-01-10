import java.io.*;
import java.util.Scanner;

public class Javaders2 {
	static int randomSayi; 
	static Scanner veri = new Scanner(System.in);
	
	public static void main(String[] args) {	
		randomGetir();
		int tahminSonucu = 1;
		int randomTahmin = 0;
		
		while(tahminSonucu != -1) {
			System.out.println("0 ile 10 arasýnda sayý tahmin et:");
			randomTahmin = veri.nextInt();
			tahminSonucu = tahminEt(randomTahmin);
		}
		System.out.println("Dogru tahmin: "+randomTahmin);
		
		System.out.println("------------------------------------");
		int total = totalLength("yunus","cihangir");
		System.out.println("Total:"+total);
		
		int ortalama = ortalama("mucahit", "emre");
		System.out.print("Ortalama:"+ortalama);
	}
	
	public static int randomGetir() {
		randomSayi = (int) (Math.random() * 10 );
		return randomSayi;
	}
	
	public static int tahminEt(int tahmin) {
		if (tahmin == randomSayi) {
			return -1;
		}
		else {
			return tahmin;
		}
	}
	
	static int totalLength(String a, String b) {
		return a.length() + b.length();
	}
	
	static int ortalama(String a, String b) {
		return totalLength(a, b) / 2;
	}
	
}