package org.lessons.java.valutazioni;

import java.util.Random;

public class Main {
	
	public static void main(String[] args) {
		
		
		Random rand = new Random();
		Studente[] students = new Studente[20];
		int totPromossi = 0;
		for(int i = 1; i < students.length + 1; i++) {
	
			students[i -1] = new Studente(i, rand.nextInt(0, 101), rand.nextFloat(0, 5.1f));
			students[i -1].showDatas();
			if(students[i - 1].hasFailed().equals("Promosso")) {
				totPromossi++;
			}
		}
		
		System.out.println("Totale promossi: " + totPromossi);
	}
	
	
}
