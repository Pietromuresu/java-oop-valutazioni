package org.lessons.java.valutazioni;

public class Studente {
	
	public int id;
	public int assenze;
	public float avgVoti;

	public Studente(int id, int assenze, float avgVoti) {
		this.id = id;
		this.assenze = assenze;
		this.avgVoti = avgVoti;
	}

	public String hasFailed() {
		
		boolean bocciato = false;
		
		if(this.assenze > 50) {
			bocciato = true;
		}
		
		if(this.assenze < 50 && this.assenze > 25) {
			if(this.avgVoti > 2) {

				bocciato = false;
				
			}else {
				
				bocciato = true;
			}
		}
		
		if(this.assenze < 25 && this.avgVoti >= 2) {
			bocciato = false;
		}
		
		return bocciato ? "Bocciato" : "Promosso";
	}
	
	
	public void showDatas() {
		System.out.println("--------------------------------------");
		System.out.println("id: " + this.id);
		System.out.println("Assenze: " + this.assenze + "%");
		System.out.println("Media Voti: " + String.format("%.02f", this.avgVoti) + "/5");
		System.out.println(this.hasFailed());
		System.out.println("--------------------------------------");
		
	}
}
