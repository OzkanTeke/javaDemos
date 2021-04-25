package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bug�n hava �ok guzel.";
		System.out.println(mesaj);
		
		System.out.println("Eleman say�s�: " + mesaj.length());
		System.out.println("5. eleman: " + mesaj.charAt(4));
		System.out.println(mesaj.concat(" Ya�as�n"));     //yeni bir string ol�turma
		System.out.println(mesaj.startsWith("A"));        //ne ile ba�lad���n� kontrol etme
		System.out.println(mesaj.endsWith("."));          //ne ile bitti�ini kontrol etme
		
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf('a'));      // karakter ya da string arama
		System.out.println(mesaj.lastIndexOf('e'));  // karakter ya da string aramaya sa�dan ba�lar
		
		String yeniMesaj =  mesaj.replace(' ', '-');
		System.out.println(yeniMesaj);
		
		System.out.println(mesaj.substring(2));
		System.out.println(mesaj.substring(2, 5));
		
		for (String kelime : mesaj.split(" ")) {    //string'i par�alayarak string arrayine �evirir
			System.out.println(kelime);
		}
		System.out.println(mesaj.split(" ")[1]);
		
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		
		System.out.println(mesaj.trim());  //varsa ba�taki ve sondaki bo�luklar� kald�r�r

	}

}
