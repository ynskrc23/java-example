import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


class Araba {
	public String plaka;
	public String marka;
	public String model;
	
	public Araba(String plakaNo, String markaNo,String modelNo) {
		plaka = plakaNo;
		marka = markaNo;
		model = modelNo;
	}
	
	public String getPlaka() {
		return plaka;
	}
	
	public void setPlaka(String plaka) {
		this.plaka = plaka;
	}
	
	public String getMarka() {
		return marka;
	}
	
	public void setMarka(String marka) {
		this.marka = marka;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void tanýt() {
		System.out.println("Plakam: "+getPlaka());
		System.out.println("Marka: "+getMarka());
		System.out.println("Model: "+getModel());
	}
}

public class Javaders6 {
	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		Araba detay;
		
		System.out.print("Aracýn Plakasýný Giriniz:");
		String a_plaka = giris.nextLine();
		
		System.out.print("Aracýn Markasýný Giriniz:");
		String a_marka = giris.nextLine();
		
		System.out.print("Aracýn Modelini Giriniz:");
		String a_model = giris.nextLine();
		
		System.out.println("------------------------------------");
		
		detay = new Araba(a_plaka,a_marka,a_model);
		detay.tanýt();
	}	
}