package overriding;

public class BaseKrediManager {
	public double hesapla(double tutar) {  //final ile yaz�l�rsa override edilemez
		return tutar * 1.18;
	}

}
