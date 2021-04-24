package arkadasSayilar;

public class Main {

	public static void main(String[] args) {
		
		int number1 = 220;
		int number2 = 284;
		
		int a = 0;
		for (int i = 1; i < number1; i++) {
			if(number1 % i == 0) {
				a = a + i;
			}
		}
		int b = 0;
		for (int i = 1; i < number2; i++) {
			if(number2 % i == 0) {
				b = b + i;
			}
		}
		
		if(number1 == b && number2 == a) {  // || or işareti
			System.out.println("Sayılar arkadaştır.");
		}else {
			System.out.println("Sayılar arkadaş değildir.");
		}

	}

}
