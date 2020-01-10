import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Javaders4 {
	public static void main(String[] args) {
		/* 
		 	bu uygulamada dýþarýdan girilen deðer kadar 
			döngü oluþturulur ve o sayi aralýðýnda 
			random sayi üretilir 
		*/
		
		Scanner giris = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("Lutfen sayi giriniz: ");
		int deger = giris.nextInt();
		
		int sayi[] = new int[deger];
		
		for(int i=0; i<deger;i++) {
			sayi[i] = rand.nextInt(deger);
			System.out.println(sayi[i]);
		}
		
		System.out.println("------------------------------------");
		
		ArrayList<Integer> eleman = new ArrayList<>();	
		int ekle, toplam = 0;
		float ortalama, kok = 0;
		
		for(int m=0; m<3; m++) {
			System.out.print("Elemanlarý giriniz: ");
			ekle = giris.nextInt();
			eleman.add(ekle);
		}	
		
		System.out.println("------------------------------------");
		
		for(int j=0; j<eleman.size(); j++) {
			System.out.println(j+".Eleman: "+eleman.get(j));
			toplam = eleman.get(j) + toplam; 
		}
		
		System.out.println("------------------------------------");
		
		ortalama = (float)toplam / eleman.size();
		System.out.println("Ortalama: "+ortalama);
		
		System.out.println("------------------------------------");
		
		kok = (float) Math.sqrt(ortalama);
		System.out.println("Karekök: "+kok);
		
	}
	
}