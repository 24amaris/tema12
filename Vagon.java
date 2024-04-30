public abstract class Vagon {
	
	private int pasageri;
	private int colete;
	
	public Vagon(int pasageri, int colete) {
		this.pasageri = pasageri;
		this.colete = colete;
	}

	public int getPasageri() {
		return pasageri;
	}
	
	public int getColete() {
		return colete;
	}
	
	public String toString() {
		return "Pasageri: "+this.pasageri+", Colete: "+this.colete;
	}
	
}