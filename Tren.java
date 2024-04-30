import java.util.HashSet;
import java.util.LinkedList;

public class Tren {
	private LinkedList<Vagon> vagon_atasat;
	private String cod;

	public Tren(String cod) {
		this.vagon_atasat= new LinkedList<Vagon>();
		this.cod=cod;
	}

	public Tren(String cod,LinkedList<Vagon> vagoane_toAttach) {
		if(vagoane_toAttach.size()<=15) {
		this.vagon_atasat= vagoane_toAttach;
		}
		else {
			throw new IllegalArgumentException("Nu exista tren cu mai mult de 15 vagoane atasate!");
		}
		this.cod=cod;
	}
	
	public boolean addVagon(Vagon new_vagon) {
		if(this.vagon_atasat.size()<15) {	
			this.vagon_atasat.addLast(new_vagon);
			return true;
		}
		System.err.println("Nu se pot atasa mai mult de 15 vagoane!");
		return false;
	}
	
	public String toString() {
		String vagoane ="Trenul: "+this.cod+" cu Vagoanele:";
		int index=1;
		for(Vagon current_vagon : vagon_atasat) {
			
			vagoane+=" ["+index+"] "+current_vagon+" ";
			index++;
		}
		return vagoane;
	}
	
	public int sumOfColete() {
		int sum=0;
		for(Vagon current_vagon : vagon_atasat) {
			sum+=current_vagon.getColete();
		}
		return sum;
	}
	
	public boolean equals(Tren tren_toCompare) {
		if(this.sumOfColete()==tren_toCompare.sumOfColete())
			return true;
		return false;
	}
	
	public HashSet<String> tipuriDeVagoane() {
		HashSet<String> tipuri = new HashSet<String>();
		for(Vagon current_vagon : vagon_atasat) {
			tipuri.add(current_vagon.getClass().getTypeName());
		}
		return tipuri;
	}
	
	
}