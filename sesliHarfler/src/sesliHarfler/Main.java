package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		char harf = 'y';
		
		switch (harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
		case 'a':
		case '�':
		case 'o':
		case 'u':
			System.out.println("Kal�n sesli harf");
			break;
		case 'E':
		case '�':
		case '�':
		case '�':
		case 'e':
		case 'i':
		case '�':
		case '�':
			System.out.println("�nce sesli harf");
			break;
			default:
				System.out.println("Sessiz harf");
		}

	}

}
