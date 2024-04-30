public class Teren extends Proprietate {
	private Rang rangTeren;

	public Teren(String strada, String numar, int suprafata, Rang rangTeren) {
		super(strada, numar, suprafata, 350);
		this.rangTeren = rangTeren;
	}

	public int getCostTaxa() {
		return getCost()/this.rangTeren.getRang();
	}
}