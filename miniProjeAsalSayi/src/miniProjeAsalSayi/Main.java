package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		int number = 13;
		int remainder = number % 2;
		System.out.println(remainder);
		//boolean isPrime = true;
		
		if(number == 1) {
			System.out.println("Say� asal de�ildir.");
			return;
		}
		
		if(number < 1) {
			System.out.println("Ge�ersiz say�.");
			return;
		}
		
		int j = 0;
		for (int i = 2; i < number; i++) {
			if(number % i == 0) {
				j = j + 1;                           //isPrime = false;
			}
		}
		
		if(j == 0) {                                //if (isPrime == true)
			System.out.println("Say� asald�r.");
		}else {
			System.out.println("Say� asal de�ildir.");
		}
	


	}

}
