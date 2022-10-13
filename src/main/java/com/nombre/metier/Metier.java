package com.nombre.metier;

public class Metier {
	
	private int nombre;
	private boolean fin = false;
	
	
	public void generersecret() {
		nombre = (int)(Math.random()*100);
	}
	
	public String jouer(int nb) {
		if(!fin) {
			if(nb>nombre) {
				return "le nombre est plus grand";
			}
			else if(nb<nombre) {
				return "le nombre est plus petit";
			}
			else {
				fin =true;
				return "Bravo vous aveez trouver le nombre";
			}
			
		}
		else {
			return "le jeu est terminer";
		}
	}
	
}
