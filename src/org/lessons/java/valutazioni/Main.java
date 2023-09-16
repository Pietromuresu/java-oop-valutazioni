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
			
			// Stampo il totale dei promossi
			System.out.println("Totale promossi: " + totPromossi);
			
			// stampo gli id degli studenti promossi e bocciati
			System.out.println("\n Promossi ids: ");
			for(int i = 0; i<promossi.length; i++) {
				System.out.println(promossi[i].id);
			}
			System.out.println("\n Bocciati ids: ");
			for(int i = 0; i<bocciati.length; i++) {
				System.out.println(bocciati[i].id);
			}
			
			
		
		
		
		
		
		
	}
}
