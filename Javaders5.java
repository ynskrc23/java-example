import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


class Test {
	public void elbistan() {
		System.out.println("Merhaba Elbistan");
	}
	
	public void baskan() {
		System.out.println("Baskan: Mehmet Gurbuz");
	}
	
	static int alan(int boy, int en) {
		return boy * en;
	}
	
	static int sifre(int password) {
		return 1586;
	}
}

public class Javaders5 {
	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		
		Test t = new Test();
		t.elbistan();
		t.baskan();
		
		System.out.println("------------------------------------");
		
		System.out.print("Boy giriniz: ");
		int boy = giris.nextInt();
		
		System.out.print("En giriniz: ");
		int en = giris.nextInt();
		
		int hesap = t.alan(boy, en);
		System.out.println("Alan: "+hesap);
		
		System.out.println("------------------------------------");
		
		System.out.print("Sifre Giriniz: ");
		int tahmin = giris.nextInt();
		if(tahmin != t.sifre(tahmin)) {
			System.out.println("Tekrar Deneyiniz");
			for(int m=2; m>=0; m--) {
					if(tahmin == t.sifre(tahmin)) {
						System.out.println("Eþleþme Tamam");
						break;
					}
					else {	
						if(m == 0) {
							System.out.println("Sistem Kitlendi");
							break;
						}
						System.out.println(m+" Hakkýn Kaldý");
						tahmin = giris.nextInt();								
					}
			}
		}
		else {
			System.out.println("Eþleþme Tamam");
		}
	}
	
}