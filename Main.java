public class Main {
    public static void main(String[] args) {

		Tren t1 = new Tren("123");
		Vagon a = new CalatoriA();
		Vagon b = new CalatoriB();
		Vagon x = new Marfa();
		t1.addVagon(a);
		t1.addVagon(b);
		
		Tren t2 = new Tren("321");
		t2.addVagon(a);
		t2.addVagon(b);
		t2.addVagon(x);

		System.out.println(t1.equals(t2));
		
		System.out.println(t1.tipuriDeVagoane());
		((CalatoriB)b).geamuriInchise();
	}
}
