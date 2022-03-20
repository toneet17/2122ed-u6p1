package ed.antoni;

public class Institut {

	public static void main(String[] args) {
		
		Alumne p = new Alumne();
		
		p.nom = "Antoni";
		p.cognoms = "Medina";
		p.cicleFormatiu = "1º DAM";
		p.any = 2022;
		
		System.out.println(p.toString());

	}

}
