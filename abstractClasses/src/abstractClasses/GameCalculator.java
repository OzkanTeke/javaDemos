package abstractClasses;

public abstract class GameCalculator {
	public abstract void hesapla();
	
	public final void gameOver() { //değiştirilemez
		System.out.println("Oyun bitti.");
	}

}
