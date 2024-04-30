public class CalatoriB extends Calatori{
	private boolean geamuri=true;
	
	public CalatoriB() {
		super(50,400);
	}
	
	public void geamuriInchise() {
		if(geamuri) {
			geamuri=false;
			System.out.println("Geamuri blocate");
		}
		else {
			geamuri=true;
			System.out.println("Geamuri deblocate");
		}
	}
	
}