package javadersleri;

/**
 *
 * @author Karaca
 */
public class JavaArray {
    public static int dizi_topla(int [] x,int n) {
		int i,toplam = 0;
		for(i=0;i<5;i++) {
			toplam = toplam + x[i];
		}
		return toplam;
	}
	
	public static void main(String[] args) {
		System.out.println("Twins Software");
		int[] dizi = {2,5,8,3,9};
		int topla = dizi_topla(dizi,5);
		System.out.println("Dizi toplamı: " + topla);
		
		int [] number = new int [3];
		number[0] = 10;
		number[1] = 14;
		number[2] = 23;
		
		for(int m=0; m<number.length; m++) {
			int value = number[m];
			System.out.print(value + "-");
		}
		
		System.out.println();
		
		String [] car = new String [3];
		car[0] = "BMW";
		car[1] = "OPEL";
		car[2] = "HONDA";
		
		for(int c=0; c<car.length; c++) {
			String value = car[c];
			System.out.print(value + "-");
		}
		
		System.out.println();
		
		char [] letter = new char [6];
		letter[0] = 'j';
		letter[1] = 'q';
		letter[2] = 'u';
		letter[3] = 'e';
		letter[4] = 'r';
		letter[5] = 'y';
		
		// bu kullanım for-each yapısı gibi'dir.
		for(char value : letter) {
			System.out.print(value + "-");
		}
	}
}
