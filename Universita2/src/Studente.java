
public class Studente {

		
		private String Nome;
		private String Cognome;
		private int voto_Analisi;
		private int voto_Fisica;
		private int voto_Informatica;
		private int media;
		private int voto_Inglese;
		
		
		Studente() {
			}
		
		public String getNome () {
			return Nome;
		}
		
		
		public void setNome(String nome) {
			Nome = nome; 
		}
		
		
		
	
	public String getCognome () {
		return Cognome;
	}
	
	
	public void setCognome(String cognome) {
		Cognome = cognome; 
	}
	
		
		
	
	public int getAnalisi () {
		return voto_Analisi;
	}
	
	
	public void setAnalisi(int analisi) {
		voto_Analisi = analisi; 
	}
	
		
	
	
	public int getInformatica () {
		return voto_Informatica;
	}
	
	
	public void setInformatica(int informatica) {
		voto_Informatica = informatica; 
	}
		
	
	public int getFisica () {
		return voto_Fisica;
	}
	
	
	public void setFisica(int fisica) {
		voto_Fisica = fisica; 
	}
		
	
	
		public void identita() {

			System.out.println("voto_Analisi " + voto_Analisi);
			System.out.println("voto_Fisica " + voto_Fisica);
			System.out.println("voto_Informatica " + voto_Informatica);
		}
		
		public void calcoloMedia() {
			media = (voto_Analisi + voto_Fisica + voto_Informatica) / 3;
			System.out.println("media " + media);
		
				
		}
		
	}

