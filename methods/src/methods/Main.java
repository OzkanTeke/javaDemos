package methods;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
		
	}
	
	public static void sayiBulmaca() {
		int[] sayilar = new int[] {1,2,5,7,9,0};
		int aranacak = 5;
		boolean varMý = false;
		int index = 0;
		
		
		for(int i = 0; i < sayilar.length; i++) {
			if(sayilar[i] == aranacak) {
				varMý = true;
				index = i;
				break;
			}
		}
		
		if(varMý == true) {
			mesajVer(aranacak, index);
		}else {
			System.out.println("Sayý yoktur.");
		}
	}
	
	public static void mesajVer (int aranacak, int index) {
		System.out.println("Sayý vardýr: " + aranacak + " " + index + ". sýradadýr.");
	}

}
