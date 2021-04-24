package sayiBulma;

public class Main {

	public static void main(String[] args) {
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
			System.out.println("Sayý vardýr. " + index + ". sýradadýr.");
		}else {
			System.out.println("Sayý yoktur.");
		}

	}

}
