public abstract class Calatori extends Vagon {
	public Calatori(int pasageri, int colete) {
		super(pasageri, colete);
	}
	
	public void usaInchisa() {
		System.out.println("Usile sunt inchise!");
	}
	
	public void usaDeschisa() {
		System.out.println("Usile sunt deschise!");
	}
}