public class Cladire extends Proprietate {

	public Cladire(String strada,String numar, int suprafata) {
		super(strada,numar,suprafata,500);
	}
	public int getCostTaxa() {
		return getCost();
	}
}