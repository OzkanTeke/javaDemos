package abstractClasses;

public abstract class GameCalculator {
	public abstract void hesapla();
	
	public final void gameOver() { //de�i�tirilemez
		System.out.println("Oyun bitti.");
	}

}
