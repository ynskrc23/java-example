package javadersleri;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Karaca
 */
public class JavaLoop {
	public static void main(String[] args) {
		
		Scanner giris = new Scanner(System.in);
		System.out.println("Merhaba Elbistan Halkı");
		
		System.out.println("---------------------------");
		
		int yas = 0;
		yas = yas + 7;
		System.out.println("yaşınız : " + yas);
		
		int a, b;
		a = 10;
		b = (a == 1) ? 20: 30;
		System.out.println( "b’nin değeri : " + b );
		
		b = (a == 10) ? 20: 30;
		System.out.println( "b’nin değeri : " + b );
		
		System.out.println("---------------------------");
		
		System.out.print("seçim yapınız (1-2-3): ");
		int secim = giris.nextInt();
		
		if(secim == 1) {
			System.out.println("galatasaray - fenerbahçe");
		}
		else if(secim == 2) {
			System.out.println("trabzonspor - beşiktaş");
		}
		else if(secim == 3) {
			System.out.println("bursaspor - başakşehir");
		}
		else 
			System.out.println("hatalı seçim yaptınız");
		
		System.out.println("---------------------------");
		
		String cumle = "sali gunu odev var";
		System.out.println(cumle);
		System.out.println("charAt(0) : " + cumle.charAt(0));
		System.out.println("substring(0,5) : " + cumle.substring(0,5));
		System.out.println("cumle uzunluk : " + cumle.length());
		System.out.println(cumle.startsWith("s"));
		System.out.println(cumle.endsWith("m"));
		
		System.out.println("---------------------------");
		
		int tahmin,sayi,puan = 0,kalan = 3;
		Random r = new Random(); 
		sayi = r.nextInt(5);
		System.out.println("sayi giriniz(0-5) : ");
		tahmin = giris.nextInt();
		
		while(kalan>0) {
			if(tahmin == sayi) {
				puan = puan + tahmin;
			}
			else {
				kalan--;
			}
			tahmin = giris.nextInt();
		} 
		System.out.println("Puanınız: " + puan);
	}
}
