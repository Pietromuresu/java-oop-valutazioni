package org.lessons.java.valutazioni;

import java.util.Random;

public class Main {
	
	public static void main(String[] args) {
		
		
		Random rand = new Random();
		Studente[] studenti = new Studente[20];
		
		int lunghezzaPromossi = 0;
		int lunghezzaBocciati = 0;
		
		int totPromossi = 0;
		
		// Popolo l'array di studenti con dati random 
		for(int i = 1; i < studenti.length + 1; i++) {
	
			studenti[i -1] = new Studente(i, rand.nextInt(0, 101), rand.nextFloat(0, 5.01f));
			studenti[i -1].showDatas();
			// Conto il totale dei promossi e la
			if(studenti[i - 1].hasFailed().equals("Promosso")) {
				
				lunghezzaPromossi++;
				totPromossi++; 
			}else {
				
				lunghezzaBocciati++;
			}
			
		}
		
		// Creo gli array per i promossi e bocciati e inizializzo gli indici
			int indicePromossi = 0;
			int indiceBocciati = 0;
			Studente[] promossi = new Studente[lunghezzaPromossi]; 
			Studente[] bocciati = new Studente[lunghezzaBocciati];
			
			for(int i = 0; i < studenti.length; i++) {
				
				if(studenti[i].hasFailed().equals("Promosso")){
					
					promossi[indicePromossi] = studenti[i];
					indicePromossi++;
				}else {
					bocciati[indiceBocciati] = studenti[i];
					indiceBocciati++;
				}
			}
			
			int idStudentePeggiore = 0;
			float votoStudentePeggiore = 5f;
			int idStudenteMigliore = 0;
			float votoStudenteMigliore = 0f;
			
			// Stampo il totale dei promossi
			System.out.println("Totale promossi: " + totPromossi);
			
			System.out.println("--------------------------------------");
			
			// stampo gli id degli studenti promossi e bocciati
			
			System.out.println("\n Promossi ids: ");
			for(int i = 0; i < promossi.length; i++) {
			// Controllo che lo studente tra i promossi ad indice `i` abbia il voto migliore di quello precedente 
			// se dovesse risultare vero lo studenteMiglore diventa quello in questione
				if(promossi[i].avgVoti > votoStudenteMigliore) {
					votoStudenteMigliore = promossi[i].avgVoti;
					idStudenteMigliore = promossi[i].id;
				}
				
				System.out.print(promossi[i].id + ", ");
			}
			
			// Faccio la stessa cosa che ho fatto per i promossi però in questo caso cerco lo studente con il voto più basso 
			System.out.println("\n Bocciati ids: ");
			for(int i = 0; i < bocciati.length; i++) {
				
				if(bocciati[i].avgVoti < votoStudentePeggiore) {
					votoStudentePeggiore = bocciati[i].avgVoti;
					idStudentePeggiore = bocciati[i].id;
				}
				System.out.print(bocciati[i].id + ", ");
			}
			
			System.out.println("\n--------------------------------------");
			System.out.print("\n Miglior Studente: " + idStudenteMigliore);
			System.out.print("\n Peggior Studente: " + idStudentePeggiore);
			
			
			
		
		
		
		
		
	}
}
