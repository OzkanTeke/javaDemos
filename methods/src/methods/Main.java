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
		boolean varM� = false;
		int index = 0;
		
		
		for(int i = 0; i < sayilar.length; i++) {
			if(sayilar[i] == aranacak) {
				varM� = true;
				index = i;
				break;
			}
		}
		
		if(varM� == true) {
			mesajVer(aranacak, index);
		}else {
			System.out.println("Say� yoktur.");
		}
	}
	
	public static void mesajVer (int aranacak, int index) {
		System.out.println("Say� vard�r: " + aranacak + " " + index + ". s�radad�r.");
	}

}
