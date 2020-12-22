
public class MainStudenti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		Studente Harry = new Studente ("Harry", "Potter", 22, 24, 29);
//		Studente Ron = new Studente ("Ron", "Wesley", 22, 24, 23);
//		Studente Hermione = new Studente ("Hermione", "Granger", 28, 29, 28);
//		
		
//		Harry.identita();
//		Harry.calcoloMedia();
//		
//		Ron.identita();
//		Ron.calcoloMedia();
//		
//		Hermione.identita();
//		Hermione.calcoloMedia();
		
		
		Studente Harry = new Studente ();
		Studente Ron = new Studente ();
		Studente Hermione = new Studente ();
		
		
		
		
		Harry.setNome("Harry");
		Ron.setNome("Ronald");
		Hermione.setNome("Hermione");
		
		Harry.setCognome("Potter");
		Ron.setCognome("Wisley");
		Hermione.setCognome("Granger");
		
		Harry.setAnalisi(26);
		Ron.setAnalisi(21);
		Hermione.setAnalisi(29);
		
		Harry.setFisica(25);
		Ron.setFisica(22);
		Hermione.setFisica(29);
		
		
		Harry.setInformatica(27);
		Ron.setInformatica(23);
		Hermione.setInformatica(30);
		
		
		
	
		String Nome_Harry = Harry.getNome();
			System.out.print(Nome_Harry);
			
		String Cognome_Harry = Harry.getCognome ();
		System.out.println(" " + Cognome_Harry);
		Harry.identita();
		Harry.calcoloMedia();
		
	}

}
