package javadersleri;

import java.util.Scanner;

/**
 *
 * @author Karaca
 */

class Cat {
	int yas;
	String isim;
	String renk;
	String aclik;
	
	void eatFood(String foodVal) {
		this.aclik += foodVal;
	}
	
	/*
		void eatFood() anahtar kelimesi methodumuzun 
		herhangi bir değer döndürmeyeceğini belirtiyor. 
	*/
	
	/* 
		void eatFood(String foodVal), method içerisinde 
		kullanabilmek için String tipinde
		fooVal değişkenini parametre olarak belirtiyorum.
	*/
	
	/*
		this.hungry += foodVal; ,parametremden aldığım değeri 
		class içerisinde hungry değeri ile topluyorum.
	*/
	
	//constructor yapısı
	public Cat() {						
		this.isim = "veri yok";
		this.renk = "veri yok";
		this.yas = 0;
		this.aclik = "veri yok";
	}
	
	/*
		Constructor özel tanımlı methodlardır. 
		Bundan dolayı, bulunduğu class ile 
		aynı ismi taşımalıdır.
	*/
	
	//farklı constructor methodumuz
	public Cat(String isim, int yas) {
		this.isim = isim;
		this.yas = yas;
	}
}

class VanCat extends Cat{
	//Kalıtım yoluyla BlueRussiaCat nesnemizi oluşturduk
}

class BlueRussiaCat extends Cat{
	//Kalıtım yoluyla BlueRussiaCat nesnemizi oluşturduk
}


public class JavaOOP {
	public static void main(String[] args) {
		Cat cat1 = new Cat();
		
		cat1.isim = "Muhsin";
		cat1.renk = "Siyah";
		cat1.yas = 2;
		
		System.out.println("Kedinin ismi: " + cat1.isim + 
				"\nKedinin yaşı: " + cat1.yas + 
				"\nKedinin rengi: " + cat1.renk);
		
		cat1.aclik = "Var";
		System.out.println("Kedinin açlık durumu: " + cat1.aclik);
		
		System.out.println("----------------------------");
		
		//consturctor yapısı örneği 
		Cat cat2 = new Cat();
		cat2.isim = "Narçın";
		cat2.yas = 4;
		
		System.out.println("Kedinin ismi: " + cat2.isim + 
				"\nKedinin yaşı: " + cat2.yas + 
				"\nKedinin rengi: " + cat2.renk +
				"\nKedinin açlık durumu: " + cat2.aclik);
		
		System.out.println("----------------------------");
		
		//miras alma, kalıtım yapısı örneği
		VanCat cat4 = new VanCat();
		BlueRussiaCat cat5 = new BlueRussiaCat();
		cat4.isim = "Tarçın";
		cat5.renk = "Mavi";
		
		System.out.println("Kedinin ismi: " +cat4.isim +
				"\nKedinin rengi: " + cat5.renk);
		
	}
}
