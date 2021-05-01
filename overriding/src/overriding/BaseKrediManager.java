package overriding;

public class BaseKrediManager {
	public double hesapla(double tutar) {  //final ile yazılırsa override edilemez
		return tutar * 1.18;
	}

}
